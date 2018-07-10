package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main2 {

	public static void main(String[] args) {
		
		//인스턴스 배열 만들기 - 5개 저장할 수 있는 배열 생성
		//아직은 모두 null
		
		Book[] books=new Book[5];
		
		books[0]=new Book();
		books[0].setTitle("삼국지");
		books[0].setAuthor("나관중");
		books[0].setPubdate("2017-08-11");
		books[0].setPrice(30000);
		
		books[1]=new Book();
		books[1].setTitle("춘추");
		books[1].setAuthor("공자");
		books[1].setPubdate("2016-07-11");
		books[1].setPrice(20000);
		
		books[2]=new Book();
		books[2].setTitle("열혈강의 C");
		books[2].setAuthor("윤성우");
		books[2].setPubdate("2015-07-14");
		books[2].setPrice(27000);
		
		
		books[3]=new Book();
		books[3].setTitle("안드로이드 완전 정복");
		books[3].setAuthor("김상형");
		books[3].setPubdate("2013-02-28");
		books[3].setPrice(15000);
		
		books[4]=new Book();
		books[4].setTitle("Swift4");
		books[4].setAuthor("김근영");
		books[4].setPubdate("2018-04-01");
		books[4].setPrice(40000);
		
		for(Book tmp : books) {
			System.out.println(tmp);
		}
		
		//<2>Comparator interface를 implements 한 인스턴스 만들기 + anonymous class
		Comparator <Book> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//데이터 형 변환
				Book first = (Book)o1;
				Book second = (Book)o2;
			
				//가격 비교
				//return first.getPrice() - second.getPrice();
				
				//title 비교
				//return first.getTitle().compareTo(second.getTitle());
				
				//저자 비교
				return first.getAuthor().compareTo(second.getAuthor());
			}
			
		};
		
		Arrays.sort(books, comp);
		
		
		
		
		
		
		
		System.out.println();
		
		//배열의 데이터를 정렬하려면 각 데이터의 크기를 비교할 수 있어야 한다. 
		//Java에서 크기를 비교하려면 Comparable interface의 Compare 메소드 가 필요하다.
		//직접 만든 클래스의 경우에는 클래스의 Comparable interface를 implements 하거나 Comparator interface를 implements한 인스턴스를 같이 대입해야 한다.
		//<1>Arrays.sort(books);
		
		for(Book tmp : books) {
			System.out.println(tmp);
		}
		
		

	}

}
