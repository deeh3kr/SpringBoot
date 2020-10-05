package com.springproject.firstspringproject.controller;

import java.util.List;
import java.util.Optional;

import com.springproject.firstspringproject.entities.Book;
import com.springproject.firstspringproject.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javassist.bytecode.stackmap.BasicBlock.Catch;


@RestController
public class TestController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	// public List<Book> getBooks()
	public ResponseEntity<List<Book> > getBooks()
	{
		// Book book = new Book();
		// book.setId(1);
		// book.setAuthor("Deepanshu");
		// book.setTitle("Java");
		// return book;

		List<Book> list = this.bookService.getAllBooks();
		if(list.size() <= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return ResponseEntity.status(HttpStatus.CREATED).body(list);

	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") int id)
	{
		Book book = null;
		try{
			book = this.bookService.getSingleBook(id);
			return ResponseEntity.of(Optional.of(book));
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
	}

	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book b)
	{
		Book book = null;
		try{
			book = this.bookService.addBook(b);
			return ResponseEntity.of(Optional.of(book));
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

		
	}

	@DeleteMapping("/books/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id)
	{
		try{
			this.bookService.deleteBook(id);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("id") int id)
	{
		Book b = null;
		try{
			b = this.bookService.updateBook(book, id);
			return ResponseEntity.of(Optional.of(b));
		}catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}


}
