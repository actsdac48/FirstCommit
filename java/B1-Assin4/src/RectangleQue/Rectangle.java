package RectangleQue;

public class Rectangle {
 

	

	
	private float length = 4;
	private float breadth = 6;
	
	Rectangle(){}
	
	public Rectangle(float l, float b) {
		this.length = l;
		this.breadth = b;
	}
	
	float area = length * breadth;
	float perimeter = 2 * (length + breadth);
	
	public void displayArea() {
		System.out.println("Area of Rectangle : " + this.area);
	}
	
	public void displayPerimeter() {
		System.out.println("Area of Rectangle : " + this.perimeter);
	}
	

}
