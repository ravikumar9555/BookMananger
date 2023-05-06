package com.bookmanager.controller.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookmanager.BookEntities;
import com.bookmanager.controller.BookController;



public class BookControllerImpl implements BookController{

	private List<BookEntities> books;
	
	public BookControllerImpl(){
		books=new ArrayList<>();
	}
	@Override
	public void addBook(BookEntities book) {
	books.add(book);
		
	}

	@Override
	public void removeBook(int index) {
		// TODO Auto-generated method stub
		books.remove(index);
	}

	@Override
	public BookEntities getBook(int index) {
		
		return books.get(index);
	}

	@Override
	public List<BookEntities> getAllBook() {
		
		return books;
	}

	@Override
	public void updateBook(int index, String bookName, String title) {
	BookEntities book=	books.get(index);
	book.setBookName(bookName);
	book.setTitle(title);
		
	}

}
