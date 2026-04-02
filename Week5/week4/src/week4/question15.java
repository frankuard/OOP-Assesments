package week4;

public class question15 {

	public static void main(String[] args) {

		int[] age = {10,20,25,24,28,27,30,31,32};
		try {
		System.out.println(age[9]);
		}
		catch (Exception e) {
			System.out.println("There has been an error: "+ e.getMessage());
		}
	}
	
}

