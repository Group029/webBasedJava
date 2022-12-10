package example.spring.core;

public class Person implements GreetingService {
	private String name;
	private String profession;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String profession, int age) {
		System.out.println("String, String, int");
		this.name = name;
		this.profession = profession;
		this.age = age;
	}

	public Person(int age, String name, String profession) {
		System.out.println("int, String, String");
		this.age = age;
		this.name = name;
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Person Name");
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", profession=" + profession + ", age=" + age + "]";
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String finalGreeting = "Hello " + name + ", Welcome!!, You are a " + profession + " and your age is " + age;
		return finalGreeting;
	}

}
