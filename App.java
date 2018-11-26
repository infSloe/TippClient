import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.*;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    // Attribute 
    TippDesTagesClient client;
    View view;

    public void start(Stage stage) {
        client = new TippDesTagesClient();
        Pane root = new View(client);
        Scene scene = new Scene(root, 600,250);         
        stage.setTitle("App");
        stage.setScene(scene);
        stage.show();
    }

}