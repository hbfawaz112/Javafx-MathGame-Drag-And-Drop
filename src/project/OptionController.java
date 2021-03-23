/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author fcss
 */
public class OptionController implements Initializable {

    Volume v;
                  
     @FXML
    AnchorPane rootPane;
    @FXML
    private ImageView mute;
    @FXML
    private Button goback;
    @FXML
    private ImageView unmute;
    /**
     * Initializes the controller class.
     */
    @FXML
    private void goback(ActionEvent event) throws IOException {
        AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")); 
       rootPane.getChildren().setAll(pane1);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        mute.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   //System.out.println("Muutee");
                   
                  v = new Volume();
                  v.setVolume(0);
                   
               }
          });
        
        unmute.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   //System.out.println("unMuutee");
                    
                  v = new Volume();
                  v.setVolume((float) 0.4);
               }
          });
        
        
    }    
    
}
