/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg3.pkg5_garciamarcos;

import javafx.application.Application;
import javafx.scene.Scene;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class DI_T1A435_GarciaMarcos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Pane root = new Pane();
        
        Text text =new Text(20,20,"A");
        
        text.setFocusTraversable(true);
        
        text.setOnKeyPressed( e ->{
            switch (e.getCode()) {
               
                case UP:
                   text.setY(text.getY() - 10);
                 
                   break;
                case DOWN:
                    text.setY(text.getY() + 10);
                    
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                
                break;
            }    
        });

        root.getChildren().add(text);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("");
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
