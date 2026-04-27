package application;

import javafx.fxml.FXML;

public class CreditosController { 
	
	@FXML
	private void AbrirLink() {
	    try {
	        java.awt.Desktop.getDesktop().browse(new java.net.URI("https://github.com/chipoock"));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}}


