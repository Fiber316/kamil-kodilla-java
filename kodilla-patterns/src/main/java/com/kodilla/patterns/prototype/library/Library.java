package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            clonedLibrary.getBooks().add(book);
        }
        return clonedLibrary;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public void setName(String name) {
        this.name = name;
    }

}