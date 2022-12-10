package example.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringAOPConfig {
	
	//@Bean
	public Audience audience() {
		return new Audience();
	}
	
	@Bean
	public AudienceWithAroundAdvice audienceWithAround() {
		return new AudienceWithAroundAdvice();
	}
	@Bean
	public Performer musician() {
		return new Musician();
	}
	
	@Bean
	public Performer singer() {
		return new Singer();
	}

}






