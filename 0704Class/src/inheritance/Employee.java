package inheritance;

//직업 정보를 저장하기 위한 클래스
public class Employee {

	protected int num; //상속하려면 private -> protected
	protected String name; // 상속하려면  private -> protected
	
	
	//num 값을 일련번호로 만들기 위한 공유 변수 - static
	protected static int autoincrement; // 상속하려면 private -> protected
	
	
	//생성자
	
	//public Employee(int n){
	public Employee(){
		autoincrement = autoincrement+1;
		num=autoincrement;
	}
	
	
	//인스턴스 변수를 사용할 수 있도록 하기 위한 접근자 메소드
	
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//값을 확인하기 쉽게 하기 위한 메소드	
		@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}
	
	
	
}
