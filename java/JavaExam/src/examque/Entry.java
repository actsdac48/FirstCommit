package examque;

import java.util.ArrayList;
import java.util.Scanner;

public class Entry {

	static boolean loop = true;
	//static InputHandler InputHandler = new InputHandler();
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Task> taskArr = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		//ArrayList<Task> taskArr = new ArrayList<>();
		
		while(loop == true) {
			
				System.out.println("1. Add new task record\n2. display all task assigned to a specific employee\n3. display task by records\n4. display count of completed task per employee\n5. list all task sorted by assigned date\n6. save to file\n 7. exit");
				int choice = sc.nextInt();
				switch(choice) {
				case 1 : {
					InputHandler.addNewTask(taskArr);
				}break;
				
				case 2 : {
					InputHandler.displayTasksByEmployee(taskArr);
				}break;
				case 3 : {
					InputHandler.displayTasksByStatus(taskArr);
				}break;
				case 4 : {
                    InputHandler.displayCompletedTaskCountPerEmployee(taskArr);
				}break;
				case 5 : {
					InputHandler.listTasksSortedByAssignedDate(taskArr);
				}
				case 6 : {
					InputHandler.saveTasksToFile(taskArr);
             
				}break;
				case 7 : {
                    loop = false;
                    System.out.println("Exiting the program. Goodbye!");
				}break;
				default: {
					System.out.println("Invalid choice. Please try again.");
				}
			}
			
		}
		

	}


}
