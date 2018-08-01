package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnectionMain {

	public static void main(String[] args) {
		
		
		//데이터베이스 연결 변수 선언
		//반드시 close()를 호출해야 하므로 finally에서 close()를 호출
		Connection con=null;
		try {
			
			//사용하고자 하는 드라이버 클래스는 로드 데이터베이스 종류에 따라 다르다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//확인하기 위한 코드, 이 코드가 출력되지 않으면 드라이버 이름을 확인해보고 드라이버이름이 틀리지 않았다면 ojdbc6.jar가 Referenced Libraries에 포함되어 있는지 확인
			System.out.println("오라클 드라이버 로드 성공");
			
			//데이터베이스 연결
			//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.234:1521:xe","scott","tiger");
			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//연결이 되어 있으면 반드시 연결 해체
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e) {}
			}
		}

	}

}
