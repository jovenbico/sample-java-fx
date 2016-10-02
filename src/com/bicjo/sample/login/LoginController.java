package com.bicjo.sample.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

	@FXML
	private TextField usernameText;

	@FXML
	private PasswordField passwordText;

	@FXML
	private Button loginBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(usernameText.getText() + " " + passwordText.getText());
			}
		});

	}

}
