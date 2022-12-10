package example.spring.core;

public class MobileSpecification {
	private String storage;
	private String backCamera;
	private String frontCamera;
	public MobileSpecification() {
		// TODO Auto-generated constructor stub
	}
	public MobileSpecification(String storage, String backCamera, String frontCamera) {
		super();
		this.storage = storage;
		this.backCamera = backCamera;
		this.frontCamera = frontCamera;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getBackCamera() {
		return backCamera;
	}
	public void setBackCamera(String backCamera) {
		this.backCamera = backCamera;
	}
	public String getFrontCamera() {
		return frontCamera;
	}
	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}
	@Override
	public String toString() {
		return "MobileSpecification [storage=" + storage + ", backCamera=" + backCamera + ", frontCamera=" + frontCamera
				+ "]";
	}

}
