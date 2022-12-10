package example.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Owner {
	private String name;
	private String city;
	@Autowired(required = false)//Asks spring to autowire this property using the bean of type Pet declared in the configuration unit
	@Qualifier("pet1")//Asks Spring to wire the bean having id: pet1
	private Pet petDetails;
	public Owner() {
		// TODO Auto-generated constructor stub
	}
	public Owner(String name, String city, Pet petDetails) {
		super();
		this.name = name;
		this.city = city;
		this.petDetails = petDetails;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Pet getPetDetails() {
		return petDetails;
	}
	public void setPetDetails(Pet petDetails) {
		this.petDetails = petDetails;
	}
	@Override
	public String toString() {
		return "Owner [name=" + name + ", city=" + city + ", petDetails=" + petDetails + "]";
	}

}
