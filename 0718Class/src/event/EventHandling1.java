package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventHandling1 extends Frame {
	
	public EventHandling1() {
		//위치와 크기 설정
		setBounds(200, 200, 400, 300);
		//제목 설절
		setTitle("Event handling practice");
		this.setBackground(Color.gray);
		
		Panel pn=new Panel();
		
		
		
		TextField tf1=new TextField(5);
		pn.add(tf1);
		Label plus = new Label("+");
		pn.add(plus);
		
		
		TextField tf2=new TextField(5);
		pn.add(tf2);
		Label eq =  new Label("=");
		pn.add(eq);
		
		
		TextField result = new TextField(6);
		pn.add(result);
		
		Button bt=new Button("calculation");
		pn.add(bt);
		
		ActionListener acbt = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String n1 = tf1.getText();//텍스트 가져오기
				String n2 = tf2.getText();
				
				int n3 = Integer.parseInt(n1)+Integer.parseInt(n2);
				
				result.setText(n3+"");
			}
			
		};
		
		bt.addActionListener(acbt);
		
		
		Label lbpw= new Label("password");
		pn.add(lbpw);
		TextField pw = new TextField(15);
		pn.add(pw);
				
		TextField pwResult = new TextField(15);
		pn.add(pwResult);
		
		
		//텍스트 필드의 내용이 변경될 때를 처리할 수 있는 인터페이스의 인스턴스 생성
		TextListener tl=new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				
				String password=pw.getText();
				int dae=0;
				int so=0;
				int su=0;
				int etc=0;
				
				for(int i=0; i<password.length(); i++) {
					char ch=password.charAt(i);
					if(ch>='A' && ch<='Z') {
						dae=dae+1;
					}else if(ch>='a' && ch<='z') {
						so=so+1;
					}else if(ch>='0' && ch<='9') {
						su=su+1;
					}else {
						etc=etc+1;
					}
					
					
				}
				
				if(dae*so*su*etc > 0) {
					pwResult.setText("사용가능한 비밀번호");
				}else {
				
					pwResult.setText("사용불가");

				}
			}
		};
		
		
		pw.addTextListener(tl);

		
		add(pn);
		
		//화면 출력
		setVisible(true);
	}

}
