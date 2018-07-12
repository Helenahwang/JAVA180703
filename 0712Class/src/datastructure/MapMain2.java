package datastructure;

public class MapMain2 {

	public static void main(String[] args) {
		//프로야구 팀 별 선수 명단을 배열로 만들기
		String[] kia = {"윤석민", "안치홍", "김선빈"};
		String[] hanhwa = {"권혁", "정근우"};
		String[] lotte = {"레일리", "이대호"};
		
		//String 배열의 배열
		String[][] players = {kia, hanhwa, lotte};
		
		//이차원 배열의 데이터 출력
		//큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for(int i=0; i<players.length; i++) {
			if(i==0) {
				System.out.print("KIA:"+"\t");	
			}else if(i==1) {
				System.out.print("한화:"+"\t");
			}else if(i==2) {
				System.out.print("롯데:"+"\t");
			}
			
			
			String[] imsi = players[i];
			//작은 배열의 데이터 개수만큼 반복
			for(int j=0; j<imsi.length; j++) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}

	}

}
