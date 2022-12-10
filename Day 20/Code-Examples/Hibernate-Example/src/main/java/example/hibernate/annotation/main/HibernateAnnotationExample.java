package example.hibernate.annotation.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Person;
import example.hibernate.annotation.utilities.HibernateUtils;

public class HibernateAnnotationExample {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		try(Session ss = factory.openSession()){
			LocalDate birthDate = 	LocalDate.of(1968, 12, 20);
			Person person = new Person(101, "Madhuri Dixit", "madhuri@gmail.com", birthDate);
			Transaction tx = ss.beginTransaction();
				ss.save(person);
			tx.commit();			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Record added.");

	}

}
