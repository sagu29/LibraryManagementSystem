package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.Book;
import com.lms.service.BookService;

@RestController
public class BookController {
	private BookService bs;
	
	@Autowired
	public BookController(BookService bs) {
		super();
		this.bs = bs;
	}
	
	
	@GetMapping("/Books")
     public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<List<Book>> (bs.getAllBooks(),HttpStatus.OK);
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {
        return new ResponseEntity<Book> (bs.updateBook(id, book), HttpStatus.OK);
    }
	
	@DeleteMapping("/Books/{id}")
    public void deleteBook(@PathVariable int id) {
        bs.deleteBook(id);
    }
}
