package constructor;

public class Main {

	public static void main(String[] args) {


		
		//Practice 클래스의 인스턴스 생성
		Practice pr=new Practice();
		//pr.setName("noname");
		System.out.println(pr.getName());
		
		Practice pr1=new Practice();
		//pr1.setName("noname");
		System.out.println(pr1.getName());
		
		
		Practice pr2=new Practice("Park");
		System.out.println(pr2.getName());
		
		
		String str="Hello World";
		int r= str.lastIndexOf("l");
		System.out.println(r);
		
		int l=str.length();
		System.out.println(l);
		
		
		pr2.display();
	}

}
