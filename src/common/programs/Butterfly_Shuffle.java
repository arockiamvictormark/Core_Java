package common.programs;

public class Butterfly_Shuffle {

	public static void main(String[] args) {
		
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		int len = b.length/2;
		
		for (int i = len-1; i >= 0; i--) {
			System.out.println(b[i]);
		}
		
		System.out.println();
		
		for (int j = b.length-1; j >= len; j--) {
			System.out.println(b[j]);
		}
	}

}