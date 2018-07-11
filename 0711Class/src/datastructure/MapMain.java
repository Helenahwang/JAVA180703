package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name","태연");
		map1.put("age",30);
		map1.put("company", "SM");
		//동일한 키로 다시 저장하면 업데이트가 된다.
		map1.put("company", "SM Town");
		
		//company키에 해당하는 값을 출력하기
		System.out.println(map1.get("company"));
		
		//없는 키의 이름을 사용하면 null을 리턴
		System.out.println(map1.get("position"));

		
		//모든 데이터 조회 - 저장할 때 사용한 Key를 몰라도 조회가능
		//모든 키를 Set으로 저장
		Set<String> Keyss = map1.keySet();
		
		System.out.println("=================key 출력=================");
		for(String tmp : Keyss) {
			System.out.println(tmp); // key 출력
		}
		
		System.out.println("=================key에 해당하는 값 출력=================");
		for(String tmp : Keyss) {
			System.out.println(map1.get(tmp)); // key 출력
		}
		
		System.out.println("=================key와 해당하는 값 출력=================");
		for(String tmp : Keyss) {
			System.out.println(tmp + " : " + map1.get(tmp)); // key 출력
		}		
		
		
		
	}

}
