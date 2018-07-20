
package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {

		BufferedReader br=null;


		try {

			br=new BufferedReader(new FileReader("C:\\Users\\503-02\\Documents\\황연하\\access_log.txt"));
			
			ArrayList<String> iplist = new ArrayList<>();
			
			Set<String> ipset = new HashSet<String>();
			
			while(true) {
				String line = br.readLine();

				if(line ==null) {
					break;
				}

				String[] ar=line.split(" ");
				ipset.add(ar[0]);
				iplist.add(ar[0]);
			}

			
			for(String ip : ipset) {
				System.out.println(ip);
			}
			
			System.out.println("-------------------------------------------------");

			for(String ip : iplist) {
				System.out.println(ip);
			}
			

		}catch(Exception e) {

			System.out.println(e.getMessage());

		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}



}

