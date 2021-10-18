/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a436_garciamarcos;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */
public class DI_T1A436_GarciaMarcos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Rectangle rectangulo = new Rectangle (30,50);
        rectangulo.setFill(Color.ORANGE);
       
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("PathTransition");
        primaryStage.setScene(scene);
        // Creando un círculo y activando sus propiedades
        Circle circle = new Circle();
        
        //DoubleProperty --> Informar del cambio en el valor ,bind --> Enlazar el valor a otro campo del mismo tipo
        circle.centerXProperty().bind(root.widthProperty().divide(2));
        circle.centerYProperty().bind(root.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        PathTransition pathTransition = new PathTransition(); 
        
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setNode(rectangulo);
        pathTransition.setPath(circle);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(50);
        pathTransition.setAutoReverse(false);
        
        pathTransition.play(); 
       
        circle.setOnMousePressed(e->pathTransition.pause());
        circle.setOnMouseReleased(e->pathTransition.play());
        
        root.getChildren().add(circle);
        root.getChildren().add(rectangulo);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
