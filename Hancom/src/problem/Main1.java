package problem;

public class Main1 {

	public static void main(String[] args) {
		
	
		int lineNumber=6;
		
		int[][] ar=new int[lineNumber][lineNumber*2-1];

		int count=0;
		
		for(int i=0; i<lineNumber; i++) {
			for(int j=(lineNumber-1)-i; j<=(lineNumber-1)+i; j++) {
					
				
				if(i<lineNumber-1) {
					if((lineNumber-1)-i<j && j<(lineNumber-1)+i) {
					continue;
					}
				}
				

				ar[i][j]=count;
				count++;	
				
				if(i==lineNumber-1) {
					if(j>0) {
						ar[i][j]=ar[i][j]-(ar[lineNumber-1][0]+1);
						
					}
					
				}
				
			}
			
		}
		
		for(int i=0; i<lineNumber; i++) {
			for(int j=0; j<lineNumber*2-1; j++) {
				
				if(ar[i][j]==0) {	
				
					if((i==0 && j==lineNumber-1)||(i==lineNumber-1 && j==1)) {
						System.out.print("\t"+ar[i][j]);
					}
					else {
						System.out.print("\t");					
					}
				}

				else {
	
					System.out.print("\t"+ar[i][j]);
				}

			
			}
			System.out.println();
			
			
		}
	}

}
