package example.hibernate.main;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Article;
import example.hibernate.utilities.HibernateUtils;

public class HibernateCRUDExample {
	
	private static void addNewArticle() {
		//This is already done but modify accordingly
	}
	private static void showOneArticle() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session hibernateSession = factory.openSession();
		
		Serializable identity = 103;//Serializable identity = new Integer(101);
		Class<Article> entityType = Article.class;
		
		Article foundArticle = hibernateSession.load(entityType, identity);
		System.out.println("Found Article is :");
		System.out.println(foundArticle);
		hibernateSession.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOneArticle();

	}

}
