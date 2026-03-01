package week1;


public class question16 {
 public static void main(String[] args) {
	 
	boolean expr1 = (5>3);
	boolean expr2 = (8>5);
	boolean ANDResult = expr1 && expr2;
	
	boolean ORResult = expr1 || expr2; 
	
	boolean NOTResult = !(5==10);

	
	System.out.println("AND Result:"+ ANDResult);
	System.out.println("OR Result:"+ ORResult);
	System.out.println("NOT Result:"+ NOTResult);

 }
}
