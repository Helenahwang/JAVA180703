package problem;

public class Main {

	public static void main(String[] args) {
		
		
		int[] ar= {10,30,70,40,15};
		/*
		//가장 큰 수의 위치
		
		
		int mmax=0;
		for(int i=0; i<ar.length; i++) {
			
			for(int j=i; j<ar.length; j++) {
				
				if(ar[i]>ar[j]) {
					mmax=i;
					
				}
				
			}
		}
		
		System.out.println("가장 큰 값: "+ar[mmax]);
		*/
		
		int max=ar[0];
		int idx=0;
		int size=ar.length;
		int i;
		
		for(i=1; i<size; i++) {
			if(max < ar[i]) {
				max=ar[i];
				idx=i;
			}
		}
		System.out.println("가장 큰수 위치: "+idx);
		
		
		
		
		
		
		
		
		
		
		//50에 가장 가까운 수의 위치
		
		

	}

}
