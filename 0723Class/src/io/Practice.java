package io;

import java.io.Serializable;
import java.util.Date;

public class Practice implements Serializable {
	
	private double a;
	private double b;
	
	private long d;
	
	

	public long getD() {
		return d;
	}
	public void setD(long l) {
		this.d = l;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Practice [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append(", d=");
		builder.append(d);
		builder.append("]");
		return builder.toString();
	}
	
	


}
