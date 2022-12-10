package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext;
		String resource = "spring-config.xml";
		appContext = new ClassPathXmlApplicationContext(resource);		
		
		appContext.getBean("test1");
	}

}






