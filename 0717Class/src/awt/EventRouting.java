package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {

	public EventRouting() {
				//윈도우의 시작 좌표와 크기를 설정
				setBounds(200,200,400,400);
				//윈도우의 제목을 설정
				setTitle("EventRouting Example");
				
				
				
				//버튼 생성
				Button bt1=new Button("Korean");
				Button bt2=new Button("English");
				Button bt3=new Button("Exit");
				
				Label label = new Label();
				
				
				
				
				//여러 개의 컴포넌트들을 묶어 줄 패널 생성
				Panel pan=new Panel();
				//패널에 버튼 추가
				pan.add(bt1);
				pan.add(bt2);
				pan.add(bt3);
				add("Center", pan);
				add("South",label);
				
			
				
				/*
				ActionListener listener3 = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.exit(0);
						
					}
				
				};
				
				bt3.addActionListener(listener3);
				
				ActionListener listener1 = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						label.setText("Hello");
						
					}
				
				};
				
				bt1.addActionListener(listener1);
				
				
				ActionListener listener2 = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						label.setText("Hello Hello");
						
					}
				
				};
				
				bt2.addActionListener(listener2);

				
				
				//패널을 윈도우에 추가
				add(pan);
				
				 */
				
				
				//이벤트 라우팅 - 하나의 리스너가 여러 컴포넌트의 이벤트를 처리하도록 만드는 것
				
				ActionListener listener = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						switch(e.getActionCommand()) { //e.getSource()라면
						case "Korean"://bt1
							label.setText("Hello");
							break;
							
						case "English": //bt2
							label.setText("Hello Hello");
							break;
							
						case "Exit"://bt3
							System.exit(0);
							break;
						}
						
					}
					
				};
				
				bt1.addActionListener(listener);
				bt2.addActionListener(listener);
				bt3.addActionListener(listener);
				
				
				
				
				
				
				
				
				
				//윈도우를 화면에 출력
				setVisible(true);
	}
}
