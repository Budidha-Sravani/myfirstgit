package com.book;


import java.util.ArrayList;
import java.util.List;

public class BookStore {
  private List<Book> books=new ArrayList();
  
  public void addBook(Book book) {
	  books.add(book);
  }
  
  public Book searchByTitle(String title) {
	  for(int i=0;i<books.size();i++) {
		  Book book=books.get(i);
		  if(title.equals(book.getTitle())) {
			  return book;
		  }
	  }
	  return null;
  }
  
  public Book searchAuthor(String author) {
	  for(int i=0;i<books.size();i++) {
		  Book book=books.get(i);
		  if(author.equals(book.getAuthor())) {
			  return book;
		  }
	  }
	  return null;
  }
  
  public void displayAll(List<Book> books) {
	  for(int i=0;i<books.size();i++) {
		  Book book=books.get(i);
		 System.out.print(book.getAuthor());
	  }
  }

public List<Book> getBooks() {
	return books;
}
  
}
