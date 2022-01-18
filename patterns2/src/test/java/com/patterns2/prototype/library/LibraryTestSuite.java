package com.patterns2.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("Library 1");
        Book book1 = new Book("A Game of Thrones", "George R.R. Martin", LocalDate.of(1996, 8, 1));
        Book book2 = new Book("A Clash of Kings", "George R.R. Martin", LocalDate.of(1998, 11, 16));
        Book book3 = new Book("A Storm of Swords", "George R.R. Martin", LocalDate.of(2000, 8, 8));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        // making a shallow clone of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        // making a deep copy of object library
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When;
        library.getBooks().remove(book3);

        // Then
        System.out.println("Size of library " + library.getBooks().size());
        System.out.println(library);
        System.out.println("Size of cloned library " + cloneLibrary.getBooks().size());
        System.out.println(cloneLibrary);
        System.out.println("Size of deep copy library " + deepCopyLibrary.getBooks().size());
        System.out.println(deepCopyLibrary);
        Assertions.assertEquals(2, cloneLibrary.getBooks().size());
        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(3, deepCopyLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks().size(), cloneLibrary.getBooks().size());
        Assertions.assertNotEquals(library.getBooks().size(), deepCopyLibrary.getBooks().size());
    }
}
