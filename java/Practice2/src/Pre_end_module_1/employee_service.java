package Pre_end_module_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import Pre_end_module_1.Employee.Dept;


public class employee_service {
	List<Employee> employee=new ArrayList<>();
	private int eid;
	private String name;
	Dept dept;
	private LocalDate joiningdate;
	Scanner sc=new Scanner(System.in);
	File f=new File("file.ser");
	
	
	public void save() {
		try(FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void load() {
		if(!f.exists() || f.length()==0) {
			return;
		}
		try(FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis)){
			employee=(List<Employee>) ois.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void add() {
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("enter dept(HR,SALES,FINANCE)");
		dept=Dept.valueOf(sc.next().toUpperCase());
		System.out.println("enter joining date");
		String d=sc.next();
		joiningdate=LocalDate.parse(d);
		
		Employee emp=new Employee(eid++,name,dept,joiningdate);
		employee.add(emp);
		save();
	}
	
	public void displayall() {
		for(Employee e:employee) {
			System.out.println(e);
		}
		
		
	}
	
	public void displaydeptwise() {
		System.out.println("enter dept(hr,sales,finance)");
		String department=sc.next();
		for(Employee e:employee) {
			if(e.getDept().name().toUpperCase().equals(department)) {
				System.out.println(e);
			}
			
		}
		
		
	}
	public void countdept() {
		int hr=0,sales=0,finance=0;
	    for(Employee e:employee) {
	    	if(e.getDept().name().equals("HR")) {
	    		hr++;
	    	}
	    	else if(e.getDept().name().equals("SALES")) {
	    		sales++;
	    	}
	    	else if(e.getDept().name().equals("FINANCE")) {
	    	    finance++;
	    	}
	    }
	    System.out.println("count hr:"+hr );
	    System.out.println("count sales:"+sales );
	    System.out.println("count finance:"+finance );
	}
	
	public void sortbyjoiningdate() {
		if(employee.isEmpty()) {
			System.out.println("list is empty");
		}
		employee.sort(Comparator.comparing(Employee::getJoiningdate));
		for(Employee e:employee) {
			System.out.println(e);
		}
		
		
	}
	
	

}
