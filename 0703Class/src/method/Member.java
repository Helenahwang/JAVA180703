package method;

public class Member {
	private String email;

	// email의 getter
	public String getEmail() {
		return email;
	}
	// email의 setter
	public void setEmail(String arg) {
		email = arg;
	}

	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String arg) {
		password = arg;
	}

	private String nickname;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Member [email=" + email + ", password=" + password + ", nickname=" + nickname + ", age=" + age + "]";
	}
	
	
	public void display() {
		// 인스턴스 변수들을 출력해주는 메소드
		// 클래스 안에서 클래스에 만들어진 변수를 사용할 때는
		// 인스턴스나 클래스 이름을 기재하지 않습니다.

		System.out.println("이름:" + email + "\t" + "비밀번호:" + password + "\t" + "닉내임:" + nickname + "\t" + "나이:" + age);

	}
	
	//static 메소드:클래스 이름으로 호출할 수 있는 메소드
	//매개변수 ... 이 있으면 매개변수 개수에 상관없이 대입 가능
	
	public static int sum(int...ar) {
		
		int tot=0;
		
		//heap에 있는 데이터를 stack에 저장
		//자주 사용하기 때문에 heap에 있으면 효율이 떨어짐
		int len=ar.length;
		
		for(int i=0; i<len; i=i+1) {
			tot=tot+ar[i];
		}
		return tot;
	}
		

}
