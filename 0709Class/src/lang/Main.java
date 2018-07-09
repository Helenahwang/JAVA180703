package lang;

public class Main {

	public static void main(String[] args) {
	
		//value 형 변수 생성
		int n=10;
		
		//value 형의 데이터를 대입
		int x=n;
		x=20;
		
		System.out.println("1번 : "+n);
		
		//참조형 데이터의 복사 : 주소가 복사
		int[] ar= {10,20,30};
		
		//10,20,30이 저장된 곳의 주소를 복사
		int[] br=ar;
		
		//복사된 주소의 첫번째 데이터를 1000으로 변경
		br[0]=1000;
		System.out.println("2번 : "+ar[0]);
		
		
		
		
		int[] ar1= {40,50,60};
		int[] br1=new int[ar1.length];
		
		for(int i=0; i<ar1.length; i++) {
			
			br1[i]=ar1[i];
			
		}
		
		br1[0]=1000;
		System.out.println("3번 : "+ar1[0]);
	}

}
