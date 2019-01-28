package Sumeet;

public class Prog3 {
	
	public void cube(int no){

		int cube = no * no * no;
		System.out.println("cube of entered no is := "+cube);
		}
	
	public void square(int no){
		
		int square = no * no;
		System.out.println("square of entered no is := "+square);
	}
	

	public static void main(String[] args) {

		Prog3 p = new Prog3();
		p.cube(2);
		p.square(20);

	}
	
	

}
