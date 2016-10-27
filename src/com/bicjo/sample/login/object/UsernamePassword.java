package com.bicjo.sample.login.object;

public class UsernamePassword {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer("[object]");
		sb.append(" usrname=").append(username);
		sb.append(" password=").append(password);
		
		return sb.toString();
	}

}
