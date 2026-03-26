package week4;

public class question7 {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int twoInt = calc.twoIntegers(2, 3);
		int threeInt = calc.threeIntegers(4,8,5);
		
		double twoDoubles= calc.twoDoubles(2.6,3.2);
		double threeDoubles= calc.threeDoubles(2.6,3.2,4.6);
		
		calc.printInfo(twoInt,threeInt,twoDoubles,threeDoubles);
	}
}

class Calculator{
	int a;
	int b;
	int c;
	double x;
	double y;
	double z;
	
	public int twoIntegers(int a, int b) {
	
		this.a = a;
		this.b = b;
		
		return a+b;
	}
	
	public int threeIntegers(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		return a+b+c;
	}
	
	public double twoDoubles(double x, double y) {
		
		this.x = x;
		this.y = y;
		
		return x+y;
	}
	
	public double threeDoubles(double x, double y, double z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		return x+y+z;
	}
	
	public void printInfo(int add1, int add2, double add3, double add4) {
		System.out.println("Two Integers: "+ add1);
		System.out.println("Three Integers: "+ add2);
		System.out.println("Two Double: "+ add3);
		System.out.println("Three Double: "+ add4);
	}
}
