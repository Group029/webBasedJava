package example.spring.core.annotation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationSimpleExampleSimplified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringConfig> configClass = SpringConfig.class;
		AnnotationConfigApplicationContext annoCtx = 
				new AnnotationConfigApplicationContext(configClass);
				
		Object obj = annoCtx.getBean("helloBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = annoCtx.getBean("welcomeBean");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = annoCtx.getBean("mediaNames");
		List<String> mediaNames = (List<String>)obj;
		for(String name : mediaNames)
			System.out.println(name);
		

	}

}






