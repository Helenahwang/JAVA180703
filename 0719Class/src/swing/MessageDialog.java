package swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDialog extends JFrame {

	public MessageDialog() {
		
		this.setBounds(100,100,400,400);
		this.setTitle("Messagedialog");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	
		//JOptionPane.showConfirmDialog(null, "메시지 다이얼로그", "대화상자", JOptionPane.YES_NO_OPTION);
		
		
//		int r =JOptionPane.showConfirmDialog(null, "메시지 다이얼로그", "대화상자", JOptionPane.YES_NO_OPTION);
//		System.out.println(r);

		String r=JOptionPane.showInputDialog(null, "메시지 다이얼로그", "대화상자", JOptionPane.YES_NO_OPTION);
		System.out.println(r);



		this.setVisible(true);
	}

}
