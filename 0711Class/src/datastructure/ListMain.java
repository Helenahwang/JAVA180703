package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("아이린");
		arrayList.add("나나");
		arrayList.add("설현");
		arrayList.add("태연");
		arrayList.add("미나");
		
		System.out.println("데이터 개수:" + arrayList.size());
		
		for(String tmp : arrayList) {
			System.out.println(tmp);
		}
		
		System.out.println("=========================");
		//2번째 데이터 출력하기
		System.out.println(arrayList.get(2));
		
		arrayList.remove(3);
		System.out.println("=========================");
		System.out.println("데이터 개수:" + arrayList.size());
		for(String tmp : arrayList) {
			System.out.println(tmp);
		}
		
		arrayList.add(2, "수지");
		System.out.println("=========================");
		System.out.println("데이터 개수:" + arrayList.size());
		for(String tmp : arrayList) {
			System.out.println(tmp);
		}
		
		System.out.println("===========LinkedList==============");
		
		LinkedList<String> arrayList1 = new LinkedList<>();
		
		//위의 것 그대로
		arrayList1.add("아이린");
		arrayList1.add("나나");
		arrayList1.add("설현");
		arrayList1.add("태연");
		arrayList1.add("미나");
		
		
		System.out.println("데이터 개수:" + arrayList1.size());
		
		for(String tmp : arrayList1) {
			System.out.println(tmp);
		}
		
		
		

	}

}
