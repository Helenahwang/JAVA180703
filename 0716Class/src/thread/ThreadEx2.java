package thread;

public class ThreadEx2 extends Thread {

	//Bank 클래스의 메소드를 부를 예정임
	private Bank bank;
	private String name;
	
	//Main에서 생성자에서 Bank와 문자열 1개를 대입받기
	public ThreadEx2(Bank bank, String name) { //밑의 Bank 클래스 안에 있는 메소드를 쓰기 위해서 bank를 인스턴스라고 생각(이미 Main에서 만들어진 인스턴스를 받은 것이다.)
		this.bank = bank;
		this.name = name;
	}
	
	//스레드로 동작할 메소드
	public void run() {
		//bank의 메소드를 3번 호출
		for(int i=0; i<3; i++) {
			bank.job(name); //위의 bank, name
		}
	}
}
