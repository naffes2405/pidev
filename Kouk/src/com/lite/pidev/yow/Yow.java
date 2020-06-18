/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.yow;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author acer
 */
public class Yow extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("/com/lite/pidev/GUI/login.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("se connecter");
        stage.setScene(scene);
        stage.show();
    
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   
    
}
