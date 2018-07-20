package problem;

public class Main33 {

	public static void main(String[] args) {

		int set=12;
		int sum=0;


		int num=0;
		while(true) {

			num++;		
			sum=sum+num;
			if(sum>set) {
				break;
			}
		}

		System.out.println(sum);


		int signal=0;

		while(true) { 


			if(signal==2) {
				break;
			}


			for(int i=1; i<=num; i++) {

				int sum1=sum-2*i;
				
				System.out.println(sum1);

				if(sum1==set) {
					signal=2;
					break;
				}

				sum1=sum;

				int setnum=1;
				int setsum=0;
				
				if(sum1<set) {


					int setsumnum=0;

					while(true) {

						setsum=setsum + setsumnum +setnum;

						for(int j=setnum+1; j<=num; j++) {	

							sum1=sum-2*setsum-2*j;
							if(sum1<set) {
								signal=1;
								sum1=0;
								break;

							}

							if(sum1==set) {
								signal=2;
								System.out.println(num);
								break;
							}

						}
						setnum++;

						if(setnum==5) {
							setsumnum++;
							setnum=setsumnum;
						}


						if(signal==1 || signal==2) {
							break;
						}


					}

					if(signal==1 || signal==2) {
						break;
					}

				}
				
			}
			num++;
		}





	}
}
