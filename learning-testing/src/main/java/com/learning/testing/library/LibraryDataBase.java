package com.learning.testing.library;

import java.util.List;

public interface LibraryDataBase {

    List<Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book fro libraryUser
    // return true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by LibraryUser to the library
    // returns number of books returned beck
    int returnBooks(LibraryUser libraryUser);
}
