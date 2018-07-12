package etc;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	public static void main(String[] args) {
		
		
		Date date= new Date();
		int money = 6570000;
		//0000년 00월 00일 00요일 00시 00분 00초 형식으로 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일 a hh시 mm분 ss초");
		String msg = sdf.format(date);
		System.out.println(msg);
		
		
		//6,570,000로 출력
		DecimalFormat sdf1=new DecimalFormat("\u00A4 #,##0"); //숫자가 안들어있으면 0으로 보여주기 위해서 뒤에 0 넣는다.
		String msg1 = sdf1.format(money);
		System.out.println(msg1);
		
		

	}

}
