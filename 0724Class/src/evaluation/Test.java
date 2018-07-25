package evaluation;

public class Test {

	public static void main(String[] args) {
		
		int a=10;

		if(a>1 && a++>5){
		}
		System.out.println(a); //11

		a=10;
		
		if(a<1 && a++>5){
		}
		System.out.println(a); //10

		a=10;
		
		if(a>1 || a++>5){
		}
		System.out.println(a); //10

	}

}
