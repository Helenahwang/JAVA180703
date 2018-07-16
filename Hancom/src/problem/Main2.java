package problem;

import java.util.LinkedList;

public class Main2 {

	public static void main(String[] args) {
		
		 
		  //String acgtSequence="ACCGGCCG";
		  String acgtSequence="ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA";
		  String condon="GCCG";
		  
		  int index=0;
		  int count=0;
		  
		  LinkedList<Integer> ar = new LinkedList<>();
		  char ac=' ';
		  char co=' ';  
		  
		  while(true) {
		   
		   if(condon.length()>acgtSequence.length()-index) {
		    break;
		   } 
		   
		   //System.out.println(index);
		   count=index;
		   
		   for(int i=0; i<condon.length(); i++) {

		    ac=acgtSequence.charAt(count);
		    co=condon.charAt(i);
		         
		    if(i==condon.length()-1) {
		     if(ac==co) {
		      
		      //System.out.println("index : "+index);
		      //System.out.println("count : "+count);
		      ar.add(index);
		      index=count;
		      
		     }
		     index++;
		    }
		    
		    if(ac==co) {
		     
		     count++;
		     
		     
		    }else { 
		     
		     
		     index++;
		     break;
		    }
		   }
		   
		   
		   
		  }
		  
		  System.out.println(ar);

		 }

		} 
