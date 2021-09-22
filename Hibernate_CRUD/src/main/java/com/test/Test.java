package com.test;

import com.entity.Book;
import com.service.LibraryService;

public class Test {

	public static void main(String[] args) {

		LibraryService ls = new LibraryService();

		Book book = new Book("python", "ganes");
		ls.add(book);
		
		ls.get(2);
		
		ls.update(1, "Scala");

		ls.get(1);
		
	}

}
