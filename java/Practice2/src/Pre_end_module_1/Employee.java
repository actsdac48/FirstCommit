package Pre_end_module_1;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
	private static final String serialVersionUID = "test.txt";
	private int eid;
	private String name;

	enum Dept {
		HR, SALES, FINANCE
	}

	Dept dept;
	private LocalDate joiningdate;

	public Employee(int eid, String name, Dept dept, LocalDate joiningdate) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.joiningdate = joiningdate;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public LocalDate getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + ", joiningdate=" + joiningdate + "]";
	}

}
