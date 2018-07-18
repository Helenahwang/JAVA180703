package event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class KeyEventHandling extends Frame {

	public KeyEventHandling() {
		setBounds(100,100,500,500);
		setTitle("keyboard Event");
		
		setLayout(null);
		Label air = new Label("@");
		air.setBounds(20,70,30,30);
		add(air);
		
		
		KeyListener kl=new KeyListener() {

			@Override
			//문자 키를 눌렀을 때
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			//키보드를 눌렀을 때 호출되는 메소드
			public void keyPressed(KeyEvent e) {
				int x=air.getLocation().x;
				int y=air.getLocation().y;
				
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {

					//air.setLocation(x,y+10);
					y=y+10;
					
				}else if(e.getKeyCode() == KeyEvent.VK_UP) {
					
					//air.setLocation(x,y-10);
					y=y-10;
					
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					
					//air.setLocation(x+10,y);
					x=x+10;
					
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					
					x=x-10;
					
				}
				
				air.setLocation(x, y);
				
				//alt=8
				if(e.getModifiers() == KeyEvent.SHIFT_MASK && e.getKeyCode() == KeyEvent.VK_F1) {
					System.exit(0);
				}
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Label label = new Label("bullet");
					label.setBounds(air.getLocation().x, air.getLocation().y-20, 30,30);
					add(label);
					
					Thread th=new Thread() { 
						public void run() {
							try {
								while(true) {
								Thread.sleep(100);
								int x=label.getLocation().x;
								int y=label.getLocation().y;
								label.setLocation(x,y-5);
								
								if(y<150)
									break;
								}
								label.setVisible(false);
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
					
					th.start(); //enter를 누르면 thread가 시작된다.
				}
					
			}

			@Override
			//키보드에서 손을 뗄 때
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		addKeyListener(kl);
		
		/*
		
		//윈도우 조작을 위한 이벤트를 처리하기 위한 리스너
		WindowListener wl=new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			//종료 버튼을 누를 때 호출되는 메소드
			public void windowClosing(WindowEvent e) {
				//프로그램 종료
				System.exit(0);
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		*/
		
		
		
		//윈도우 조작을 위한 이벤트를 처리하기 위한 어답터, 안쓰는 다른 추상 메소드를 override할 필요가 없다.
		WindowAdapter wl=new WindowAdapter() {
			
			@Override
			//종료 버튼을 누를 때 호출되는 메소드
			public void windowClosing(WindowEvent e) {
				//프로그램 종료
				System.exit(0);
				
			}
	
		};
		
		
		
		//프레임에 윈도우 이벤트 연결
		addWindowListener(wl);
		
		
		setVisible(true);
	}
}
