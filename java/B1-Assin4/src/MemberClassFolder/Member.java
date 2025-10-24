package MemberClassFolder;

public class Member {


	private String Name;
	private int Age;
	private int Phone_number;
	private String Address;
	private int Salary;

		
	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public int getPhone_number() {
		return Phone_number;
	}

	public String getAddress() {
		return Address;
	}

	public int getSalary() {
		return Salary;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public void setPhone_number(int phone_number) {
		Phone_number = phone_number;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public void setSalary(int salary) {
		Salary = salary;
	}

	
	
	public void printSalary() {
		System.out.println("Salary is : " + this.Salary);
		
	}

	

}
