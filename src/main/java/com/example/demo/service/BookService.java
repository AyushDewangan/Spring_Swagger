package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository; 
	
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "saved with id"+book.getBookId();
	}
	
	public Book getBook(int bookId) {
		return bookRepository.findById(bookId).get();
	}
	
	public List<Book> removeBook(int bookId){
		bookRepository.deleteById(bookId);
		return bookRepository.findAll();
	}
}
