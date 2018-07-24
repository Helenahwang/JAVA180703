package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;


public class PracticeMain {

	public static void main(String[] args) {
		
	/*
		ObjectOutputStream oos = null;
		Date date=new Date();
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("./oos1.txt"));
			
			
			//밑에 처럼 쓰기보다는 List를 써서 보낸다. add 써서 
			
			for( int i=0; i<10; i++) {
				Practice pr=new Practice();
				pr.setA(1.4+i);
				pr.setB(1.8+i);
				pr.setD(date.getTime());
				oos.writeObject(pr);
			}
			
			ArrayList<String> al=new ArrayList<>();

			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
			try {
				oos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
	*/
		
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("./oos1.txt"));
			
			for(int i=0; i<10; i++) {
				Practice pr =(Practice)ois.readObject();
				System.out.println(pr);
			}
			
			//읽어올때는 List로 한번에 다 받아서.
			//System.out.println( )표시 할 때는 for문으로 해서 나타내야한다.
			   
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
			try {
				ois.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
	
	

	}

}
