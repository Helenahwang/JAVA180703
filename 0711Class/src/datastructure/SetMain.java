package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		HashSet<String> song = new HashSet<>();

		song.add("BAAM");
		song.add("장마");
		song.add("빨간 맛");
		song.add("11:11");
		song.add("BAAM"); //Set은 중복 허용 안함
		song.add("gee");
		
		System.out.println("=============HashSet==============");
		for(String tmp : song) {
			System.out.println(tmp); //아무순서대로
		}
		
		
		TreeSet<String> song1 = new TreeSet<>();
		song1.add("BAAM");
		song1.add("장마");
		song1.add("빨간 맛");
		song1.add("11:11");
		song1.add("BAAM");
		song1.add("gee");
		
		System.out.println("=============TreeSet==============");
		
		for(String tmp1 : song1) {
			System.out.println(tmp1); //크기 순대로
		}
		
		
		LinkedHashSet<String> song2 = new LinkedHashSet<>();
		song2.add("BAAM");
		song2.add("장마");
		song2.add("빨간 맛");
		song2.add("11:11");
		song2.add("BAAM");
		song2.add("gee");
		
		System.out.println("=============LinkedHashSet==============");
		
		for(String tmp2 : song2) {
			System.out.println(tmp2); // 저장 순서대로
		}
		
		
		
		
	}

}
