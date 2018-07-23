package logfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberofIP {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {
			br= new BufferedReader(new FileReader("./access_log.txt"));

			HashMap<String, Integer> mp= new HashMap<>();
			ArrayList<String> al=new ArrayList<>();

			HashMap<String, Integer> mpt = new HashMap<>();

			while(true) {

				String line;
				try {
					line = br.readLine();				    

					if(line==null) {
						break;
					}

					String[] ar=line.split(" ");
					al.add(ar[0]);


					//Map은 동일한 키를 가지고 데이터를 저장하면 수정이 발생하고 없는 키의 값을 읽으려고 하면 null을 리턴한다.
					Integer count=mp.get(ar[0]);


					if(count == null) {
						mp.put(ar[0], 1);


					}
					else {
						mp.put(ar[0],count+1);
					}


					Integer traf=mpt.get(ar[0]);
					if(traf == null) {
						if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) { // "-" 이렇게 쓰지 못해서 -> " \" = \" "
							mpt.put(ar[0], Integer.parseInt(ar[9]));
						}
					}else {
						if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
							mpt.put(ar[0], mpt.get(ar[0])+Integer.parseInt(ar[9]));
						}
					}




				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}

			Set<String> keySet = mp.keySet();
			for(String key : keySet) {
				System.out.println(key + " : " + mp.get(key));
			}


			System.out.println("========================================");
			Set<String> keySet1 = mpt.keySet();
			for(String key : keySet1) {
				System.out.println(key + " : " + mpt.get(key));
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
