package week6;
import java.util.*;

public class number12 {

	public static void main(String[] args) {
		
		ArrayList <Integer> numbers = new ArrayList<>(List.of(72));
		
		Collections.addAll(numbers, 60,12,45,16,36);
		System.out.println("Normal");
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println("Sorted:");
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		System.out.println("Reversed:");
		System.out.println(numbers);
	}
}
