package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {
BookDetails bookdetail=new BookDetails();

	@Override
	public List<Book> getAll() {
		List<Book> allBooks=BookDetails.showBooks();
		return allBooks ;
	}

	@Override
	public List<Book> getByAuthor(String author) {
	List<Book> allBooks=BookDetails.showBooks();
	List<Book> getBooksbyAuthor=allBooks.stream()
			.filter(getauthor->getauthor.getAuthor().equals(author))
			.collect(Collectors.toList());
		return  getBooksbyAuthor;
	}

	@Override
	public Optional<Book> getById(int bookId) {
		List<Book> allBooks=BookDetails.showBooks();
		Optional <Book> getBookId=allBooks.stream()
				.filter(getId->((Integer)getId.getBookId()).equals((Integer)bookId))
.findAny();
		return getBookId;
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> allBooks=BookDetails.showBooks();
		List<Book> getBooksbyCategory=allBooks.stream()
				.filter(getcategory->getcategory.getCategory().equals(category))
				.collect(Collectors.toList());
		return getBooksbyCategory;
	}

	
}
