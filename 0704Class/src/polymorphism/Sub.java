package polymorphism;

public class Sub extends Super{

	//display 메소드를 오버라이딩
	
	@Override //이 어노테이션을 썻을때 에러 발생 안하면 제대로 오버라이드 된 것이다.
	public void display() {
		System.out.println("How are you?");
	}
	
	public void show() {
		System.out.println("하위 클래스에 만든 메소드");
	}
	
}
