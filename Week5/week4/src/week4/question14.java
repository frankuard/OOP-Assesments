package week4;

public class question14 {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		}
		catch (Exception e){
			System.out.println("There has been an error: "+ e.getMessage());
		}
	
	}
}

