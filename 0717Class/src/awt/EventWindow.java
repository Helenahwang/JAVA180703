package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {

	public EventWindow() {
		
		//윈도우의 시작 좌표와 크기를 설정
		setBounds(200,200,400,400);
		//윈도우의 제목을 설정
		setTitle("Event Example");
		
		//버튼 생성
		Button bt=new Button("button1");
		//여러 개의 컴포넌트들을 묶어 줄 패널 생성
		Panel pan=new Panel();
		//패널에 버튼 추가
		pan.add(bt);
		//패널을 윈도우에 추가
		add(pan);
		
		//윈도우를 화면에 출력
		setVisible(true);
		
		
		//버튼을 누를 때 이벤트 처리는 ActionListener interface가 처리한다
		//인터페이스는 추상메소드를 항상 가지고 있다.
		ActionListener listener1=new ActionListener() {

			@Override
			//버튼이 눌러지면 호출되는 메소드
			public void actionPerformed(ActionEvent e) {
				//프로그램 종료
				System.exit(0);
				
				
			}
			
		};
		
		//버튼과 리스너 연결
		//bt에 ActionEvent가 발생하면 listener1의 메소드를 호출하도록 설정
		bt.addActionListener(listener1);
		
	}
}
