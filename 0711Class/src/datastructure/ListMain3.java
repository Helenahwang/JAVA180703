package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		//정수 List와 문자 List의 정렬
		
		ArrayList <Integer> ar=new ArrayList<>();
		LinkedList <String> li=new LinkedList<>();
		
		ar.add(1);
		ar.add(3);
		ar.add(4);
		ar.add(2);
		
		
		
		Comparator<Integer> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				Integer first = (Integer) o1;
				Integer second = (Integer) o2;
				return first-second;
			}
		
		};
		
		ar.sort(comp);
		//List는 toString 재정의 되어 있어서 인스턴스를 출력하면 데이터가 순서대로 toString을 호출한다.
		System.out.println(ar);
	
		li.add("데니스 리치히");
		li.add("제임스 고슬링");
		li.add("라누스 토발즈");
		
		Comparator<String> comp1 = new Comparator() { //하나의 인스턴스만 생성하고 쓸거라 anonymous class 이용한다.

			@Override
			public int compare(Object o1, Object o2) {
				
				String first = (String) o1;
				String second = (String) o2;
				
				//return first.compareTo(second); //오름차순
				return second.compareTo(first); // 내림차순
			}	
			
		};
		
		li.sort(comp1);
		
		System.out.println(li);
		
	
		
	}

}
