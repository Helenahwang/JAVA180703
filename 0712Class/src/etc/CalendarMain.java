package etc;

import java.sql.Date;
import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar meetDay = Calendar.getInstance();
		//meetDay.set(Calendar.YEAR, 1986);
		//meetDay.set(Calendar.MONTH, 4);
		//meetDay.set(Calendar.DAY_OF_MONTH, 5);
		
		meetDay.set(1986, 4, 5);;
		//System.out.println(meetDay);
		Date date=new Date(meetDay.getTimeInMillis());
		System.out.println(date);
		
		final String[] DAYOFWEEK = { "", "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(DAYOFWEEK[meetDay.get(Calendar.DAY_OF_WEEK)] + "요일"); 
		
		Calendar toDay = Calendar.getInstance();
		long gap =toDay.getTimeInMillis() - meetDay.getTimeInMillis();
		System.out.println("제시카를 만난지 " + (gap/24/60/60/1000)+"일 째 되는 날입니다.");
		
		
	}

}
