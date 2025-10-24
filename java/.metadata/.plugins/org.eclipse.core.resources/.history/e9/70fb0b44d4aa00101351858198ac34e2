package Pre_end_module_1;

import java.util.Scanner;

import Pre_end_module.Employee_service;

public class entry {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		   employee_service empser=new employee_service();
		   int choice;
		   empser.load();
		   
		   do {
			   System.out.println("Enter Choice");
			   System.out.println("1.Add employee");
			   System.out.println("2.display allemployee");
			   System.out.println("3.display count of employee dept-wise");
			   System.out.println("4.display emp for specific dept");
			   System.out.println("5.Sort employees by joining date");
			   System.out.println("6.Exit");
			   choice=sc.nextInt();
			   
			   switch(choice) {
			   case 1:empser.add();
			          break;
			   case 2:empser.displayall();
			          break;
			   case 3:empser.countdept();
			          break;
			   case 4:empser.displaydeptwise();
			          break;
			   case 5:empser.sortbyjoiningdate();
			   default:
				   break;
			   }
			   
		   }while(choice!=6);
	   }
	}


