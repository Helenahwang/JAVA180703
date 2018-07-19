package swing;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class Menu extends JFrame {

	public Menu() {
		this.setBounds(100,100,400,400);
		this.setTitle("Messagedialog");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//메뉴 바를 생성
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("파일(a)");
		//단축키 생성
		file.setMnemonic('a');
		
		JMenuItem item1 = new JMenuItem("열기");
		file.add(item1);
		
		JMenuItem item2 = new JMenuItem("저장");
		file.add(item2);
		
		JMenuItem item3 = new JMenuItem("편집");
		file.add(item3);
		
		//파일에 아이템을 표현
		file.add(item1);
		file.add(item2);
		file.add(item3);
		
		
		menuBar.add(file);
		setJMenuBar(menuBar);
		
		
		this.setVisible(true);

	}


}
