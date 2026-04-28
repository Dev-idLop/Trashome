package application.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.fxml.Initializable;


public class CrearCamionController implements Initializable {
	
	
	
	
	 @FXML
	    private WebView mapa;

	    private WebEngine engine;

	    @Override
	    public void initialize(URL url, ResourceBundle rb) {
	        engine = mapa.getEngine();
	        engine.load("https://opentopomap.org/");
	    }
	
	@FXML
	private Button bottonRouts;
	
	@FXML
	private void ChangeToRouts(){
	    System.out.println("Guardado");
		
	}
	
	

	
	
	

}
