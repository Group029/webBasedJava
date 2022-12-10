package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DependecyInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext;
		String resource = "spring-config.xml";
		appContext = new ClassPathXmlApplicationContext(resource);
		
		String beanId = "myMobile";
		Object obj = appContext.getBean(beanId);
		
		MobilePhone myPhone = (MobilePhone)obj;
		System.out.println(myPhone);
		
	}

}






