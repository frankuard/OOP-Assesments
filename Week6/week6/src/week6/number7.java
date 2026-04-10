package week6;
import java.util.*;

public class number7 {

	public static void main(String[] args) {
		
		Deque<String> jobs = new ArrayDeque<>();
		
		jobs.add("Document 1");
		jobs.add("Document 2");
		jobs.add("Document 3");
		System.out.println(jobs);
		
		jobs.remove();
		System.out.println(jobs);
		
		jobs.add("Document 4");
		jobs.add("Document 5");
		System.out.println(jobs);
		
		System.out.println(jobs.peek());
		
		System.out.println(jobs);
		
	}
}
