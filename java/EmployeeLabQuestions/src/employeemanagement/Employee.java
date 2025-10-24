package employeemanagement;


import java.time.LocalDate;

public class Employee {

	
	
	protected int empId;
	protected String name;
	protected String dept;
	protected LocalDate joiningDate;
	
	
	
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, String dept, LocalDate joiningDate) {
		
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.joiningDate = joiningDate;
		
	}

	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	public void display() {
		System.out.println("Employee ID : " + empId + "Name : " + name + " Department : " + dept + "Joining date : " + joiningDate);
	}

	
}
