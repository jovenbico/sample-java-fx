package com.bicjo.sample.login;

import com.bicjo.sample.login.object.UsernamePassword;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UsernamePasswordProperties {

	private UsernamePassword usernamePassword = new UsernamePassword();

	private StringProperty usernameProperty = new SimpleStringProperty(this, "username") {
		public void set(String newValue) {
			super.set(newValue);
			usernamePassword.setUsername(newValue);
		};
	};
	private StringProperty passwordProperty = new SimpleStringProperty(this, "password") {
		public void set(String newValue) {
			super.set(newValue);
			usernamePassword.setPassword(newValue);
		};
	};

	public UsernamePassword getUsernamePassword() {
		return usernamePassword;
	}

	public void setUsernamePassword(UsernamePassword usernamePassword) {
		this.usernamePassword = usernamePassword;
	}

	public StringProperty getUsernameProperty() {
		return usernameProperty;
	}

	public StringProperty getPasswordProperty() {
		return passwordProperty;
	}

}
