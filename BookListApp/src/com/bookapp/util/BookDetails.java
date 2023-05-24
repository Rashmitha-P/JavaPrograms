package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
 public static List<Book> showBooks() {
List<Book> books=Arrays.asList(
	 new Book("Java","Kathy",1,800,"tech"),
	new Book("Spring in action","John",2,900,"tech"),
	 new Book("Life After Life","Robert",3,600,"Fiction"),
	new Book("LeaderShip","Kathy",4,8000,"SelfHelp"),
	 new Book("5AmClub","Kathy",5,400,"SelfHelp"));
	 return books;
 }
}
