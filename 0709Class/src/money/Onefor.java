package money;

public class Onefor {

	public static void main(String[] args) {
		
		int[][] ar= new int[5][5];
		int count=1;
		
		for(int i=0; i<25; i++) {
			
			ar[i/5][i%5]=count;
			System.out.printf("%3d",count);
			
			if(i%5==4)
				System.out.println();
			
			count++;
		}

	}

}
