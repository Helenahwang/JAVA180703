package awt;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {
	
	//생성자 - 인스턴스를 만들 때 호출하는 메소드
	public LoginWindow() {
		//Frame 크기와 위치 및 타이틀 설정
		setSize(500,500);
		setLocation(200,200);
		setTitle("Login");
		this.setBackground(Color.PINK);
		
		//패널 생성
		Panel panel1 = new Panel();
		
		//TextField
		Label id = new Label("ID");
		TextField txtId = new TextField(20);
		panel1.add(id);
		panel1.add(txtId);
		
		Label password = new Label("PASSWORD");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*'); //(char)97
		panel1.add(password);
		panel1.add(txtPw);
		
		
		//TextArea
		TextArea ta=new TextArea(10,50);
		panel1.add(ta);
		
		
		//Menu 바 만들기
		MenuBar menubar=new MenuBar();
		//메뉴 생성
		Menu file = new Menu("File(f)");
		//메뉴를 메뉴 바에 부착
		menubar.add(file);
		//메뉴아이템 생성
		MenuItem subfile1 = new MenuItem("new");
		//메뉴아이템을 메뉴에 부착
		file.add(subfile1);
		
		MenuItem subfile2 = new MenuItem("save");
		file.add(subfile2);
		
		Menu subfile3 = new Menu("edit->");
		MenuItem subitem1 = new MenuItem("copy");
		subfile3.add(subitem1);
		MenuItem subitem2 = new MenuItem("delete");
		subfile3.add(subitem2);
		file.add(subfile3); //메뉴 안에 메뉴 들어갈 수 있다.
		
		
		//파일 대화상자 만들기
		FileDialog filedg=new FileDialog(this,"new");
		
		//디렉토리 설정
		filedg.setDirectory("C:\\Users\\503-02\\Desktop");
		
		//파일 대화상자를 화면에 출력
		filedg.setVisible(true);
		
		//선택한 파일 경로 가져오기
		String filepath=filedg.getDirectory() + filedg.getFile();
		
		Label label = new Label(filepath);
		add(label);
		
		
		
		//메뉴 바를 윈도우에 배치
		setMenuBar(menubar);
		
	
		
		//패널을 프레임에 부착
		add(panel1);
		
		
		//Frame 화면 출력
		setVisible(true);
	}

}
