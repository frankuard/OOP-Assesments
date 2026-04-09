package week6;
import java.util.*;

public class number3 {
	
	public static void main(String[] args) {
		
		
		ArrayList <Integer> num = new ArrayList<>(List.of(1));
		
		Collections.addAll(num, 2,3,4,5);
		System.out.println(num);
		
		Collections.rotate(num, 4);
		
		System.out.println(num);
	}
}
