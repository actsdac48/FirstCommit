public class ConsoleInput {
	public static void main(String [] args) {
		try {
			byte arr1[] = new byte[100];
		    System.out.println("Enter the name : ");
		    
		    int length = System.in.read(arr1);
		    
		    byte [] FinalArr = new byte[length - 2];
		    
		    System.arraycopy(arr1, 0, FinalArr, 0, length-2);
		    
		    String objFinal = new String(FinalArr);
		    
		    System.out.println(objFinal);
		    
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}