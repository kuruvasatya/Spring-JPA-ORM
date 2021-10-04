package OneToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
										.configure()
										.addAnnotatedClass(Student.class)
										.addAnnotatedClass(Laptop.class)
										.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction;
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		
		l1.setSerNo(1);
		l1.setName("Hp pavilion");

		l2.setSerNo(2);
		l2.setName("Dell");
			
		l3.setSerNo(3);
		l3.setName("assus");
		
		s1.setRollNo(5);
		s1.setName("Ganesh");
		s1.getLaptop().add(l1);
		s1.getLaptop().add(l2);
		
		s2.setRollNo(6);
		s2.setName("ripesh");
		s2.getLaptop().add(l3);
		
		transaction = session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(s1);
		session.save(s2);
		transaction.commit();
		session.close();
		
		session = factory.openSession();
		transaction = session.beginTransaction();
		
		Student ss1 = session.get(Student.class, 5);
		//System.out.println(ss1);
		
//		Student ss2 = session.get(Student.class, 6);
//		System.out.println(ss2);
		
		transaction.commit();
		

	}

}
