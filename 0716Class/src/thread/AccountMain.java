package thread;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account=new Account();
		ThreadEx3 th1=new ThreadEx3(account); 
		ThreadEx4 th2=new ThreadEx4(account);
		
		th1.start(); //save() 메소드를 사용하기 위해
		th2.start(); //withdraw() 메소드를 사용하기 위해
		

	}

}
