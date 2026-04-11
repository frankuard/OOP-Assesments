package week6;
import java.util.*;

public class number13 {

	public static void main(String[] args) {
		
		ArrayList <String> colors = new ArrayList<>(List.of());
		
		Collections.addAll(colors, "Green","Red","White", "Blue", "Yellow");
	
		System.out.println("Normal:");
		System.out.println(colors);
		
		Collections.sort(colors);
		
		System.out.println("Sorted");
		System.out.println(colors);
		
		Collections.reverse(colors);
		
		System.out.println("Reversed:");
		System.out.println(colors);
	}
}
