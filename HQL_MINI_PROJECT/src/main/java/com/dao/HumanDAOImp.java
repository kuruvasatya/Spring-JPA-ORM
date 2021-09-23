package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.FourWheeler;
import com.entity.Human;
import com.entity.TwoWheeler;
import com.entity.Vehicle;

public class HumanDAOImp implements HumanDAO {
	SessionFactory factory = new Configuration()
									.configure()
									.addAnnotatedClass(Human.class)
									.addAnnotatedClass(Vehicle.class)
									.addAnnotatedClass(TwoWheeler.class)
									.addAnnotatedClass(FourWheeler.class)
									.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tran;

	public void insert(Human human) {
		tran = session.beginTransaction();
		session.save(human);
		tran.commit();
	}
	
	public void insert(Vehicle vehicle) {
		tran = session.beginTransaction();
		session.save(vehicle);
		tran.commit();
	}

	public Human get(String id) {
		tran = session.beginTransaction();
		return session.get(Human.class, id);
	}
	
	public List<Object[]> getData() 
	{
		tran = session.beginTransaction();
		Query query = session.createQuery("select h.id, h.name, v.brand "
				+ "from Human h inner join h.vehicle v");
		return query.list();
	}

}
