package etc;

import java.util.Random;
import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		
		//1부터 45까지의 숫자 6개를 랜덤으로 저장해서 출력
		
		//랜덤으로 숫자를 얻어내기 위해서 랜덤 인스턴스를 생성
		Random r = new Random();
		TreeSet<Integer> lot = new TreeSet<>();
		//for(int i=0; i<6; i++) { //중복되어서 실패하는 것까지 포함된다.
			
		while(lot.size()<6) {
			lot.add(r.nextInt(45)+1);	
		//}
		}
		System.out.println(lot);
	}

}
