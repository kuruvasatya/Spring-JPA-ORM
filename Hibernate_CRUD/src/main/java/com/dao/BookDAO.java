package com.dao;

import com.entity.Book;

public interface BookDAO {
	
	public boolean create(Book book);
	public Book read(int isbn);
	public boolean update(int isbn, String name);
	public boolean delete(int isbn);
	
}
