/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author PCGAMERCASA
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem; // Aonde vai exibir a mensagem
    private Button btnClick; //Botão
    @FXML
    private Button button; //Botão
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
