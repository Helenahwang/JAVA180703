package lang;

public class Main2 {

	public static void main(String[] args) {
		User user1=new User();
		user1.setName("아이린");
		
		String[] hobbies= {"노래","춤"};
		user1.setHobbies(hobbies); // user1.setHobbies({"노래","춤"}) 이렇게 하면 안된다.
		System.out.println(user1); //toString때문에 이렇게 괄호안에 user1 바로 쓸수 있다.

		//user1의 데이터가 저장된 곳의 주소를 user에 복사
		User user2=user1;
		user2.setNum(2);
		System.out.println(user1);
		
		
		User user3=user1.clone();
		user3.setNum(3);
		user3.setName("수지");
		user3.getHobbies()[0]="연기"; // clone을 통해 복사된 hobbies를 get통해서 하나만 가지고 와서 그 값만 바꾸려고 한다.
		
		//String[] hobbies1= {"연기","춤"};
		//user3.setHobbies(hobbies1);
		
		System.out.println(user1);
		System.out.println(user3);
	}

}
