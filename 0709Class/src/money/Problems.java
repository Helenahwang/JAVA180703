package money;

import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {

		//1
		/*
		Scanner sc=new Scanner(System.in);

		System.out.println("금액을 입력하세요.> ");
		int money=sc.nextInt();


		int fif = 0;
		if(money>=50000) {
			fif=money/50000;	
		}

		money = money%50000;

		int ten =0;
		if(money>=10000) {
			ten=money/10000;
		}

		money=money%10000;
		
		int five=0;
		if(money>=5000) {
			five=money/5000;
		}
		money=money%5000;

		int one=0;
		if(money>=1000) {
			one=money/1000;
		}

		money=money%1000;


		System.out.printf("오만원 %d장, 만원 %d장, 오천원 %d장, 천원 %d장", fif, ten, five, one);
		*/
		
		
		//2
		
		for(int i=0; i<5; i++) {
		
				if(i<2) {
					for(int j=0; j<3-i; j++) {
					
						System.out.print("*");
					
					}
				System.out.println();
				
				}else{
					for(int j=0; j<i-1;j++) {
				
						System.out.print("*");
					
					}
				System.out.println();
				}
				
				
			}
		
		
		
		//3
		/*
		int[][] ar=new int[6][11];

		int count=0;
		
		for(int i=0; i<6; i++) {
			for(int j=5-i; j<=5+i; j++) {
					
				
				if(i<5) {
					if(5-i<j && j<5+i) {
					continue;
					}
				}
				

				ar[i][j]=count;
				count++;	
				
				if(i==5) {
					if(j>0) {
						ar[i][j]=ar[i][j]-10;
						
					}
					
				}
				
			}
			
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<11; j++) {
				
				if(ar[i][j]==0) {	
				
					if((i==0 && j==5)||(i==5 && j==1)) {
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
		*/
		
		
		
		//4. 문자열을 입력받아서 모두 소문자로 변환해서 출력하시오. 공백은 모두 제거 ex)입력-"HeL lo" 출력-hello
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.>");
		
		String ar=sc.nextLine();
		
		String ar1=ar.replaceAll(" ", "");
		int size=ar1.length();
		
		for(int i=0; i<size; i++) {
			
			char c=ar1.charAt(i);
			
			if(c>='A'&& c<='Z') {
				c=(char) (c+32);
			}
			
			System.out.print(c);
		}
		 
		sc.close();
		*/

	}

}
