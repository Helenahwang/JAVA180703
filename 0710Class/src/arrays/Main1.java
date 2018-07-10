package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		
		String[] ar= {"Java", "Oracle", "Web Front End", "Web Back End - Java", "Android", "ios"};
		
		//Oracle의 위치 검색
		int idx=Arrays.binarySearch(ar, "Oracle");
		System.out.println(idx);

		//Android의 위치 검색
		int idx1=Arrays.binarySearch(ar, "Android");
		System.out.println(idx1);	// 정렬을 하지 않고 찾았기 때문에 -1이 나온다.
		
		//ar 정렬
		Arrays.sort(ar); //대문자 정렬이 먼저
		
		for(String tmp:ar) {
			System.out.print(tmp+" ");
			
		}
		System.out.println();
		
		int idx2=Arrays.binarySearch(ar, "Android");
		System.out.println(idx2);
		
	}

}
