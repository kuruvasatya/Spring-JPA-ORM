package com.pojo;



import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Address add1 = new Address();
		add1.setCity("bangalore");
		add1.setPincode("560048");
		
		Address add2 = new Address();
		add2.setCity("kurnool");
		add2.setPincode("517102");
		
		Employee e = new Employee();
		e.setEmpId(4);
		e.setEmpName("ganesh");
		e.getListOfAddress().add(add1);
		e.getListOfAddress().add(add2);
		
		session.save(e);
		
		tran.commit();
		

	}

}
