package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext;
		String resource = "spring-config.xml";
		appContext = new ClassPathXmlApplicationContext(resource);		
		
		Object obj = appContext.getBean("test1");
		Object obj2 = appContext.getBean("test1");
		System.out.println(obj == obj2);
	}

}






