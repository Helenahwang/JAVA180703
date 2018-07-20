package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {

		//키보드로부터 줄 단위로 입력을 받을 수 있는 클래스의 참조형 변수 선언
		//finally절에서 close할 수 있도록 try밖에서 변수를 선언한다.

		BufferedReader br=null;

		try {


			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("이름 :");
			String name = br.readLine();
			
			System.out.println("나이 :");
			String age = br.readLine();
			int age1=Integer.parseInt(age);
			
			System.out.println("키 :");
			String height = br.readLine();
			double height1=Double.parseDouble(height);

			Member mb=new Member();
			mb.setName(name);
			mb.setAge(age1);
			mb.setHeight(height1);
			
			//맵을 이용해서 저장
			Map<String, Object> mp = new HashMap<>();
			mp.put("name",name);
			mp.put("age", age1);
			mp.put("height", height1);
			
	
			// 출력할 때는 VO클래스나 Map이 별 차이가 없다.
			System.out.println(mb);
			System.out.println(mp);
			
			// 하지만 가져와서 사용할때는 조금 다르다. 
			// 나이를 1씩 더해보자!
			int addage =mb.getAge() + 1;
			
			// Map에서는 데이터를 가져와서 사용할 때 강제 형 변환을 해야한다. 
			int addage1= (Integer)(mp.get("age"))+1;
			
			System.out.println(addage);
			System.out.println(addage1);

		}catch(Exception e) {

		}finally{
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
