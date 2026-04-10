package week6;
import java.util.*;

public class number6 {

	public static void main(String[] args) {
		
		Stack <String> words = new Stack<>();
		
		words.push("Hello");
		words.push("World");
		System.out.println(words);
		
		List<String> reversedWords = words.reversed();
		System.out.println(reversedWords);
	}
}
