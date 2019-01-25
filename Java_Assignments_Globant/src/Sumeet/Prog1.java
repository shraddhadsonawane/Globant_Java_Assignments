package Sumeet;

public class Prog1 {
	
	static public void sum(int a, int b){
		
		int sumResult = a+b;
		System.out.println("addition of two no is := "+sumResult);
	}

static public void multiply(int a, int b){
		
		int multiplyResult = a*b;
		System.out.println("multiplication of two no is := "+multiplyResult);
	}

static public void substract(int a, int b){
	
	int substractResult = a-b;
	System.out.println("substraction of two no is := "+substractResult);
}
	
static public void divide(int a, int b){
	
	int substractResult = a/b;
	System.out.println("division of two no is := "+substractResult);
}

static public void remainder(int a, int b){
	
	int substractResult = a%b;
	System.out.println("remainder of two no is := "+substractResult);
}
	public static void main(String[] args) {
		
		sum(20, 20);
		multiply(30, 30);
		substract(100, 50);
		divide(200, 10);
		remainder(100, 6);
		
		
				

	}

}
