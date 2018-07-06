package objectpackage;

public class Main {

	public static void main(String[] args) {
		
		Car car=new Car();
		car.setModelName("그랜져");
		car.setDisplacement(2400);
		car.setPrice(2200);
		
		//toString을 호출해서 출력
		System.out.println(car.toString());
		System.out.println(car);
		
		Car car2=new Car();
		car2.setModelName("그랜져");
		car2.setDisplacement(3000);
		car2.setPrice(2900);
		
		System.out.println(car2.equals(car));

	}

}
