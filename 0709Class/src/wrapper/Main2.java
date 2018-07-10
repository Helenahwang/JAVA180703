package wrapper;

public class Main2 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				
				System.out.print("*");
			}
			System.out.println("Enter");
		}
		
		
		for(int i=0; i<6; i++) {
			if(i<3) {
				for(int j=0; j<i;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0; j<6-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
