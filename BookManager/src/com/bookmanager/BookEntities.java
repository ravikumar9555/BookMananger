package com.bookmanager;

public class BookEntities {

	private long bookId;
	private String bookName;
	private String title;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookEntities(long bookId, String bookName, String title) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.title = title;
	}
	public BookEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
