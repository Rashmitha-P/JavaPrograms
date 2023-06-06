package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner {

	
	
	
	
public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}
@Autowired
private IBookService bookService;
@Override
public void run(String... args) throws Exception {
	Book book=new Book();
	book.setTitle("Java in action");
	book.setAuthor("John");
	book.setCategory("Tech");
	book.setPrice(2000);
//	bookService.addBook(book);
	
// bookService.updateBook(4,4000);
	
//	bookService.deleteBook(7);
	
//bookService.getByCategory("Tech")
	
//.(forEach(System.out::println);
	
//	bookService.getByAuthorStarting("S")
//	.forEach(System.out::println);
	
//bookService.getById(101).forEach(System.out::println);
	
//	bookService.getByPriceLessThan(7000).forEach(System.out::println);;
	
//bookService.getByTitleContaining("Java").forEach(System.out::println);

	

	
}

}
