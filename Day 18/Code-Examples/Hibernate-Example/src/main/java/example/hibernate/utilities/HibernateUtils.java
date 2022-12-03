package example.hibernate.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory hibernateSessionFactory;	
	static {
		Configuration conf = new Configuration();
		conf = conf.configure();
		hibernateSessionFactory = conf.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return hibernateSessionFactory;
	}
		
	

}
