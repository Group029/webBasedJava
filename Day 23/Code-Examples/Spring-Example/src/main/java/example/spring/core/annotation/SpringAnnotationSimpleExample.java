package example.spring.core.annotation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
		Class<SpringConfig> configClass = SpringConfig.class;
		
		//Register this config class with annoCtx
		annoCtx.register(configClass);
		//Refresh the context
		annoCtx.refresh();
		
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






