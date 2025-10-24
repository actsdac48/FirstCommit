/*
    *
   **
  ***
 ****
*****
 */

public class RightHalf {

	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			
			for(int j=1; j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i-1; k<5; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}