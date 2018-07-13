package thread;

public class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		
		String msg = "메가스터디";
		
		int idx=0;
		while(true){
			String str=""; //str null로 초기화
			
			for(int i=0; i<msg.length(); i++) {
				char ch=msg.charAt((idx+i)%msg.length());
				str=str+ch;
				//System.out.println(str);
			}
			
			System.out.println(str);
			try {
				Thread.sleep(1000);
				idx++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
