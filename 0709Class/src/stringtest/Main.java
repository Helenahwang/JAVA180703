package stringtest;

public class Main {

	public static void main(String[] args) {
		
		String str="Hello";
		
		int size=str.length();
		for(int i=0; i<size; i++) {
			char ch=str.charAt(i);
			System.out.print(ch);
		}
		
		System.out.println();
		
		for(int i=0; i<size; i++) {
			char ch1=str.charAt((size-1)-i);
			System.out.print(ch1);
		}
		
		System.out.println();
		

		for(int i=0; i<size; i++) {
			char ch2=str.charAt(i);
			
			if(ch2>='a'&& ch2<='z') {
				ch2=(char)(ch2-32);
			}
			System.out.print(ch2);
				
		}
		
		System.out.println();
		
		String result="";		
		for(int i=0; i<size; i++) {
			char ch3=str.charAt(i);
			
			if(ch3>='A'&& ch3<='Z') {
				ch3=(char)(ch3+32);
			}
			
			result=result+ch3;
					
		}
		System.out.print(result);
	}

}
