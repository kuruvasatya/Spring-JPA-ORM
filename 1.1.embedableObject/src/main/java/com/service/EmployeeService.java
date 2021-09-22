package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee;

public class EmployeeService {
	
	SessionFactory factory =new Configuration()
								.configure()
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tran;
	
	public void insert(Employee emp)
	{
		tran = session.beginTransaction();
		session.save(emp);
		tran.commit();
		System.out.println("Inserted record...");
	}
	
	public Employee getEmployee(int i)
	{
		Employee e;
		tran = session.beginTransaction();
		e = session.get(Employee.class, i);
		tran.commit();
		return e;
	}

}
