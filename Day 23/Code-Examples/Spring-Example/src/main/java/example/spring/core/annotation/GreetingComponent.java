package example.spring.core.annotation;

import org.springframework.stereotype.Component;

@Component//Marks this class as a Component so that it can be managed by Spring using Reflection
public class GreetingComponent {
	public void showGreeting() {
		System.out.println("Happy New Year 2023");
	}
}
