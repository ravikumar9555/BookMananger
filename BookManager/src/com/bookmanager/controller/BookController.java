package com.bookmanager.controller;

import java.util.List;

import com.bookmanager.BookEntities;


public interface BookController {
	

	public void addBook(BookEntities book);

	public void removeBook(int index);

	public BookEntities getBook(int index);

	public List<BookEntities> getAllBook();

	public void updateBook(int index, String bookName, String title);

}
