package Control_Statement;

public class LargestOfThreeNumber {
	
	public static void main(String args[]) {
		int num1=10;
		int num2=20;
		int num3=30;
		
		if(num1>num2 &&num1>num3) {
			
			System.out.println("num1 is a largest number");
			
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("num 2 is largest number");
			
		}
		else {
			System.out.println("num3 is largest number");
		}	
			
	}

}
