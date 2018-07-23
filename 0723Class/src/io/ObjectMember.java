package io;

import java.io.Serializable;

public class ObjectMember implements Serializable{
	
	private String email;
	private String pw;
	private String phone;
	
	
	public String getEmail() {
		return email;
	}
	public String getPw() {
		return pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SerializableMemeber [email=");
		builder.append(email);
		builder.append(", pw=");
		builder.append(pw);
		builder.append(", phone=");
		builder.append(phone);
		builder.append("]");
		return builder.toString();
	}
	
	
}
