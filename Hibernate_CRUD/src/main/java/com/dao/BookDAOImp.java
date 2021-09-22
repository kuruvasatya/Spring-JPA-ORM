package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Book;

public class BookDAOImp implements BookDAO {

	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Book.class).buildSessionFactory();
	Session session;
	Transaction tran;

	public boolean create(Book book) {
		session = factory.openSession();
		tran = session.beginTransaction();
		
		try {
			session.save(book);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("Failed to saved data into data base..." + e);
			return false;
		} finally {
			session.close();
		}
	}

	public Book read(int isbn) {
		session = factory.openSession();
		try {
			return session.get(Book.class, isbn);
		} catch(Exception e) {
			System.out.println("Failed to read data from database....");
			return null;
		} finally {
			session.close();
		}
	}

	public boolean update(int isbn, String name) {
		session = factory.openSession();
		tran = session.beginTransaction();
		try {
			Book book = session.get(Book.class, isbn);
			book.setName(name);
			session.update(book);
			tran.commit();
			return true;
		} catch(Exception e) {
			System.out.println("Failed to update data into database....");
			return false;
		} finally {
			session.close();
		}
	}

	public boolean delete(int isbn) {
		session = factory.openSession();
		tran = session.beginTransaction();
		try {
			Book book = session.get(Book.class, isbn);
			session.update(book);
			tran.commit();
			return true;
		} catch(Exception e) {
			System.out.println("Failed to delete data from database....");
			return false;
		} finally {
			session.close();
		}
	}

}
