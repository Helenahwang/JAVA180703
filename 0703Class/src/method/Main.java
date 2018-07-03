package method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Member member1=new Member();
//		member1.setEmail("aaaaa@gmail.com");
//		member1.setPassword("1234");
//		member1.setNickname("중앙처리장치");
//		member1.setAge(15);
		
		System.out.println("이메일:");
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		member1.setEmail(email);
		
		System.out.println("password:");
		String password=sc.nextLine();
		member1.setPassword(password);
		
		System.out.println("nickname:");
		String nickname=sc.nextLine();
		member1.setNickname(nickname);
		
		System.out.println("age:");
		int age=sc.nextInt();
		member1.setAge(age);
		
		
		
		sc.close();
		
		System.out.println(member1);
		member1.display();
		
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
		
		long m = Math.max(100, 200); //Math클래스에서 static max 메소드 이용
		
		System.out.println(m);

	}

}
