package stringex;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		int x=200;
		int y=100;
		
		String str=String.format("x:%d y:%d",x,y); //static이라서    클래스명.format( )   으로 써야 한다.
		System.out.println(str);
		
		
		
		
		String msg="I like Java";
		
		String msg1=msg.toLowerCase();
		int a=msg1.indexOf("java");
		
		if(a>=0) {
			System.out.println("java가 존재합니다.");
		}else
			System.out.println("java가 존재하지 않습니다.");
		
		
		int idx=msg.toLowerCase().indexOf("javV".toLowerCase());
		
		if(idx>=0){
			System.out.println("javv가 존재합니다.");
		}else
			System.out.println("javv가 존재하지 않습니다.");
		
		
		
		
		
		String[] ar=msg.split(" ");
		
		int size=ar.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(ar[i]);
		}
		
		
		
		
		
		String m=msg.substring(3, 8); //3번째 부터 7번째 까지를 구할때는 (3, 8) 이렇게 써주어야 한다.
		System.out.println(m);
		
		
		
		
		
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		
		HashMap<String, String> hm = new HashMap<>();
		
		
		//0이면 남자, 1이면 여자
		int gender=1;
		if(gender==0) {
			
		}else {
			
		}
		
		
		final int MAN=0;
		final int WOMAN=1;
		
		if(gender==MAN) {
			
		}else {
			
		}
			

	}
	
	enum GENDER{
		MAN, WOMAN;
	}

}
