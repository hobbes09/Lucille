package com.zinute.lucille.experiments;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zinute.lucille.data.models.Profile;

public class DbExperiments {

	public static void main(String[] args) {
		
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

}
