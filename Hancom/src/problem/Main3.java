package problem;

import java.util.HashMap;

public class Main3 {

	public static void main(String[] args) {

		  HashMap<Integer,Integer> ar=new HashMap<>();
		  HashMap<Integer,Integer> sign=new HashMap<>();
		  int sum=0;
		  int check=0;

		  int num=1;
		  int target=12;//-3646397;


		  int count=0;


		  while(true) {


		   if(check==1) {
		    break;
		   }


		   sign.clear();
		   ar.clear();

		   for(int j=1; j<=num; j++) {
		    sign.put(j, 1);

		   }

		   count=0;

		   while(count < Math.pow(2, num)) {

		    for(int i=1; i<=num; i++) {

		     if((count%(Math.pow(2,num)/Math.pow(2,i))==0) && count!=0) {


		      if(sign.get(i)>0) {

		       sign.put(i,-1);
		      }
		      else {

		       sign.put(i,1);
		      }

		     }


		     int value=i*sign.get(i);
		     sum=sum+value;

		    }
		    //System.out.println(sum);
		    ar.put(count, sum);

		    sum=0;

		    if(ar.get(count)==target) { 

		     check=1;
		     System.out.println(num);
		     break;   
		    }

		    count++;

		   }

		   //System.out.println(num);
		   num++;
		   

		  }
		  

		 }

		}  
