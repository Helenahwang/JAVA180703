package practice;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		//Obj 인스턴스의 toString 결과 출력
		//직접 호출하나, 인스턴스 이름만 설정하나 결과는 같다.
		System.out.println(obj.toString());
		System.out.println(obj);
		
		Integer i = 100;
		//toString의 결과는 저장하고 있는 데이터인 100이다.
		System.out.println(i.toString()); //Integer클래스 안에 이미 toString( )메소드를 재정의 하였다.
		System.out.println(i);

		//상위 클래스 타입의 참조형 변수에, 하위 클래스 타입의 인스턴스 참조를 대입할 수 있다.
		Object str = "Hello world";
		System.out.println(str); // 출력만 한다면 Object str을 형변환해서 쓸 필요가 없다. 왜냐면 toString()은 Object 형을 가지고 있어도 호출이 가능하기 때문이다.
		
		//하지만 length()나 charAt()을 쓰려면 String으로 강제 형변환을 해야한다.
		String tmp = (String) str;
		for(int k=0; k<tmp.length();k++) {
			
		}
		
	}

}
