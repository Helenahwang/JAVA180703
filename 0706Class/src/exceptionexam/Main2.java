package exceptionexam;

public class Main2 {

	public static void main(String[] args) {
	
		/*
		String[] arr= {"image().png","image1.png","image2.png"};
		
		int i=0;
		while(true) {
			
			System.out.println(arr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i++;
			
			if(i==3) i=0;

			
		}
		
		*/
		
		
		/*
		int idx=0;
		for(;;) {
			
			System.out.println("image"+(idx%3)+".png");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			idx=idx+1;
	
		}
		
			*/
		
		
		int idx=0;
		String arr[] = {"김기태", "이종범", "최향남", "이대진"};
		
		try {
			for(;;) {
				System.out.println(arr[idx]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//System.out.println(Math.random());
		idx=(int) ((Math.random()*100)%4);
			
			
	}
		
}

