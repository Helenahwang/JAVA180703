package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class SingerMain {

	public static void main(String[] args) {
		
		ArrayList<Singer> list1=new ArrayList<>();
		
		Singer singer = new Singer();
		singer.setName("수지");
		singer.setAge(25);
		list1.add(singer);
		
		singer=new Singer(); //이미 리스트에 이전 데이터를 넣었기 때문에 같은 변수명에 새로운 데이터를 저장해도 된다. 이 전 데이터는 없어진다.
		singer.setName("설현");
		singer.setAge(24);
		list1.add(singer);
		
		singer=new Singer();
		singer.setName("태현");
		singer.setAge(30);
		list1.add(singer);

		//리스트의 모든 데이터 확인
		System.out.println(list1);
		
		//각각의 데이터 확인
		for(Singer tmp : list1) {
			System.out.println(tmp);
		}
		
		
		
		Comparator<Singer> comp = new Comparator() { //내가 만든 클래스일 경우

			@Override
			public int compare(Object o1, Object o2) {
				
				Singer first = (Singer) o1;
				Singer second = (Singer) o2;
				return first.getAge()-second.getAge();
			}
		
		};
		
		list1.sort(comp);
		
		
		System.out.println("============sort 후=============");
		//각각의 데이터 확인
		for(Singer tmp : list1) {
			System.out.println(tmp);
		}
		
		
		
		
		
		
	}

}
