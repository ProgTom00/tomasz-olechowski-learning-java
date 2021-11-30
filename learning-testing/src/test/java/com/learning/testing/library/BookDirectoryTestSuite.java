package com.learning.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 1; i <= booksQuantity; i++) {
            Book theBook = new Book("Title" + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDataBase libraryDataBaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDataBaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());


    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDataBaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDataBaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDataBaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        // LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);

        // When
        List<Book> theListOfBook10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBook10.size());
        verify(libraryDataBaseMock, times(0)).listBooksWithCondition(anyString());

    }
}
