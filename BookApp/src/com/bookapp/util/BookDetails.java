package com.bookapp.util;

import com.bookapp.model.Book;

public class BookDetails {
 public static Book[] showBooks() {
	 Book[] books=new Book[5];
	 books[0]=new Book("Java","Kathy",1,800,"tech");
	 books[1]=new Book("Spring in action","John",2,900,"tech");
	 books[2]=new Book("Life After Life","Robert",3,600,"Fiction");
	 books[3]=new Book("LeaderShip","Kathy",4,8000,"SelfHelp");
	 books[4]=new Book("5AmClub","Kathy",5,400,"SelfHelp");
	 return books;
 }
}
