package frame;

import java.awt.Button;
import java.awt.Color;

public class ColorThread extends Thread {
	
	private Button button;
	
	public ColorThread(Button button) {
		this.button=button;
	}
	
	public void run() {
		//색상 배열을 생성
		Color[] colors = {Color.RED, Color.yellow, Color.green};
		
		int idx=0;
		while(true) {
			try {	
				button.setBackground(colors[idx%colors.length]);
				Thread.sleep(1000);
				idx++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
