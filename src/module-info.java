module Trashome {
	requires java.desktop;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application.controller to javafx.fxml;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	
	exports application;
}