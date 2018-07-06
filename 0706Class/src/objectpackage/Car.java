package objectpackage;

public class Car {

	//모델명, 배기량, 가격을 저장할 변수
	
	private String modelName;
	private int displacement;
	private int price;
	
	
	public String getModelName() {
		return modelName;
	}
	public int getDisplacement() {
		return displacement;
	}
	public int getPrice() {
		return price;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//내부 데이터의 값을 빠르게 확인하기 위한 용도로 사용
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", displacement=" + displacement + ", price=" + price + "]";
	}

	//2개의 내용이 같은지 비교하는 메소드
	public boolean equals(Car other) {
		boolean result=false;
		
		//호출하는 인스턴스의 modelName 과 매개변수의 modelName이 같으면 true을 리턴하고 그렇지 않으면 false를 리턴
		if(modelName.equals(other.modelName)) {
			result=true;
		}
		
		return result;
	}

}
