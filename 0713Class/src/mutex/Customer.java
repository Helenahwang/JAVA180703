package mutex;

import java.util.ArrayList;

//List에서 데이터를 26번 꺼내서 출력하는 스레드
public class Customer extends Thread {
	private ArrayList<Character> list2;
	
	public Customer(ArrayList<Character> list2) {
		this.list2=list2;
	}
	
	//list에서 26개를 꺼내서 출력하는 메소드
	public synchronized void get() {
		//for(int i=0; i<26; i=i+1) {
			//list에 데이터가 없으면 대기
			if(list2.size()==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			char ch=list2.remove(0); //0번째 것을 항상 지운다.
			System.out.println(ch+"를 소비했습니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	//}
	public void run() {
		for(int i=0; i<26; i++) {
			get();
		}
	}

}
