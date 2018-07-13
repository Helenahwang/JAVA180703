package problem;

import java.util.LinkedList;

public class Main2 {

	public static void main(String[] args) {
		
		String acgtSequence="ACCGGCCG";
		//String acgtSequence="ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA";
		String condon="GCCG";
		
		int index=0;
		int count=0;
		
		LinkedList<Integer> ar = new LinkedList<>();
		char ac=' ';
		char co=' ';		
		
		while(true) {

			//System.out.println(index);
			//System.out.println(acgtSequence.length());
			
			if(index>acgtSequence.length()-condon.length()) {
				break;
			}	
			
			count=index;
			
			for(int i=0; i<condon.length(); i++) {

				ac=acgtSequence.charAt(count);
				co=condon.charAt(i);

				System.out.println(ac + "  "+co);
				
				if(ac==co) {
					
					count++;
					
					if(i==condon.length()-1) {

						ar.add(index);
						System.out.println(ar);
						break;
					}

				}
				else {	
					
					
					index++;
					break;
				}
			}
			





			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	
			while(true) {
			
			int count=0;
			char ac=acgtSequence.charAt(index);
			char co=condon.charAt(count);
			int[] ar = null;
			
			System.out.println(1+" index = "+index);
			
			if(ac==co) {
				index++;
				count++;
				ac=acgtSequence.charAt(index);
				co=condon.charAt(count);
				System.out.println(2+" index = "+index);
				
				if(ac==co) {
					index++;
					count++;
					ac=acgtSequence.charAt(index);
					co=condon.charAt(count);
					System.out.println(3+" index = "+index);
					
					if(ac==co) {
						index++;
						count++;
						ac=acgtSequence.charAt(index);
						co=condon.charAt(count);
						System.out.println(4+" index = "+index);
						
						if(ac==co) {
							index++;
							ac=acgtSequence.charAt(index);
							co=condon.charAt(count);
							System.out.println(5+" index = "+index);
							ar[cc]=index;
							cc++;
							
						}
					}
				}
			}else {
				index++;
			}
			
			}
			*/
			
			
			
		}

	}

}
