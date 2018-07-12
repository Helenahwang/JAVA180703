package problem;

public class Main2 {

	public static void main(String[] args) {
		
		String acgtSequence="ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA";
		String condon="GCCG";
		
		int index=0;
		while(true) {
	
			
			
			while(true) {
			
			char ac=acgtSequence.charAt(index);
			char co=condon.charAt(index);
			
			if(ac==co) {
				index++;
				ac=acgtSequence.charAt(index);
				co=condon.charAt(index);
				
				if(ac==co) {
					index++;
					ac=acgtSequence.charAt(index);
					co=condon.charAt(index);		
					
					if(ac==co) {
						index++;
						ac=acgtSequence.charAt(index);
						co=condon.charAt(index);
						
						if(ac==co) {
							index++;
							ac=acgtSequence.charAt(index);
							co=condon.charAt(index);
						}
						
						
					}
				
				}
				
				
			}
			
			}
			
		}
		

	}

}
