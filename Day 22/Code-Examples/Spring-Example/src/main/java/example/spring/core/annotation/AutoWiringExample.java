package example.spring.core.annotation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringConfig> configClass = SpringConfig.class;
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(configClass);
		
		Object obj = annoCtx.getBean("owner1");
		System.out.println(obj);		

	}

}






