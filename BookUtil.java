package com.book;

public class BookUtil {
	
	public static void main(String argv[]) throws InvalidBookException {
		Book book1=new Book("book1", "title1", "author1", "Science", 220);
		Book book2=new Book("book2", "title2", "author2", "Fiction", 220);
		Book book3=new Book("book3", "title3", "author3", "Technology", 220);
		
		BookStore bookStore=new BookStore();
		bookStore.addBook(book1);
		bookStore.addBook(book2);
		bookStore.addBook(book3);
		
		bookStore.displayAll(bookStore.getBooks());
		
		bookStore.searchAuthor("author2");
		bookStore.searchByTitle("title");
	}

}

