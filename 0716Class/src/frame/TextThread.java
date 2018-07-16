package frame;

import java.awt.Button;
import java.awt.Color;

public class TextThread extends Thread {

	private Button button;
	
	public TextThread(Button button) {
		this.button=button;
	}
	
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
	
	
}
