/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a437_garciamarcos;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */
public class DI_T1A437_GarciaMarcos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
       
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("FadeTransition");
        primaryStage.setScene(scene);
        
        Ellipse ellipse = new Ellipse(10,10,100,50);
        ellipse.centerXProperty().bind(root.widthProperty().divide(2));
        ellipse.centerYProperty().bind(root.heightProperty().divide(2));
        ellipse.setFill(Color.RED);

        FadeTransition ft = new FadeTransition(Duration.millis(3000), ellipse);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        
        ellipse.setOnMousePressed(e->ft.pause());
        ellipse.setOnMouseReleased(e->ft.play());
        
        root.getChildren().add(ellipse);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
