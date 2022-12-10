package example.spring.core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import desserts.IceCream;
import desserts.brownies.Brownie;

public class SimpleComponentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubClass<SpringConfig> configClass = SpringConfig.class;
		Class<SpringConfig> configClass = SpringConfig.class;
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(configClass);
		
		Class<GreetingComponent> compClass = GreetingComponent.class;
		GreetingComponent greeting = annoCtx.getBean(compClass);
		greeting.showGreeting();
		
		Class<IceCream> compClass2 = IceCream.class;
		IceCream ic = annoCtx.getBean(compClass2);
		ic.makeIceCream();
		
		/*Use this approach if ID is not specified 
		 * Class<Brownie> compClass3 = Brownie.class;
		Brownie br = annoCtx.getBean(compClass3);
		br.makeBrownie();*/
		Object obj = annoCtx.getBean("myBrownie");
		Brownie br = (Brownie)obj;
		br.makeBrownie();

	}

}
