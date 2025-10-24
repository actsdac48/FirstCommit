
public class HHMMSS {

	public static void main(String[] args) {
		
		System.out.println("Enter total seconds : ");
		int total =GetInput.getInt();
		
		int ss = total%60;
		
		int hh = (total/60)/60;
		
		int mm = (total/60)%60;
		
		
		System.out.println(hh + ":" + mm + ":" + ":" + ss);

	}

}
