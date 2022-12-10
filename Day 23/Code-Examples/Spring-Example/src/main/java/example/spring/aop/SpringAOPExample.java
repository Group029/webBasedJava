package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringAOPConfig.class);
		
		Performer pf = (Performer)ctx.getBean("musician");
		pf.perform();
		System.out.println(pf.getClass().getName());
		System.out.println("--------------");
		 pf = (Performer)ctx.getBean("singer");
			pf.perform();
			System.out.println(pf.getClass().getName());
				

	}

}
