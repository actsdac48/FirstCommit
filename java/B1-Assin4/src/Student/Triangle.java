package Student;

public class Triangle {

	
	public Triangle() {}
	
	public void Triangle(int side1, int side2, int side3) {
		
		int perimeter = side1 + side2 + side3;		
		int semiPerimeter = (side1+side2+side3)/2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
		
		
		System.out.println("Area of a given Triangle is : " + area);
		System.out.println("Perimeter of a given Triangle is : " + perimeter);
		
	}

	

}
