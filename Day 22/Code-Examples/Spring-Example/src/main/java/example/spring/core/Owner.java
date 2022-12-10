package example.spring.core;

public class Owner {
	private String name;
	private String city;
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
