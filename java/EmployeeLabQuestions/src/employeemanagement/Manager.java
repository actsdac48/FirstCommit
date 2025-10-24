package employeemanagement;

import java.time.LocalDate;

public class Manager extends Employee{

	public Manager(int empId, String name, String dept, LocalDate joiningDate) {
		super(empId, name, dept, joiningDate);
		
	}

	

	public void display() {
		System.out.println("Employee ID : " + empId + "Name : " + name + " Department : " + dept + "Joining date : " + joiningDate);
	}
	
	
}
