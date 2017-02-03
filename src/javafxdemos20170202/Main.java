package javafxdemos20170202;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        // Let's create the scene programmatically
        // This is easy but using Scene Builder is much easier!
//        VBox vbox = new VBox(25);
//        Button button = new Button("Hello Again");
//        vbox.getChildren().add(button);
//        Scene myScene = new Scene(vbox, 300, 300);
//        
//        button.setOnAction(e -> {
//            System.out.println("Hello button clicked!!!");
//        });
//        
//        stage.setScene(myScene);
        
        stage.setWidth(800);
        stage.setHeight(700);
        stage.setTitle("Our simple app");
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
