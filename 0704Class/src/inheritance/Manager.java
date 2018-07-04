package inheritance;

public class Manager extends Employee {

	private String task;
	
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는 안드로이드에서 많이 발생됨
	public Manager() {
		//super(10);
	}
	
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	//@Override
	public String toString() {
		//super.toString()은 상위 클래스 인 Employee의 toString을 호출합니다.
		return super.toString()+"Manager [task=" + task + "]";
	}
	
	
	
	
	
	
}
