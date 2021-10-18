/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4_garciamarcos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class DI_T1A434_GarciaMarcos extends Application {
    
   @Override
    public void start(Stage primaryStage) {
       
        
        Text text = new Text("Programming is fun");
        
        text.setX(50);
        text.setY(50);
        
        text.setOnMouseDragged( e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        }
        );

        Pane root = new Pane();
        root.getChildren().add(text);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Actividad 4.3.4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
