package com.lms.service;

import java.util.List;

import com.lms.entity.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book updateBook(int id, Book updatedBook);
	
	public void deleteBook(int id);
	
	

}
