package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {

		String[] ar= {"Morning", "Afternoon", "Evening"};
		
		
		try {
			int size = ar.length;
		
			for(int i=0; i<size; i++) {
				System.out.println(ar[i]);
				
				if(i>1) {
					throw new NumberFormatException("강제로 예외 발생");				
				}
				
				
				//System.out.println(Integer.parseInt(ar[i]));
			}

		}catch(ArrayIndexOutOfBoundsException e) {
		
			//예외 내용 출력
			System.out.println(e.getMessage()); // =>3
			
			// 예외 내용을 추적
			e.printStackTrace(); // =>java.lang.ArrayIndexOutOfBoundsException: 3 at exceptionhandling.Main2.main(Main2.java:14)
		}catch(NumberFormatException e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			
			// 예외 내용을 추적
			e.printStackTrace();
			
		}finally{
			System.out.println("무조건 실행");
		}
	}

}
