package famous.legends;

public class Fibonacci_Series {	// 0 1 1 2 3 5 8 13 21 34 55 89
	
	public static void main(String[] args) {
		
		int a=0,b=1;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		
	}

}
