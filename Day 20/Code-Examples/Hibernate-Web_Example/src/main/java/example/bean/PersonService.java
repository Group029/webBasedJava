package example.bean;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Person;
import example.hibernate.annotation.utilities.HibernateUtils;

public class PersonService {
	public static void createNewPerson(Person p) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		try(Session ss = factory.openSession()){
			
			Transaction tx = ss.beginTransaction();
				ss.save(p);
			tx.commit();			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Person created");
	}

}
