package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class CreateUserController {

    @FXML
    private TextField txt_Name;

    @FXML
    private TextField txt_Age;

    @FXML
    private TextField txt_Addres;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_CP;

    @FXML
    private TextField txt_Telephone;

    @FXML
    private PasswordField txt_Password;

    @FXML
    private Button btn_Login;

    @FXML
    private void iniciarSesion() {
        System.out.println("Clic en crear usuario...");
        // Aquí puedes agregar la lógica para guardar el usuario usando ClienteDao
    }
}
