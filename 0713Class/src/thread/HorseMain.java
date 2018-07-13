package thread;

public class HorseMain {

	public static void main(String[] args) {
		
		Horse hr1=new Horse();
		Horse hr2=new Horse();
		Horse hr3=new Horse();
		Horse hr4=new Horse();
		
		
		
		hr1.start();
		hr2.start();
		hr3.start();
		hr4.start();

	}

}
