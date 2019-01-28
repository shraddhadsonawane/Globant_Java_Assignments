package Sumeet;

public class Prog8 {
	
	static public void swapTwoNumbers(){
		
		int a = 10;
		int b = 20;
		int c = 0; 
		System.out.println("before swap numbers are := " +a+ " and " +b );
		
		c	= a;
		a = b;
		b = c;
		System.out.println("after swap numbers are := " +a+ " and " +b );
		
		
	}

	public static void main(String[] args) {

		swapTwoNumbers();

	}

}
