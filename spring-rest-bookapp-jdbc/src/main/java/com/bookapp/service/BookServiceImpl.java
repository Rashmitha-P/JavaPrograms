package com.bookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
@Service
public class BookServiceImpl implements IBookService{
IBookRepository bookRepository;
	

	public BookServiceImpl(IBookRepository bookRepository) {
	super();
	this.bookRepository = bookRepository;
}

	@Override
	public List<Book> getAll() throws BookNotFoundException {
	List	<Book> book=bookRepository.findAll();
		if(book.isEmpty())
		throw new BookNotFoundException("Book not found");
		return book;
		
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		Book book=bookRepository.findById(bookId);
		if(book==null)
			throw new BookNotFoundException("Invalid Id");
	return	book;
		
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
	List	<Book>book=bookRepository.findByCategory(category);
		if(book.isEmpty())
			throw new BookNotFoundException(" category not matched");
		return book;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=bookRepository.findByPriceLessThan(price);
		if(books.isEmpty())
			throw new BookNotFoundException("price not matched");
		return books;
	}

	@Override
	public List<Book> getByTitleContaining(String title,String category) throws BookNotFoundException {
		List<Book> book=bookRepository.findByTitleContaining(title,category);
		if(book.isEmpty())
		throw new BookNotFoundException("Title not matched");
		return book;
	}

	@Override
	public List<Book> getByAuthorStarting(String author) throws BookNotFoundException {
	List<Book> book=bookRepository.findByAuthorStarting(author);
	if(book.isEmpty())
	throw new BookNotFoundException(" Author not matched");
		return book;
	}

	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookRepository.updateBook(bookId, price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
		
	}

	

}
