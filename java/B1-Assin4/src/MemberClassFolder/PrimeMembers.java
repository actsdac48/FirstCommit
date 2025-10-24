package MemberClassFolder;



public class PrimeMembers extends Member {
	
	private int JoiningYear;
	private int JoiningFees;
	private boolean isActive;
	
	public int getJoiningYear() {
		return JoiningYear;
	}
	
	public int getJoiningFees() {
		return JoiningFees;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setJoiningYear(int joiningYear) {
		JoiningYear = joiningYear;
	}
	
	public void setJoiningFees(int joiningFees) {
		JoiningFees = joiningFees;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

	public void display() {
		System.out.println("Name : " + getName() + "\nAge : " + getAge() + "\nPhone Number : " + getPhone_number() + "\nAddress : " + getAddress() + "\nSalary : " + getSalary() + "\nJoining Year : " + this.JoiningYear + "\nJoining Fees : " + this.JoiningFees + "\nisActive : " + this.isActive);
	}
	
	
	
	
}
