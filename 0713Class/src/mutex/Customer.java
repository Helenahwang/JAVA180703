package mutex;


//List에서 데이터를 26번 꺼내서 출력하는 스레드
public class Customer extends Thread {
	private ShareData shareData;
	
	public Customer(ShareData shareData) {
		this.shareData=shareData;
	}
	

	public void run() {
		for(int i=0; i<26; i++) {
			shareData.get();
		}
	}

}
