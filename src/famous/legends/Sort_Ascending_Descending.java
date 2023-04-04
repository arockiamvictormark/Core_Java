package famous.legends;

public class Sort_Ascending_Descending {
	static int num[] = {5,2,8,7,1};
	
	private static void ascending_order() {
		int temp;		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order: ");
		for (int k = 0; k < num.length; k++) {
			System.out.print(num[k]+" ");
		}
	}
	
	private static void decending_order() {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("\nDesending Order: ");
		for (int k = 0; k < num.length; k++) {
			System.out.print(num[k]+" ");
		}
	}
	
	public static void main(String[] args) {
		ascending_order();
		decending_order();
	}

}
