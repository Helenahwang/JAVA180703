package mutex;

public class SyncMain {

	public static void main(String[] args) {
		Producer p = new Producer(ShareData.list);
		Customer c = new Customer(ShareData.list);
		
		p.start();
		c.start();
		

	}

}
