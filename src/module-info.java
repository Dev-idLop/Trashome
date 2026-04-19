module Trashome {
	requires java.desktop;
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}