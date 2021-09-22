package com.joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		vehicle veh = new vehicle();
		veh.setName("public");
		veh.setWheels(4);

		TwoWheeler tw = new TwoWheeler();
		tw.setName("bike");
		tw.setWheels(2);
		tw.setSteeringHandle("japan");

		FourWheeler fw = new FourWheeler();
		fw.setName("Bus");
		fw.setWheels(8);
		fw.setSteringWheel("USA");

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(vehicle.class)
				.addAnnotatedClass(TwoWheeler.class).addAnnotatedClass(FourWheeler.class).buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		session.save(veh);
		session.save(tw);
		session.save(fw);
		tran.commit();

	}
}
