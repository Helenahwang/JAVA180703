package polymorphism;

public class Main {

	public static void main(String[] args) {

		//Super 클래스의 인스턴스 생성
		
		Super base = new Super();
		
		//Sub 클래스의 인스턴스 생성
		Sub drive = new Sub();
		
		//상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있다.
		//obj는 기본적으로 Super 것만 호출 할 수 있다.
		
		Super obj=new Sub();
		obj.display();//오버라이딩 된 display()메소드는 Sub() 클래스의 메소드를 사용한다. 
		
		
		
		
		Super obj1=new Super();
		obj1.display();//코드가 같다.
		
		obj1=new Sub();
		obj1.display(); //코드는 똑같지만 서로 다른것을 부른다 => 다형성
		
		
		//하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스 주소를 대입하는 것은 강제 형 변환을 통해서만 가능
		//문제가 발생할 수 있다. //예외가 발생
		//Sub ob2=(Sub)(new Super());

	}

}
