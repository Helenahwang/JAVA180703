package problem;

import java.util.HashMap;

public class Main3 {

	public static void main(String[] args) {

		HashMap<Integer,Integer> ar=new HashMap<>();

		HashMap<Integer,Integer> sign=new HashMap<>();
		int sum=0;
		int check=0;
		int num=1;
		int po=num;
	
		
		
		int target=12;
		
		
		int count=0;
		

		while(count<10) {

			
			for(int j=1; j<=num; j++) {
				sign.put(j, 1);
			}

			count=0;
			
			while(count < Math.pow(2, num)) {


				for(int i=1; i<=num; i++) {

					if((count%(Math.pow(2,po)/Math.pow(2,i))==0) && count!=0) {

						if(sign.get(i)>0) {

							sign.put(i,-1);
						}
						else {

							sign.put(i,1);
						}


					}


					int value=i*sign.get(i);
					sum=sum+value;

				}
				ar.put(count, sum);

				sum=0;
				
				System.out.println(count+ "  "+ar.get(count));
			
				if(ar.get(count)==target) { 
					
					check=1;
					break;			
				}
				
				
				count++;
				
			}

			num++;
		
			if(check==1) {
				break;
			}

		}
	}

} 
