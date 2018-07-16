package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class Windows extends Frame {
	//생성자
	public Windows() {
		
		this.setBackground(Color.PINK);
		setSize(800,800);
		setLocation(100,100);
		setTitle("나의 첫번째 윈도우 프로그램");
		setVisible(true);	
		
		//패널은 하나만 만들면 된다.
		Panel panel = new Panel();
		
		Button button = new Button();
		//TextThread tx1=new TextThread(button);
		Thread th=new Thread() {
			public void run() {
				//색상 배열을 생성
				String[] text = {"check1", "check2", "check3"};
				
				int idx=0;
				while(true) {
					try {	
						button.setLabel(text[idx%text.length]);
						Thread.sleep(1000);
						idx++;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		};
		
		th.start();
		panel.add(button);
		
		
		Button button1= new Button("save");
		//버튼의 색변경하는 스레드
		//ColorThread th1=new ColorThread(button1);
		Thread th1=new Thread() {
			public void run() {
				//색상 배열을 생성
				Color[] colors = {Color.RED, Color.yellow, Color.green};
				
				int idx=0;
				while(true) {
					try {	
						button1.setBackground(colors[idx%colors.length]);
						Thread.sleep(1000);
						idx++;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
			}
		};
		
		
		th1.start();
		panel.add(button1);
	
	
		add(panel);		
	
		/*
		int sign=1;
		while(true) {
			
			try {
				Thread.sleep(1000);
				if(sign>0) {
					button1.setBackground(Color.YELLOW);
				}
				else {
					button1.setBackground(Color.red);
				}
				sign=-sign;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
		*/
		
//		Button button2 =  new Button("cancel");
//		button2.setBackground(Color.black);
//		button2.setForeground(Color.CYAN);
//		panel.add(button2);
		
		//패널을 프레임에 추가
	
		
//		Dialog dia=new Dialog(this,"대화상자 만들기",true);
//		dia.setSize(500, 300);
//		dia.setVisible(true);
	}

}
