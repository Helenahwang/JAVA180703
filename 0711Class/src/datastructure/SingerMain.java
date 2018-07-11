package datastructure;

import java.util.ArrayList;

public class SingerMain {

	public static void main(String[] args) {
		
		ArrayList<Singer> list=new ArrayList<>();
		
		Singer singer = new Singer();
		singer.setName("수지");
		singer.setAge(25);
		list.add(singer);
		
		singer=new Singer(); //이미 리스트에 이전 데이터를 넣었기 때문에 같은 변수명에 새로운 데이터를 저장해도 된다. 이 전 데이터는 없어진다.
		singer.setName("설현");
		singer.setAge(24);
		list.add(singer);
		
		singer=new Singer();
		singer.setName("태현");
		singer.setAge(30);
		list.add(singer);

		//리스트의 모든 데이터 확인
		System.out.println(list);
		
		//각각의 데이터 확인
		for(Singer tmp : list) {
			System.out.println(tmp);
		}
		
		
	}

}
