package characterstream;

public class Member {

	private String name;
	private int age;
	private double height;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
	
}
