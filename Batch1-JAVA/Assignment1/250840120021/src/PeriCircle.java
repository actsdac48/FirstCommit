public class PeriCircle {

	public static void main(String[] args) {
		
		System.out.println("Enter the radius : ");
		
		double radius = GetInput.getDouble();
		double pi = Math.PI;
		
		System.out.println("Perimeter is : " + 2*pi*radius);
		System.out.println("Area is : " + pi*radius*radius);
		

	}

}