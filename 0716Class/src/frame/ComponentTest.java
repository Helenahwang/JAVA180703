package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ComponentTest extends Frame {

	public ComponentTest() {
		//Frame(Window) 만들기
		setTitle("체크박스 테스트");
		setLocation(100,100);
		setSize(500,500);
		this.setBackground(Color.PINK);
		
		//Panel 생성
		Panel p = new Panel();
		
		//체크박스 생성
		Checkbox cb1=new Checkbox("reading books");
		Checkbox cb2=new Checkbox("listening to musics");
		Checkbox cb3=new Checkbox("playing games");
		Checkbox cb4=new Checkbox("programming");
		
		//체크박스 Panel에 적용
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		
		//라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("male",group, true);
		Checkbox woman = new Checkbox("female",group, false);
		//라디오 버튼을 Panel에 적용
		p.add(man);
		p.add(woman);	
		
		
		//초이스 만들기
		Choice ch=new Choice();
		ch.add("spring");
		ch.add("summer");
		ch.add("fall");
		ch.add("winter");
		//초이스를 Panel에 적용
		p.add(ch);
		

		//리스트 만들기
		List list=new List(5, true); //5개를 보여주고, 여러개를 선택할 수 있도록 해주는 List
		list.add("C&C++");
		list.add("C#");
		list.add("java");
		list.add("javaScript");
		list.add("Objective-C");
		list.add("Python");
		list.add("Swift");
		list.add("Kotlin");
		list.add("Scala");
		
		//리스트를 Panel에 적용
		p.add(list);
		
		//리스트의 remove(int idx)를 이용하면 idx 번째를 지울 수 있다.
		//list.remove(0);
		
		//첫번째에 있는 C&C++과 5번째에 있는 Object-C를 제거
		list.remove(4);
		list.remove(0);
		
		
		
		
		//Panel을 Frame에 적용
		add(p);
		
		setVisible(true);
	}
}
