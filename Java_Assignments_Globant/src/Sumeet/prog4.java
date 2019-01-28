package Sumeet;

public class prog4 {
	
	static public void areaCircle(double r){
		
		double  pie = 3.14;
		double area = pie * r * r;
		System.out.println("area of circle is : = " +area);
		
	}
	
static public void areaRectangle(double len, double bre){
		
		double areaRect  = len * bre;
		System.out.println("area of rectangle  is : = " +areaRect);
		
	}
	

	public static void main(String[] args) {
		
		areaCircle(3.32);
		areaRectangle(20, 30);

	}

}
