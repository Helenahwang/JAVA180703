package datastructure;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack <String> stck=new Stack<>();
		stck.push("C");
		stck.push("C++");
		stck.push("Python");
		stck.push("Java");
		
		// 데이터가 역순으로 리턴된다. 제거되면서 리턴
		System.out.println(stck.pop());
		System.out.println(stck.pop());
		
		System.out.println("==========PriorityQueue===========");
		
		PriorityQueue <String> que=new PriorityQueue<>(); //크기에 따라서 자동 sort 되서 저장된다.
		que.add("Oracle");   //4
		que.add("MySQR");    //3
		que.add("MSSQR");    //1
		que.add("Mongo DB"); //2
		que.add("Casandra"); //0
		
		System.out.println(que); //자료를 그냥 표현한 것이지, 순서대로 저장되어있는것을 나타낸 것은 아니다.
		System.out.println(que.poll()); 
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());

		System.out.println(que);
	}

}
