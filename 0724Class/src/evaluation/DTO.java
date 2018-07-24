package evaluation;

public class DTO {

	private int num;
	private String name;
	private int score;
	private String date;
	
	
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String getDate() {
		return date;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DTO [num=");
		builder.append(num);
		builder.append(", name=");
		builder.append(name);
		builder.append(", score=");
		builder.append(score);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
