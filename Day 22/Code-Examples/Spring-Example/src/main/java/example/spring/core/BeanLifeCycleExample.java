package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifeCycleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext appContext;
		String resource = "spring-config.xml";
		appContext = new ClassPathXmlApplicationContext(resource);
		
		String beanId = "firstUser";
		Object obj = appContext.getBean(beanId);
		
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		appContext.close();
	}

}






