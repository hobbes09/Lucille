package com.zinute.lucille.experiments;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zinute.lucille.data.db.SessionManager;
import com.zinute.lucille.data.models.Profile;
import com.zinute.lucille.data.models.TestTable;

public class DbExperiments {

	public static void main(String[] args) {
		
		insertTest();

	}
	
	public static void insertTest(){
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Profile p = new Profile("test@zinute.com", "Mr", "Test", "User", 
				"Test User", "myEncryptedPassword", false, "I", "street_address", 
				"KA", "Bangalore", new Date(), null, "KA", null, null, null,
				null, null, null, 1010, null, 1234567890L, null, 101010L, null, false, false, null,
				new Date(), new Date());
		
		session.save(p);

		session.getTransaction().commit();
		session.close();
		
	}
	
	public static void insertTest1(){
		
		System.out.println("Maven + Hibernate Annotation + Postgres");
		Session session = SessionManager.getSessionFactory().openSession();

		session.beginTransaction();
		
		TestTable tt = new TestTable("test-entry-11", 2, new Date());

		session.save(tt);
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Done");
		
	}

	public static void insertTest2(){
		
		System.out.println("Maven + Hibernate Annotation + Postgres");
		Session session = SessionManager.getSessionFactory().openSession();

		session.beginTransaction();
		
		TestTable tt = new TestTable("test-entry-2", 2, new Date());
		
		session.save(tt);
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Done");
		
	}

}
