package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.Book;
import com.lms.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	private BookRepository br;
	
	
	@Autowired
	public BookServiceImpl(BookRepository br) {
		super();
		this.br = br;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public Book updateBook(int id, Book updatedBook) {
		Book book = br.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
		book.setTitle(updatedBook.getTitle());
		book.setAuthor(updatedBook.getAuthor());
		book.setIsbn(updatedBook.getIsbn());
		book.setGenre(updatedBook.getGenre());
		return br.save(book);
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		br.deleteById(id);
	}

	

}
