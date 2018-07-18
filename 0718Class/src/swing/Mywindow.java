package swing;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

//윈도우 클래스
public class Mywindow extends JFrame {
	
	public Mywindow() {
		//위치와 크기 설정
		setBounds(100,100,800,800);
		//제목 설정
		setTitle("스윙을 이용한 윈도우");
		//종료 버튼 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//패널을 생성
		JPanel panel = new JPanel();
		
	
		ImageIcon icon=new ImageIcon("C:\\Users\\503-02\\Pictures\\cake.jpg");
		
		//JLabel label = new JLabel(icon);
		
		JLabel label = new JLabel();
		label.setIcon(icon);
		
		//JLabel label = new JLabel("label");
		
		
		label.setToolTipText("Hello");
		
		panel.add(label);
	

		
		//TitledBorder border = new TitledBorder("line");
		EtchedBorder border = new EtchedBorder();

		
		


		JButton btn = new JButton("버튼");
		panel.add(btn);
		//add("South",panel1);
		//add(panel1);
		
		
		//패널을 프레임에 부착
		add(panel);

			//화면 출력
		setVisible(true);
		
		
		
		
		
		//String[] images = {"heli1.png","heli2.png","heli3.png"};
		
		ArrayList<String> list = new ArrayList<String>();
//		list.add("heli1.png");
//		list.add("heli2.png");
//		list.add("heli3.png");
		
		list.add("greenteacake.jpg");
		list.add("flowercake.jpg");
		list.add("cake.jpg");
		
		
		//이미지가 변경되는 동안에도 다른 작업을 할 수 있어야하므로 이미지 변경은 스레드로 생성
		Thread th = new Thread() {
			public void run() {
				
				int idx=0;
				
				while(true) {
					try {
						
						Thread.sleep(1000);
						//ImageIcon icon = new ImageIcon("C:\\Users\\503-02\\Pictures"+images[idx%images.length]);
						ImageIcon icon = new ImageIcon("C:\\Users\\503-02\\Pictures\\"+list.get(idx%list.size()));
						
						label.setIcon(icon);
						panel.add(label);
						add(panel);
						idx=idx+1;
					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
	
		th.start();
		


		
	}

}
