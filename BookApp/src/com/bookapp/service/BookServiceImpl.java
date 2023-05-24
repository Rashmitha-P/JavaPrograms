package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public Book[] getAll() {
		Book[] books = BookDetails.showBooks();
		return books;
	}

	@Override
	public Book[] getByAuthor(String author) {
		Book[] books = BookDetails.showBooks();
		int count = 0;
		for (Book book : books) {
			if (author.equals(book.getAuthor())) {
				count++;
			}
		}
		Book[] bookByAuthor = new Book[count];
		int i = 0;
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				bookByAuthor[i++] = book;
			}
		}
		return bookByAuthor;
	}

	@Override
	public Book getById(int bookId) {
		Book[] books = BookDetails.showBooks();
		Book bookById = new Book();
		for (Book book : books) {
			if (book.getBookId() == bookId)
				;
			bookById = book;
			break;
		}
		return bookById;
	}

	@Override
	public Book[] getByCategory(String category) {
		Book[] books = BookDetails.showBooks();
		int count = 0;
		for (Book book : books) {
			if (book.getCategory().equals(category))
				count++;
		}
		int i = 0;
		Book[] bookbycategory = new Book[count];
		for (Book book : books) {
			if (book.getCategory().equals(category))
				bookbycategory[i++] = book;
		}
		return bookbycategory;
	}

}
