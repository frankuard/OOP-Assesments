package week6;
import java.util.*;

public class number5 {

	public static void main(String[] args) {
		
		Stack<String> tasks = new Stack<>();
		
		tasks.push("Read");
		tasks.push("Write");
		tasks.push("Code");
		
		System.out.println(tasks);
		
		tasks.pop();
		System.out.println(tasks);
		
		tasks.push("Debug");
		tasks.push("Test");
		System.out.println(tasks);
		
		String top = tasks.peek();
		System.out.println(top);
		
		System.out.println(tasks);
	}
}
