package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SimpleSpringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext;
		String filePath = "./src/main/resources/spring-config.xml";
		appContext = new FileSystemXmlApplicationContext(filePath);
		
		String beanId = "firstGreeting";
		Object obj = appContext.getBean(beanId);
		
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		beanId = "secondGreeting";
		obj = appContext.getBean(beanId);
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);

	}

}






