package week6;
import java.util.*;

public class number2 {
	
	public static void main(String[] args) {
		
		LinkedList <Integer> numbers = new LinkedList<>();
		
		numbers.add(2);
		numbers.add(4);
		numbers.addFirst(6);
		numbers.addLast(8);
	
		System.out.println(numbers);
		if (numbers.isEmpty()) {
			System.out.println("The List is Empty");
			
		}
	}
}
