package wrapper;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		int[] lot=new int[6];
		int size=lot.length;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<size; i++) {
			
			try {
				System.out.println("1부터 45까지 중 숫자 하나를 입력하세요.");
				
				String tmp=sc.nextLine();
				lot[i]=Integer.parseInt(tmp);
				
				
				if(!(lot[i]>=1 && lot[i]<=45)) {
					System.out.println("범위를 벗어났습니다.");
					i--;		
					continue;
				}
				
				int j;
				for(j=0; j<i; j++) {
						
					if(lot[i]==lot[j]) {
						
						break;
						
						//i--;		
						//continue; //여기에 continue를 쓰면 for문으로 가기 때문에 for문을 만족할때까지 계속 수행한다.
					}
						
				}
				
				if(j != i) {
					
					System.out.println("같은 숫자가 존재합니다.");
					i--;
					continue;
				
				}
				
			}catch(Exception e) {
				System.out.println("숫자가 아닙니다.");
				i--;
			}
		}
		
		
		for(int i=0; i<size; i++) {
			System.out.print(lot[i]+"\t");
		}
		
		
		sc.close();
		
		
	}

}
