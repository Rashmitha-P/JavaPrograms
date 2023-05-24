package com.bookapp.main;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService ibookservice = new BookServiceImpl();
		System.out.println("All book details");
		Book[] allbooks = ibookservice.getAll();
		for (Book albooks : allbooks)
			System.out.println(albooks);
		System.out.println("-------------------");
		System.out.println("book by author");
		Book[] bookauthor = ibookservice.getByAuthor("kathy");
		for (Book bookauthr : bookauthor)
			System.out.println(bookauthr);
		System.out.println("-------------------");
		System.out.println("book by id");
		Book bookid = ibookservice.getById(1);
		System.out.println(bookid);
		System.out.println("-------------------");
		System.out.println("book by category");
		Book[] bookcategory = ibookservice.getByCategory("tech");
		for (Book bookbycategory : bookcategory)
			System.out.println(bookbycategory);

	}

}
