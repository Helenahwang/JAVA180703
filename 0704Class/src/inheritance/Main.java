package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Employee em1=new Employee();
		Employee em2=new Employee();
		
		//객체의 내용을 확인하고자 하면 System.out.println 메소드에 객체의 이름만 대입
		System.out.println(em1);
		System.out.println(em2);
		
		//em1.setNum(num);
		
		
		Manager ma1=new Manager();
		System.out.println(ma1);

	}

}
