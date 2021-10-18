/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class InnerClassJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 300, 250);
        
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        root.setCenter(circle);
        
        HBox hbox = new HBox(10);
        
        Button Enlarge = new Button();
        Button Shrink = new Button();
        
        Enlarge.setText("Enlarge");
        Shrink.setText("Shrink");
        
        hbox.setAlignment(Pos.CENTER);
        
        hbox.getChildren().add(Enlarge);
        hbox.getChildren().add(Shrink);
        
        root.setBottom(hbox);
        
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        class Aumenta implements EventHandler<ActionEvent>{
            @Override
            public void handle(ActionEvent e) 
                {
                    circle.setRadius(circle.getRadius() + 3);
                }
            };
            
        class Disminuye implements EventHandler<ActionEvent>{
            @Override
            public void handle(ActionEvent e) 
                {
                    circle.setRadius(circle.getRadius() - 3);
                }
            };
        
        Enlarge.setOnAction(new Aumenta());
        Shrink.setOnAction(new Disminuye());
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
