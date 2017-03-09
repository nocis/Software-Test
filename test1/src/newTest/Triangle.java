package newTest;

public class Triangle {
	
	public int a;
	public int b;
	public int c;
	
	public Triangle(){
		
	}
	
	public Triangle(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public String calculate(){
				
		if ( a + b <= c || b + c <= a || c + a <= b ){
			return "Not a triangle";
		}
		else if( a == b && a == c ){
			return "equilateral";
		}
		else if( a == b || a == c || b == c ){
			return "isosceles";
		}
		else{
			return "scalene";
		}
	}
	

}
