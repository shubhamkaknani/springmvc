package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnect {

	SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Apple.class)
			.buildSessionFactory();

	List<Apple> list = new ArrayList<>();

	public List<Apple> getList() {
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			list = session.createQuery("from apple").getResultList();
			session.close();
		} catch (Exception e) {

			System.out.println("Error ocurred");
		}
		return list;

	}

}
