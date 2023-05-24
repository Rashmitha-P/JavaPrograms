package com.bookapp.main;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService ibookservice = new BookServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter author name");
		String author=sc.next();
		
		List<Book> books=ibookservice.getByAuthor(author);
for(Book book:books)
{System.out.println(book);
	}
System.out.println("--------------------------");
System.out.println("enter category");
String category=sc.next();
List<Book> booksbycategory=ibookservice.getByCategory(category);
for(Book book:booksbycategory)
{System.out.println(book);
	}
System.out.println("--------------------------");
System.out.println("get all the details of books");
List<Book> booksall=ibookservice.getAll();
System.out.println(booksall);

System.out.println("--------------------------");
System.out.println("Enter id to get Details");
List<Book> bookdetails=ibookservice.getAll();
Optional<Book> bookbyId=ibookservice.getById(2);
System.out.println(bookbyId);


}
}