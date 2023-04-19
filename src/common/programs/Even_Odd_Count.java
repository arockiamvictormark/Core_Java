package common.programs;

public class Even_Odd_Count {

	public static void main(String[] args) {
		evenNumCount();
		oddNumCount();
	}
	
	private static void evenNumCount() {
		int sum=0,count=0;
		System.out.print("Even numbers: ");
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				System.out.print(i+", ");
				sum=sum+i;
				count++;
			}
		}
		System.out.println("\nSum of Even numbers: "+sum);
		System.out.println("Count of Even numbers: "+count);
	}
	
	private static void oddNumCount() {
		int sum=0,count=0;
		System.out.print("\nOdd Numbers: ");
		for	(int i = 0; i < 15; i++) {
			if (i%2!=0) {
				System.out.print(i+", ");
				sum=sum+i;
				count++;
			}
		}
		System.out.println("\nSum of Odd numbers: "+sum);
		System.out.println("Count of Odd numbers: "+count);
	}

}
