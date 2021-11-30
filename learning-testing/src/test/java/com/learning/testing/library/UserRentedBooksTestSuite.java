package com.learning.testing.library;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

@DisplayName("Tests of the number of books owned by the Library User")
public class UserRentedBooksTestSuite {

    @Mock
    private LibraryDataBase libraryDataBaseMock;

    @Test
    void testUserHasNoRentedBooks() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListEmptyBooks = new ArrayList<>();
        LibraryUser libraryUser = new LibraryUser("John", "Smith", "92042212396");
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListEmptyBooks);

        // When
        List<Book> theListOfRentedBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        // Then
        assertEquals(0, theListOfRentedBooks.size());

    }

    @Test
    void testUserHasRentedOneBook() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultList1Book = new ArrayList<>();
        Book book1 = new Book("book1", "author", 1970);
        resultList1Book.add(book1);
        LibraryUser libraryUser = new LibraryUser("John", "Smith", "92042212396");
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultList1Book);

        // When
        List<Book> theListOfRentedBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        // Then
        assertEquals(1, theListOfRentedBooks.size());

    }

    @Test
    void testUserHasRentedFiveBooks() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultList5Books = new ArrayList<>();

        Book book1 = new Book("book1", "author", 1970);
        Book book2 = new Book("book2", "author2", 1971);
        Book book3 = new Book("book3", "author3", 1972);
        Book book4 = new Book("book4", "author4", 1973);
        Book book5 = new Book("book5", "author5", 1974);

        resultList5Books.add(book1);
        resultList5Books.add(book2);
        resultList5Books.add(book3);
        resultList5Books.add(book4);
        resultList5Books.add(book5);

        LibraryUser libraryUser = new LibraryUser("John", "Smith", "92042212396");
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultList5Books);

        // When
        List<Book> theListOfRentedBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        // Then
        assertEquals(5, theListOfRentedBooks.size());
    }
}
