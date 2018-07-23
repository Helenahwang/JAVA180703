package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) {
		//객체 단위로 데이터를 기록할 수 있는 클래스의 변수 선언
		
		
		/*ObjectOutputStream oos = null;
		try {
			
			oos=new ObjectOutputStream(new FileOutputStream("./oos.txt"));
			
			ObjectMember om = new ObjectMember();
			
			om.setEmail("aaple@gmail.com");
			om.setPhone("020-4938-2837");
			om.setPw("1214");

			//객체를 파일에 기록
			oos.writeObject(om);
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
				try {
					if(oos != null) {
						oos.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}*/
		
		
		ObjectInputStream ois = null;
		try {
			
			ois=new ObjectInputStream(new FileInputStream("./oos.txt"));
			
			//Object member=ois.readObject();
			//member.getemail() => 이렇게 사용 불가 
			
			
			//read로 읽어올 때 Object 타입으로 리턴하기 때문에 강제 형 변환을 해서 원래의 자료형으로 되돌려서 사용해야 한다.
			ObjectMember member=(ObjectMember)ois.readObject();
			System.out.println(member.getEmail());
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
				try {
					if(ois != null) {
						ois.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		

	}

}
