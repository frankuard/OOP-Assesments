package week3;

public class question2 {
	
	public static void main(String[] args){
		
		double numbers[]= {20.5,45.6,12.5,23.6};
		float sum = 0;
		int size = numbers.length;
		
		for (int i = 0; i<=numbers.length-1; i++) {
			sum +=numbers[i];
		}
		float average = sum/size;
		
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ average);
	}
}
