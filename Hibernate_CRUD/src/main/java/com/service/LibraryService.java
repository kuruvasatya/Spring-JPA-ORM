package com.service;

import com.dao.BookDAOImp;
import com.entity.Book;

public class LibraryService {
	
	BookDAOImp service = new BookDAOImp();
	public void add(Book book)
	{
		if(service.create(book))
			System.out.println("Book added successfully");
		else
			System.out.println("failed to add book");
	}
	
	public void remove(int isbn)
	{
		if(service.delete(isbn))
			System.out.println("Book removed successfully...");
		else
			System.out.println("failed to remove book");
	}
	
	public void update(int isbn, String name)
	{
		if(service.update(isbn, name))
			System.out.println("Book updated successfully...");
		else
			System.out.println("failed to update book");
	}
	
	public void get(int isbn)
	{
		Book book = service.read(isbn);
		System.out.println(book);
	}

}
