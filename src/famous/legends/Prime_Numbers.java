package famous.legends;

public class Prime_Numbers { // 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
	
	public static void main(String[] args) {
		
		int n = 100;
		for (int i = 1; i < n; i++) {			
			int count = 0;
			for (int j = 2; j < i; j++) {				
				if(i%j==0) {
					count++;
				}				
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
