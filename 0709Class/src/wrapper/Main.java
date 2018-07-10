package wrapper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Integer i=new Integer(10);
		System.out.println("i = "+i);

		Integer i2=20;
		System.out.println("i2 = "+i2);
		
		Integer i3=Integer.parseInt("700");
		System.out.println("i3 = "+i3);
		
		
		int x=-1;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요.> ");
			String tmp=sc.nextLine();
			
			try {
				
			x=Integer.parseInt(tmp); 
			break;
			
			}catch(Exception e) {
			
				System.out.println("틀렸습니다."); //tmp를 Integer로 못바꾼면...
				
			}
			
		}
		
		System.out.println(x);
		sc.close();
		
		
	}

}
