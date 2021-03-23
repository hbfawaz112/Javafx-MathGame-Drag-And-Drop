/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author fcss
 */
public class FXMLDocumentController implements Initializable {
    int i=0;
    @FXML
    private Button new_game;
    @FXML
    private Button option;
    @FXML
    private Button exit_game;
    @FXML
    AnchorPane rootPane;
  
    

    
   @FXML 
    private void NewGame_Click(ActionEvent event) throws IOException {
       // System.out.print("okk");
        AnchorPane pane =  FXMLLoader.load(getClass().getResource("Newgame.fxml")); 
       rootPane.getChildren().setAll(pane);
    }
   @FXML 
    private void Option_Click(ActionEvent event) throws IOException {
         AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("Option.fxml"));
        rootPane.getChildren().setAll(pane1);
    }
   @FXML 
    private void Exit_Game_Click(ActionEvent event) {
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
          
    }   
    
    
    
  
    
}
