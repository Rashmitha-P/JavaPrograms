package com.bookapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;
@Service
public class IBookServiceIMPL  implements IBookService{
BookDetails details;

	public IBookServiceIMPL(BookDetails details) {
	super();
	this.details = details;
}

	@Override
	public List<Book> getAll() {
		
		return details.showBooks();
	}

	@Override
	public Book getById(int bookId) {
		return details.showBooks()
		.stream()
		.filter(book->(book.getBookId()==bookId))
		.findFirst()
		.orElseThrow(()->new BookNotFoundException("Invalid Id"));
//		this u can use
//		return details.showBooks()
//				.stream()
//				.filter(book->(book.getBookId()==bookId))
//				.findAny()
//				.get();	

		
		
		//this is 1 way	dont use 		
//		Optional <Book> bookopt=details.showBooks()
//		.stream()
//		.filter(book->(book.getBookId()==bookId))
//		.findFirst();
//		if(bookopt.isPresent())
//		return bookopt.get();
//		else throw new BookNotFoundException();
	}

	@Override
	public List<Book> getByCategory(String category) {
		
		return details.showBooks()
				.stream()
				.filter(book->book.getCategory().equals(category))
				
                .collect(Collectors.toList())
                ;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) {
	
		return details.showBooks() 
				.stream()
			.filter(book->(book.getPrice()<price))
//			.sorted((b1,b2)->((Double)b1.getPrice()).compareTo((Double)b2.getPrice(price)))
					.collect(Collectors.toList());
	}

	@Override
	public List<Book> getByTitleContaining(String title) {
		
		return details.showBooks()
				.stream()
				.filter(book->book.getTitle().contains(title))
//				.sorted(Comparator.comparing(book->{
//					return book.getTitle();
//						}))
//				.sorted(Comparator.comparing(book->book.getTitle()))
				.sorted(Comparator.comparing(Book::getTitle).reversed())
				.collect(Collectors.toList());
	}			
				
				
	

	@Override
	public List<Book> getByAuthorStarting(String author) {
		
		return details.showBooks()
				.stream()
				.filter(book->book.getAuthor().startsWith(author))
				.collect(Collectors.toList());
								
	}

}
