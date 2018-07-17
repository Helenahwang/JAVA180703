package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		
		setBounds(100,100,500,500); //위치와 크기
		setTitle("Layout Practice"); //제목 설정
		this.setBackground(Color.pink);
		setVisible(true); //화면 출력
	
		Panel panel = new Panel();
		
		/*
		//panel의 레이아웃을 설정
		panel.setLayout(new FlowLayout());
		
		Button btn=null;
		//컴포넌트 배치
		for(int i=0; i<10; i++) {
			btn = new Button("button"+(i+1));
			btn.setBackground(Color.black);
			btn.setForeground(Color.white);
			panel.add(btn);
		}
		
		*/
		
		
		
		/*
		panel.setLayout(new BorderLayout());
		Button btnWest = new Button("west");
		panel.add("West", btnWest);
		Button btnEast = new Button("east");
		panel.add("East", btnEast);
		Button btnCenter = new Button("center");
		panel.add("Center", btnCenter);
		*/
		
		
		/*
		
		panel.setLayout(new GridLayout(2,3,10,10));
		for(int i=0; i<15; i++) {
			Button btn=new Button("button"+(i+1));
			panel.add(btn);
		}
		
		*/
		
		//컴포넌트의 크기와 위치를 마음대로 변경할 수 있다.
		panel.setLayout(null);
		Label label =  new Label("@");
		label.setBounds(50,50,50,50);
		add(label);
		
		
		
		add(panel);
		setResizable(false); //화면 크기 조절을 못하도록 설정
		
		
		Thread th=new Thread() {
			public void run() {
				while(true) {

						try {
							
							//현재 레이블의 위치를 가져오기
							int x=label.getLocation().x;
							int y=label.getLocation().y;
							
							//label.setLocation(x+10,y); //x축으로 10씩 움직인다.
							
							Random r=new Random();
							label.setLocation(r.nextInt(300), r.nextInt(300)); //랜덤으로 나타난다.
							
							Thread.sleep(500);
							
							
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}
			}
		};
		
		th.start();
		
	}

}
