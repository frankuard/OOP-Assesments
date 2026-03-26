package week4;

public class question2 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
	}
}


class Shape{
	
	public double getPerimeter() {
		return 0.0;
	}
	
	public double getArea() {
		return 0.0;
		
	}
}

class Circle extends Shape{
		double radius;
		double perimeter;
		double area;
	public double getPerimeter() {
		
		perimeter = 2* Math.PI * radius;
		return perimeter;
	}
	
	public double getArea(){
		area = Math.PI * (radius*radius);
		return area;
	}
	
	public Circle(double radius) {
		
		this.radius = radius;
		this.area = getArea();
		this.perimeter = getPerimeter();
		System.out.println("Perimeter:"+ perimeter);
		System.out.println("Area:"+ area);
	}
}