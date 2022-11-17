package com.book;
import java.util.Arrays;

public class Book {
	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;

	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = validateCategory(category);
		this.price = validatePrice(price);
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	private String  validateCategory(String category) throws InvalidBookException {
		if(Arrays.asList("Science", "Fiction", "Technology" ,"Others").contains(category)) {
			return category;
		}
		
		 throw new InvalidBookException("Invalid Category");
	}
	
	private float  validatePrice(float price) throws InvalidBookException {
		if(price<0)
		 throw new InvalidBookException("Invalid Price");
		return price;
	}
	
		private String  validateBookId(String bookId) throws InvalidBookException {
		if(bookId.startsWith("B")||bookId.length()>4)
		 throw new InvalidBookException("Invalid BookId");
		return bookId;
	}
}
