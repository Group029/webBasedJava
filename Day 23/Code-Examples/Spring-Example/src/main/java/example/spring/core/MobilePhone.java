package example.spring.core;

public class MobilePhone {
	private String make;
	private String model;
	private MobileSpecification specification;
	public MobilePhone() {
		// TODO Auto-generated constructor stub
	}
	public MobilePhone(String make, String model, MobileSpecification specification) {
		super();
		this.make = make;
		this.model = model;
		this.specification = specification;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public MobileSpecification getSpecification() {
		return specification;
	}
	public void setSpecification(MobileSpecification specification) {
		this.specification = specification;
	}
	@Override
	public String toString() {
		return "MobilePhone [make=" + make + ", model=" + model + ", specification=" + specification + "]";
	}

}
