package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Library")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int isbn;
	@Column(name = "Name", length = 30, unique = true)
	String name;
	@Column(name = "Author", length = 30, nullable = false)
	String author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + "]";
	}

}
