package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain2 {

	public static void main(String[] args) {
		//정수를 저장하는 ArrayList와 LinkedList를 만들고 중간에 데이터 10만개를 삽입하는데 걸리는 시간 측정
		
		ArrayList<Integer> a1=new ArrayList<>();
		LinkedList<Integer> l1=new LinkedList<>();
		
		a1.add(1);
		a1.add(3);
		a1.add(4);
		
		l1.add(1);
		l1.add(3);
		l1.add(4);
	
		//a1에 10만개를 중간에 넣고 시간 측정
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			a1.add(1,2);
		}

		long end = System.currentTimeMillis();
		System.out.println("ArrayList : "+(end-start));
		
		long start1 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			l1.add(1,2);
		}

		long end1 = System.currentTimeMillis();
		System.out.println("LinkedList : "+(end1-start1));
		
		
		//읽는 시간
		long start3 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			a1.get(i);
		}

		long end3 = System.currentTimeMillis();
		System.out.println("ArrayList : "+(end3-start3));
		
		long start4 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			l1.get(i);
		}

		long end4 = System.currentTimeMillis();
		System.out.println("LinkedList : "+(end4-start4));
		
		
		
	}

}
