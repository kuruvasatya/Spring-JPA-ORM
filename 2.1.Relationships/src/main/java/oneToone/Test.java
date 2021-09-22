package oneToone;


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
		
		transaction = session.beginTransaction();
		
		Laptop l = new Laptop();
		l.setSerNo(1);
		l.setName("Hp pavilion");
		
		Student s = new Student();
		s.setRollNo(3);
		s.setName("Ganesh");
		s.setLaptop(l);
		
		
		session.save(s);
		session.save(l);
		System.out.println("I am here");
		System.out.println(session.get(Student.class, 3));
		transaction.commit();
		

	}

}
