package application;

import javafx.fxml.FXML;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.fxml.Initializable;

public class CreateRouteController implements Initializable {

    @FXML
    private WebView maps;

    private WebEngine engine;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = maps.getEngine();
        engine.load("https://opentopomap.org/");
    }
}