package example.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class User implements GreetingService, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String firstName;
	private String lastName;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy()");

	}
	
	public void destroyAgain() {
		System.out.println("Inside destroyAgain()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
	}
	
	public void init() {
		System.out.println("Inside afterPropertiesSetAgain() ");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Setting the application context: " + applicationContext);

	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Setting the bean name: " + name);

	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello " + firstName + " " + lastName;
	}

}
