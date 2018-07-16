package thread;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		//스레드 인스턴스 만들기
		ThreadEx2 atm=new ThreadEx2(bank,"ATM"); //bank.job()을 쓰지 않기 위해서 이렇게 한다.
		atm.start();
		
		ThreadEx2 internet = new ThreadEx2(bank,"Internet");
		internet.start();

	}

}
