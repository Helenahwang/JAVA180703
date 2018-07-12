package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\503-02\\Documents\\황연하\\log.txt");
		
		HashSet<String> set1 = new HashSet<String>();
		
		
		try {
			Scanner sc=new Scanner(f);
			int sum=0;
			
			//읽을 다음 줄이 있을 때까지 수행
			while(sc.hasNextLine()) {
				//System.out.println(sc.nextLine());
				//한 줄 읽기
				String tmp = sc.nextLine();
				
				//공백으로 분리하기
				String[] ar=tmp.split(" ");
				//System.out.println(ar[0]); 
				
				set1.add(ar[0]);
				//System.out.println(ar[9]);
				//System.out.println(ar.length-1); 숫자 뒤에 공백이 있는 경우도 있다.
				sum=sum+Integer.parseInt(ar[9]); //ar.length-1
				
				
			}
			
			System.out.println(set1);
			System.out.println(sum);
			
		sc.close();	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	
	}

}
