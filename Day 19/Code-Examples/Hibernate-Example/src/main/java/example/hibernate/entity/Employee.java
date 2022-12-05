package example.hibernate.entity;

public class Employee {
	private int empNo;
	private String empName;
	private String mobileNo;
	private int empSal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empNo, String empName, String mobileNo, int empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.empSal = empSal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", mobileNo=" + mobileNo + ", empSal=" + empSal
				+ "]";
	}
	
	

}
