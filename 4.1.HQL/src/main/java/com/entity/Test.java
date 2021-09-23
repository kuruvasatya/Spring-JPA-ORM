package com.entity;

import java.util.List;
import java.util.Random;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();

		Random random = new Random();

		// 1. Creating employee objects and saving it into db
		for (int i = 1; i <= 50; i++) {
			Employee e = new Employee();
			e.setId(i);
			e.setName("Name " + i);
			e.setMarks(random.nextInt(100));
			session.save(e);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		// 2. query to fetch all the details from the table
		Query query1 = session.createQuery("from Employee");
		List<Employee> employees1 = query1.list();
		for (Employee e : employees1) {
			System.out.println(e);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		//3. query to print all the details from the database with pagination
		Query query2 = session.createQuery("from Employee");
		query2.setFirstResult(5);
		query2.setMaxResults(10);
		List<Employee> employees2 = query2.list();
		for (Employee e : employees2) {
			System.out.println(e);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		// 4. Retrieve specific columns
		Query query3 = session.createQuery("select name from Employee");
		List<Object[]> employees = query3.list();
		for (Object e : employees) {
			System.out.println(e);
		}

		System.out.println("---------------------------------------------------------------------------------------");
		// 5. query to use where clause
		int threshold = 32;
		Query query4 = session.createQuery("from Employee e where e.marks > :t order by marks");
		query4.setParameter("t", threshold);
		List<Employee> e2 = query4.list();
		for (Employee e : e2) {
			System.out.println(e);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		// 6. aggregate functions
		Query query5 = session.createQuery("select avg(marks) from Employee");
		double avg = (Double) query5.getSingleResult();
		System.out.println(avg);
		tran.commit();
		session.close();
	}
}
