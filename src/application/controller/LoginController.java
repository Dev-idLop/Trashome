package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField txt_User;
	
	@FXML
	private TextField txt_Password;
	
	@FXML
	private Button btn_Login;
	
	@FXML
	private Label lbl_mensaje;
	
	@FXML
	private Hyperlink linkRegistro;
	
	@FXML
	private Hyperlink linkEquipo;
	
	@FXML
	 private void iniciarSesion() {
		String user = txt_User.getText();
		String password = txt_Password.getText();
		
		if(user.isEmpty() || password.isEmpty()) {
			lbl_mensaje.setStyle("-fx-text-fill: red;");
			lbl_mensaje.setText("Por favor revise los campos");
		}
	}
	
}
