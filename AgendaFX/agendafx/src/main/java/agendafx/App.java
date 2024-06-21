package agendafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
*/

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        
        // try {
        //     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vista.fxml"));
        //     Parent root = fxmlLoader.load();
        //     scene = new Scene(root);
        //     stage.setScene(scene);
        //     stage.show();
                
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        scene = new Scene(loadFXML("vista"));
        stage.setScene(scene);
        stage.show();

    }

    static void setRoot(String fxml) throws IOException {

        scene.setRoot(loadFXML(fxml));

    }

    private static Parent loadFXML(String fxml) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();

    }

    public static void main(String[] args) {
        launch();
    }

}