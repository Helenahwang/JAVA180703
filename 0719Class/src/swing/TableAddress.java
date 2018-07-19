package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableAddress extends JFrame {

	public TableAddress() {
		
		String[] columns= {"이름", "전화번호", "주소"}; //데이터배열
		String[][] data = {{"박문석", "01012334556", "서울시 양천구 목동"},
				{"제시카", "01010101010", "뉴질랜드 크라이스처치"},
				{"알렉스", "02030304838", "영국 런던"},
				{"브라이언", "29449279403", "영국 런던"}
		};
		
		
		this.setBounds(100,100,1000,500);
		this.setTitle("address");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//테이블 모델 만들기
		DefaultTableModel model = new DefaultTableModel(data, columns); //(데이터 값, 항목)
		//테이블 모델을 이용해서 테이블 만들기
		JTable table = new JTable(model);
		//table.setModel(model);
		//출력 영역의 크기보다 table이 커지더라도 스크롤 바를 이용할 수 있도록 scroll을 생성
		JScrollPane scrollPane = new JScrollPane(table);
		//스크롤 패인을 프레임에 부착
		add(scrollPane);
		//pack() // 크기 조절 안하려면..
		
		
		
		JLabel name = new JLabel("이름");
		JTextField tfname = new JTextField(10);
		JLabel phone = new JLabel("전화번호");
		JTextField tfphone = new JTextField(15);
		JLabel address = new JLabel("주소");
		JTextField tfaddress = new JTextField(30);
		
		JButton btInsert = new JButton("삽입");
		JButton btDelete = new JButton("삭제");
		
		
		JPanel southPanel = new JPanel();
		southPanel.add(name);
		southPanel.add(tfname);
		southPanel.add(phone);
		southPanel.add(tfphone);
		southPanel.add(address);
		southPanel.add(tfaddress);
		southPanel.add(btInsert);
		southPanel.add(btDelete);
		
		add("South",southPanel);
		
		//삽입 버튼의 클릭 이벤트(ActionListener) 처리
		ActionListener insertbt= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//텍스트 필드에 입력된 내용 가져오기
				String name = tfname.getText();
				String phone = tfphone.getText();
				String address = tfaddress.getText();
				
				//좌우 공백 제거하기
				name=name.trim();
				phone=phone.trim();
				address=address.trim();
				
				//name의 필수 입력
				//이름이 입력되지 않은 경우 길이가 0 //null로 쓰지 않도록 주의 => null이라는 것은 이름 자체가 없다는 뜻
				if(name.length() == 0) {
					JOptionPane.showMessageDialog(null, "이름은 필수 입력", "이름",JOptionPane.WARNING_MESSAGE);
					
					//아래쪽을 더이상 수행하지 않도록 리턴
					return;
				}
				
				
				
				
				//테이블의 데이터를 편집하기 위해서 테이블의 데이터 모델을 가져온다.
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				//데이터를 추가하기 위해서 추가할 데이터 배열을 생성
				String[] row = {name, phone, address};
				//모델에 추가
				model.addRow(row);
				//테이블을 갱신
				table.updateUI();
				
				//칸 클리어
				tfname.setText("");
				tfphone.setText("");
				tfaddress.setText("");
				
				//메시지 박스 출력
				JOptionPane.showMessageDialog(null, "데이터 삽입 성공", "삽입 작업", JOptionPane.PLAIN_MESSAGE);
				
			}
			
		};
		
		btInsert.addActionListener(insertbt);
		
		
		ActionListener deleteListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//선택한 행 번호 찾기
				int idx = table.getSelectedRow();
				
				//테이블에서 행을 선택하지 않았다면
				if(!(idx>=0 && idx<table.getRowCount())) {//idx<0 || idx>=table.getRowCount()
					
					JOptionPane.showMessageDialog(null, "행을 선택하세요!","삭제 실패", JOptionPane.WARNING_MESSAGE);
					return; //더이상 진행되면 안되니까
					
				}
				
				
				
				
				//테이블의 모델 가져오기
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				
				//선택한 행에 해당하는 데이터 지우기
				model.removeRow(idx);
				table.updateUI();
				JOptionPane.showMessageDialog(null, "데이터 삭제 성공", "삭제", JOptionPane.WARNING_MESSAGE);
				
				
				
				
			}
			
		};
		
		btDelete.addActionListener(deleteListener);
		
		
		this.setVisible(true);
		
	}
}
