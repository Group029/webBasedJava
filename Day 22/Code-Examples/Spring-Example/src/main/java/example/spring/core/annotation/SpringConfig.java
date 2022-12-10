package example.spring.core.annotation;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //Marks this class as a Configuration Unit
@ComponentScan(basePackages = {"desserts", "example"})
public class SpringConfig {
	@Bean//<bean class="HelloService" id="helloBean"/>
	public GreetingService helloBean() {
		GreetingService gs = new HelloService();
		return gs;
	}
	
	@Bean//<bean class="WelcomeService" id="welcomeBean"/>
	public GreetingService welcomeBean() {
		GreetingService gs = new WelcomeService();
		return gs;
	}
	
	@Bean("mediaNames")
	public List<String> socialMediaNames(){
		List<String> smNames = Arrays.asList("Facebook", "Whatsapp", "Instagram", "Twitter");
		return smNames;
	}
	@Bean
	public Owner owner1() {
		Owner o1 = new Owner();
		o1.setName("Jay");
		o1.setCity("Mumbai");
		return o1;
	}
	
	@Bean
	public Pet pet1() {
		Pet pet1 = new Pet();
		pet1.setName("Alex");
		pet1.setType("Dog");
		return pet1;
	}
	
	@Bean
	public Pet pet2() {
		Pet pet2 = new Pet();
		pet2.setName("Jammy");
		pet2.setType("Horse");
		return pet2;
	}
}











