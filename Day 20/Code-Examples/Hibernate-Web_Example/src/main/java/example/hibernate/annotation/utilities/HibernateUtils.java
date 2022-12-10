package example.hibernate.annotation.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.annotation.entity.Person;

public class HibernateUtils {
	private static SessionFactory hibernateSessionFactory;	
	static {
		Configuration conf = new Configuration();
		conf = conf.configure();
		conf.addAnnotatedClass(Person.class);
		hibernateSessionFactory = conf.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return hibernateSessionFactory;
	}
		
	

}
