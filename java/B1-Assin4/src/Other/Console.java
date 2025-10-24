package Other;

public class Console {
	public static int getInt() {
		try {
			byte arr1[] = new byte[100];
		   
		    
		    int length = System.in.read(arr1);
		    
		    byte [] FinalArr = new byte[length - 2];
		    
		    System.arraycopy(arr1, 0, FinalArr, 0, length-2);
		    
		    String objFinal = new String(FinalArr);
		    
		    int newObj = Integer.parseInt(objFinal);
		    return newObj;
		    
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	
	public static double getDouble() {
		try {
			byte arr1[] = new byte[100];
		   
		    int length = System.in.read(arr1);
		    
		    byte [] FinalArr = new byte[length - 2];
		    
		    System.arraycopy(arr1, 0, FinalArr, 0, length-2);
		    
		    String objFinal = new String(FinalArr);
		    
		    double newObj = Double.parseDouble(objFinal);
		    return newObj;
		    
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
}