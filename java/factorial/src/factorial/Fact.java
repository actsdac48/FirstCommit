package factorial;

public class Fact {

	public static void main(String[] args) {
		
		int num = 5, ans=1;
		
		for(int i = 1; i <= num; i++) {
			ans = ans * i;
		}
		
		System.out.println(ans);

	}

}
