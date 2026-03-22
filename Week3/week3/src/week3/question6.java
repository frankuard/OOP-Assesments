package week3;

public class question6 {
	 public static void main(String[] args) {
			 
		 Lamp lamp = new Lamp();
		 
		 lamp.turnOn();
		 lamp.turnOff();
		 }
} 
	 class Lamp{
		 
		boolean isOn;
		
		void turnOn(){
			isOn = true;
			System.out.println("The Lamp is On: "+isOn);
		}
		void turnOff(){
			isOn = false;
			System.out.println("The Lamp is On: "+isOn);
		}
	 }
	 

