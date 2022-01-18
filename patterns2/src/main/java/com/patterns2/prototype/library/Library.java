package com.patterns2.prototype.library;

import com.patterns2.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneBoard = super.clone();
        cloneBoard.books = new HashSet<>();
        for (Book theBook : books) {
            cloneBoard.getBooks().add(theBook);
        }
        return cloneBoard;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (Book theBook : books) {
            s = s + theBook.toString() + "\n";
        }
        return s;
    }
}
