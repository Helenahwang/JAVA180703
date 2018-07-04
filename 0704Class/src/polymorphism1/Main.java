package polymorphism1;

public class Main {

	public static void main(String[] args) {
		
//		Terran tr=new Terran();
//		tr.attack();
//		
//		Zerg zg=new Zerg();
//		zg.attack();
//		
//		Protoss pr=new Protoss();
//		pr.attack();
		
		
		
		Starcraft st=new Terran();
		st.attack();
		
		st=new Zerg();
		st.attack();
		
		st=new Protoss();
		st.attack();
		
		

	}

}
