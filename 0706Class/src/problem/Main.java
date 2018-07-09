package problem;

public class Main {

	public static void main(String[] args) {
		
		
		int[] ar= {10,30,20,70,10,40,15};
		
		//가장 큰 수의 위치
		
		/*
		int mmax=0;
		int max=0;
		for(int i=0; i<ar.length; i++) {
			
			for(int j=i+1; j<ar.length; j++) {
				
				if(mmax < ar[j]) {
					mmax=ar[j];
					max=j;
					
				}
				
			}
		}
		
		System.out.println("가장 큰 값: "+ar[max]+" 인덱스 값: "+max);
		*/
		
		/*
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
		
		*/
		
		
		
		
		//50에 가장 가까운 수의 위치
		
		double[] dif = new double[ar.length]; 
		
		for(int i=0; i<ar.length; i++) {
			int diff = Math.abs(ar[i]-50);
			dif[i]=diff;
		}
		
		double dd=dif[0];
		int min=0;
		for(int i=1; i<ar.length; i++) {
			
			if(dd>dif[i]) {
				
				dd=dif[i];
				min=i;
				
			}
		}
		
		System.out.println("50에 가장 가까운 숫자 : "+ar[min] +"  위치는 : "+min);

	}

}
