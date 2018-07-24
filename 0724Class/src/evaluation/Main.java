package evaluation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
	
		ArrayList<DTO> al1 = new ArrayList<>();
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(1995, 5, 1);
		Date birth1=cal.getTime();
		
		cal.set(1996, 5, 2);
		Date birth2=cal.getTime();
		
		cal.set(1997, 5, 3);
		Date birth3=cal.getTime();

		cal.set(1998, 5, 4);
		Date birth4=cal.getTime();
		
		cal.set(1999, 5, 5);
		Date birth5=cal.getTime();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일");


		
		DTO dto=new DTO();
		dto.setNum(1);
		dto.setName("수지");
		dto.setScore(50);
		dto.setDate(sdf.format(birth1));
		al1.add(dto);
		
		dto=new DTO();
		dto.setNum(2);
		dto.setName("민아");
		dto.setScore(70);
		dto.setDate(sdf.format(birth2));
		al1.add(dto);
		
		dto=new DTO();
		dto.setNum(3);
		dto.setName("수은");
		dto.setScore(80);
		dto.setDate(sdf.format(birth3));
		al1.add(dto);
		
		dto=new DTO();
		dto.setNum(4);
		dto.setName("혜수");
		dto.setScore(20);
		dto.setDate(sdf.format(birth4));
		al1.add(dto);
		
		dto=new DTO();
		dto.setNum(5);
		dto.setName("지나");
		dto.setScore(10);
		dto.setDate(sdf.format(birth5));
		al1.add(dto);
		
		
		
		Comparator<DTO> comp = new Comparator() { 
			
			@Override
			public int compare(Object o1, Object o2) {
				
				DTO first = (DTO) o1;
				DTO second = (DTO) o2;
				return first.getScore()-second.getScore();
			}
		
		};
		
		al1.sort(comp);
		
		
		System.out.println("-----점수 오름차순 출력-----");

		for(DTO tmp : al1) {
			System.out.println(tmp);
		}
		
		
	}

}
