package mutex;

import java.util.ArrayList;

public class ShareData {
	//저장 공간을 생성
	public static ArrayList<Character> list=new ArrayList<>();
	
	//데이터를 저장하는 메소드
	public void save(char ch) {
		list.add(ch);
		System.out.println(ch+"~를 저장했습니다.");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	

}
