package arrays;

//Comparable의 대부분 메소드는 추상메소드 즉, 오버라이딩 해줘야 한다.
//<1>public class Book implements Comparable {
public class Book{

	private String title;
	private String author;
	private String pubdate;
	private int price;
	
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPubdate() {
		return pubdate;
	}
	public int getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pubdate=" + pubdate + ", price=" + price + "]";
	}
	
	
	/*
	<1>
	//크기 비교하는 메소드
	@Override
	public int compareTo(Object o) {
		
		Book other = (Book)o;
		
		//가격으로 비교
		
		//오름차순
		
//		if(this.price > other.price) {
//			return 1;
//		}else if(this.price == other.price) {
//			return 0;
//		}else {
//			return -1;
//		}

		
		//오름차순
	    //return this.price - other.price; 
	
	    //내림차순
	    //return other.price - this.price;
	    
	    
	    //책 제목으로 비교 // String에 Comparable interface가 이미 implements 되어 있어서 바로 CompareTo 메소드 사용 가능
		return this.title.compareTo(other.title);
	
	}
	
	*/

}
