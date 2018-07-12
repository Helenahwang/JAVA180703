package etc;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		
		String msg = "나는 중학교때까지 야구 선수 였습니다.";
		String data = "90,30,20,60";
		
		//msg를 공백단위로 분할해서 출력
		//1.split 메소드 이용
		String[] ar=msg.split(" ");
		for(String token : ar) {
			System.out.println(token);
		}
		System.out.println("==========================");
		
		//2. StringTokenizer
		StringTokenizer st = new StringTokenizer(msg," ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		System.out.println("==========================");
		
		//1.split 메소드 이용
		String[] ar1=data.split(",");
		for(String token : ar1) {
			System.out.println(token);
		}
		System.out.println("==========================");

		//2. StringTokenizer
		StringTokenizer st1 = new StringTokenizer(data,",");
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}

		int sum=0;
		
		for(int i=0; i<ar1.length; i++) {
			sum=sum+Integer.parseInt(ar1[i]);
		}
		
		System.out.println("sum="+sum);
		

	}

}
