package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	
	public ItemWindow() {
		setBounds(300, 300, 500, 700);
		setTitle("Event Handling");
		this.setBackground(Color.pink);
		
		Panel pn1=new Panel();
		
		Checkbox chboolean = new Checkbox("boolean");
		Checkbox chbyte = new Checkbox("byte");
		Checkbox chshort = new Checkbox("short");
		Checkbox chchar = new Checkbox("char");
		Checkbox chint = new Checkbox("int");
		Checkbox chlong = new Checkbox("long");
		Checkbox chfloat = new Checkbox("float");
		Checkbox chdouble = new Checkbox("double");
		
		pn1.add(chboolean);
		pn1.add(chbyte);
		pn1.add(chshort);
		pn1.add(chchar);
		pn1.add(chint);
		pn1.add(chlong);
		pn1.add(chfloat);
		pn1.add(chdouble);
		
		add("North",pn1);


		//중앙에 textArea 배치
		TextArea ta = new TextArea(10,70);
		add("Center",ta);

		
		

		//체크 박스를 눌렀을 때 호출될 메소드
		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				//이벤트가 발생한 인스턴스를 원래의 자료형인 checkbox로 변환
				//이벤트 처리 메소드에서 e.getSource()는 이벤트가 발생한 인스턴스의 주소를 리턴한다.
				Checkbox cb = (Checkbox)(e.getSource());
				//체크 박스에 입력된 텍스트 가져오기
				String label = cb.getLabel();
				//체크 박스 선택 여부 가져오기
				boolean b =cb.getState();
				
				ta.append(label+" "+b+"로 변경\n");
				
			}
			
		};
		
		chboolean.addItemListener(itemHandler1);
		chbyte.addItemListener(itemHandler1);
		chshort.addItemListener(itemHandler1);
		chchar.addItemListener(itemHandler1);
		chint.addItemListener(itemHandler1);
		chlong.addItemListener(itemHandler1);
		chfloat.addItemListener(itemHandler1);
		chdouble.addItemListener(itemHandler1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//콤보박스 2개 배치
		//콤보박스에 배치할 데이터 만들기
		String[] category = {"Programing","Database","IDE","Framework"};
		String[][] content = {{"Java","JavaScript","Swift"},{"Oracle","MySQL","MongoDB"},{"Eclopse","Android Studio","Xcode"},{"Spring", "MyBatis","Hibernate"}};
		
		
		Choice cho1=new Choice();
		for(String tmp : category) {
			cho1.add(tmp);
		}
		
		Choice cho2=new Choice();
		for(String tmp : content[0]) {
			cho2.add(tmp);
		}
		
		
		Panel pn2=new Panel();
		
		
		pn2.add(cho1);
		pn2.add(cho2);
		
		
		//카테고리 콤보 박스의 선택이 변경되었을 때 호출될 메소드를 가진 Listener ItemListener가 처리
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//cho1의 선택된 행 번호 가져오기
				int row=cho1.getSelectedIndex();
				//cho2의 모든 내용 지우기
				cho2.removeAll();
				//행번호에 해당하는 세부 내용을 cho2에 추가
				for(String tmp : content[row]) {
					cho2.add(tmp);
				}
				
			}
			
		};
		
		
		cho1.addItemListener(itemHandler2);
		
		
		
		
		
		
		
	
		Button bt2 = new Button("select");
		pn2.add(bt2);
		
		ActionListener el2=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int caNum=cho1.getSelectedIndex();
				int coNum=cho2.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				ta.setText(categoryText + " : "+contentText);
				
			}
			
		};
		
		bt2.addActionListener(el2);
		
		
		

		
		
		Button bt1=new Button("exit");
		pn2.add(bt1);
		
		ActionListener el1=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
		};
		
		bt1.addActionListener(el1);
		
		

		add("South",pn2);
		
		
		
		
		
		
		
		setVisible(true);
		
	}

}
