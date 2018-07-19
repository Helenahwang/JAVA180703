package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MyWindow1 extends JFrame {

	public MyWindow1() {
		
		String[] data= {
				"Encapsulation","Inheritance","Polymorphism", "Information Hiding"
		};
		
		
		this.setBounds(100,100,400,400);
		this.setTitle("swing");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JList<String> list = new JList<>(data); //다 펼쳐서 보여준다.
		JComboBox<String> combo = new JComboBox<>(data); //콤보박스 
		
		JPanel p = new JPanel();
		
		p.add(list);
		p.add(combo);
		
		add(p);
		
		this.setVisible(true);
		
	}
	
}
