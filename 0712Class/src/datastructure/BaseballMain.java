package datastructure;

import java.util.HashMap;

public class BaseballMain {

	public static void main(String[] args) {
		//프로야구 팀 별 선수 명단을 배열로 만들기
		String[] kia = {"윤석민", "안치홍", "김선빈"};
		String[] hanhwa = {"권혁", "정근우"};
		String[] lotte = {"레일리", "이대호"};
		
		//동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은 바람직하지 않다.
		//배열이나 리스트는 인덱스를 가지고 구분을 하기 때문에 의미를 부여하지 못한다.
		//배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저 Map으로 의미를 부여해서 묶은 다음 다시 배열이나 리스트로 묶으려고 한다.
		
		HashMap<String, Object> baseb1=new HashMap<>();
		baseb1.put("team", "기아");
		baseb1.put("data", kia); //위의 String[] kia 만든 것 대입
		
		//baseb1.put("data", "윤석민, 안치홍, 김선빈"); 
		
		
		
		HashMap<String, Object> baseb2=new HashMap<>();
		baseb2.put("team", "한화");
		baseb2.put("data", hanhwa); //위의 String[] hanhwa 만든 것 대입	
		
		HashMap<String, Object> baseb3=new HashMap<>();
		baseb3.put("team", "롯데");
		baseb3.put("data", lotte); //위의 String[] lotte 만든 것 대입	

		//HashMap의 배열
		HashMap[] players = {baseb1, baseb2, baseb3};
		
		
		//------------------------------------------------------------------
		//String[] imsi = {(String) baseb1.get("data"), (String) baseb2.get("data"), (String) baseb3.get("data")};
	
		for(HashMap tmp:players) {
			//팀 이름 출력
			System.out.print(tmp.get("team")+" :\t"); //get은 Object만 허용
			
			//선수 명단 가져오기
			
			for(String imsi : (String[])tmp.get("data")) {
				System.out.print(imsi+"\t");				
			};
			
			
			//출력을 할 때는 get 한 데이터를 형변환하지 않지만, 저장을 하거나 사용을 할 때는 원래의 자료형으로 강제 형변환을 해서 사용한다.
			//String[] imsi = ((String[])tmp.get("data"));
			//System.out.print(imsi[j]);
			
			System.out.println();
		}
		
		
	}

}
