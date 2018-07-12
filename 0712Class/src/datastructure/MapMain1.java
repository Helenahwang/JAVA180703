package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {
		//이름과 나이 및 Object를 저장하는 Map 생성
		//HashMap은 Key의 순서를 알 수 없음
		HashMap<String, Object> map1=new HashMap<>();
//		map1.put("name", "아이린");
//		map1.put("age", 28);
//		map1.put("company","SM");
		
		map1.put("이름", "아이린");
		map1.put("나이", 28);
		map1.put("회사","SM");
		
		//전체를 한꺼번에 출력 - toString이 재정의 되어 있음
		System.out.println(map1);
		
		//순서에 상관없이 항목별로 출력 //위에 변수이름이 바껴도 밑에는 바꿀 필요가 없다.
		System.out.println("======================");
		
		Set<String> key1=map1.keySet();
		for(String keyy : key1) {
			System.out.println(keyy + ":" + map1.get(keyy));
		}

		//입력 순서대로 출력하고 싶을 때, LinkedHashMap 이용
		LinkedHashMap<String, Object> map2=new LinkedHashMap<>();
//		map1.put("name", "아이린");
//		map1.put("age", 28);
//		map1.put("company","SM");
		
		map2.put("나이", 28);
		map2.put("이름", "아이린");
		map2.put("회사","SM");
		
		//전체를 한꺼번에 출력 - toString이 재정의 되어 있음
		System.out.println(map2);
		
		//입력 순서대로 출력 //위에 변수이름이 바껴도 밑에는 바꿀 필요가 없다.
		System.out.println("======================");
		
		Set<String> key2=map2.keySet();
		for(String keyy : key2) {
			System.out.println(keyy + ":" + map2.get(keyy));
		}
		
		
		//크기의 순서대로 정렬 TreeMap 이용
		TreeMap<String, Object> map3=new TreeMap<>();
//		map1.put("name", "아이린");
//		map1.put("age", 28);
//		map1.put("company","SM");
		
		map3.put("이름", "아이린");
		map3.put("age", 28);
		map3.put("회사","SM");
		
		//전체를 한꺼번에 출력 - toString이 재정의 되어 있음
		System.out.println(map3);
		
		//크기별로 출력 //위에 변수이름이 바껴도 밑에는 바꿀 필요가 없다.
		System.out.println("======================");
		
		Set<String> key3=map3.keySet();
		for(String keyy : key3) {
			System.out.println(keyy + ":" + map3.get(keyy));
		}
		
		
		
		
		
		
		
	}

}
