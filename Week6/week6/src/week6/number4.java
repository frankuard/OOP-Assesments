package week6;
import java.util.*;

public class number4 {

	public static void main(String[] args) {
		
		LinkedList <String> colors = new LinkedList<>(List.of("Red"));
		
		Collections.addAll(colors, "Blue","Yellow","Green","White");
		
		Iterator<String> it = colors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
