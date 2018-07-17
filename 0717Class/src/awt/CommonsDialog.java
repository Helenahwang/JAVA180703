package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {

	public CommonsDialog() {
		
		setBounds(100,100,500,500); //위치와 크기
		setTitle("CommonDialog"); //제목 설정
		
		setVisible(true); //화면 출력
		
		//FileDialog 객체를 생성해서 화면에 출력하고 선택한 파일 경로를 레이블에 출력
		//FileDialog를 생성할 때 첫번째 매개변수가 Dialog나 Frame의 주소인데 지금의 경우는 this를 대입하면 된다.
		
		//FileDialog 인스턴스 생성
		FileDialog fd=new FileDialog(this);
		//화면 출력	
		fd.setVisible(true);
		//선택한 디렉토리와 파일이름 가져오기
		String filePath = fd.getDirectory()+fd.getFile();
		
		//레이블 생성
		Label label = new Label(filePath);
		add(label);
		
		setResizable(false);
	}
}
