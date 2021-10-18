
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 300, 100);
        
        HBox hbox = new HBox(10);
        
        Button New = new Button();
        Button Open = new Button();
        Button Save = new Button();
        Button Print = new Button();
        
        New.setText("New");
        Open.setText("Open");
        Save.setText("Save");
        Print.setText("Print");
        
        hbox.setAlignment(Pos.CENTER);
        
        hbox.getChildren().add(New);
        hbox.getChildren().add(Open);
        hbox.getChildren().add(Save);
        hbox.getChildren().add(Print);
            
        root.setCenter(hbox);
        
        primaryStage.setTitle("AnonymousInnerClass");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        New.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
                {
                    System.out.println("Nuevo proceso");
                }
            });
        Open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
                {
                   System.out.println("Abrir proceso");
                }
        });
        
        Save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
                {
                    System.out.println("Guardar proceso");
                }
            });
        Print.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
                {
                   System.out.println("Imprimir proceso");
                }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
