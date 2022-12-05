package example.hibernate.main;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Article;
import example.hibernate.utilities.HibernateUtils;

public class HibernateCRUDExample {
	private static void deleteArticle() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		try(Session hibernateSession = factory.openSession()){
			//Obtaining an Article which is to be deleted
			Serializable identity = 101;
			Class<Article> entityType = Article.class;
			Article foundArticle = hibernateSession.load(entityType, identity);
			
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
				hibernateSession.delete(foundArticle);
			hibernateTransaction.commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Record deleted...");
		
	}
	private static void updateArticle() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		try(Session hibernateSession = factory.openSession()){
			//Obtaining an Article which is to be updated
			Serializable identity = 102;
			Class<Article> entityType = Article.class;
			Article foundArticle = hibernateSession.load(entityType, identity);
			
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
				//Modify the found object by calling setters
				foundArticle.setHeadLine("Careers in Angular and React");
			hibernateTransaction.commit();			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Record updated...");
	}
	
	private static void addNewArticle() {
		//This is already done but modify accordingly
	}
	private static void showOneArticle() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session hibernateSession = factory.openSession();
		
		Serializable identity = 101;//Serializable identity = new Integer(101);
		Class<Article> entityType = Article.class;
		
		Article foundArticle = hibernateSession.load(entityType, identity);
		System.out.println("Found Article is :");
		System.out.println(foundArticle);
		hibernateSession.close();
	}
	
	private static void hibernateLoading() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session hibernateSession = factory.openSession();
		
		Serializable identity = 102;
		Class<Article> entityType = Article.class;
		
		Article foundArticle = hibernateSession.load(entityType, identity);
		System.out.println(foundArticle.getClass().getName());
		hibernateSession.close();
	}
	
	private static void usingUpdateMethod() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Article foundArticle = null;
		try(Session s1 = factory.openSession()){
			Serializable identity = 102;
			Class<Article> entityType = Article.class;
			foundArticle = s1.load(entityType, identity);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		//This time foundArticle is detached
		foundArticle.setHeadLine("Carreers in Spring");
		try(Session s2 = factory.openSession()){
			Transaction tx = s2.beginTransaction();
				s2.update(foundArticle);//Bringing foundArticle in Persistent state
			tx.commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//showOneArticle();
		//updateArticle();
		//deleteArticle();
		//hibernateLoading();
		usingUpdateMethod();
	}

}
