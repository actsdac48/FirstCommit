/*
Enter number of rows : 5
1  
2 3  
4 5 6  
7 8 9 10  
11 12 13 14 15
*/

import java.util.*;

public class NumTriangle {

	public static void main(String[] args) {
		System.out.print("Enter number of rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println(" ");
		}
	}
}