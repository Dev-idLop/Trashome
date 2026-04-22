package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        // 1. Cargamos el archivo FXML (Asegúrate de que el nombre coincida exactamente con tu archivo)
        //Parent raiz = FXMLLoader.load(getClass().getResource("/loginView.fxml"));
        Parent raiz = FXMLLoader.load(getClass().getResource("/application/view/loginView.fxml"));

        // 2. Creamos la escena (el contenido de la ventana)
        Scene escena = new Scene(raiz);

        // 3. Configuramos la ventana (Stage)
        escenarioPrincipal.setTitle("Trashome - Iniciar Sesión");
        escenarioPrincipal.setScene(escena);
        
        // 4. Evitamos que el usuario cambie el tamaño de la ventana si tu diseño es fijo
        escenarioPrincipal.setResizable(false); 
        
        // 5. ¡Mostramos la ventana!
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        // Este comando arranca la maquinaria de JavaFX
        launch(args);
    }
}
