package com.bicjo.sample.login;

import com.bicjo.sample.login.object.UsernamePassword;

import javafx.beans.property.StringProperty;
import javafx.beans.property.adapter.JavaBeanStringPropertyBuilder;

public class UsernamePasswordProperties {

	private UsernamePassword usernamePassword = new UsernamePassword();

	private StringProperty usernameProperty;
	private StringProperty passwordProperty;

	public UsernamePasswordProperties() {
		try {

			usernameProperty = JavaBeanStringPropertyBuilder.create().bean(usernamePassword).name("username").build();
			passwordProperty = JavaBeanStringPropertyBuilder.create().bean(usernamePassword).name("password").build();

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

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
