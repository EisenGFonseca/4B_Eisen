/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Dr
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private JFXTextField txtn1, txtn2, txtresult;
    
    @FXML
    private Label label;
    
    @FXML
        private JFXButton btsoma;
    

    
    @FXML
    private void soma(ActionEvent event) {
     double n1 = Double.parseDouble(txtn1.getText());
     double n2 = Double.parseDouble(txtn2.getText());
     double resultado = n1 + n2;
     
     String strresultado  = Double.toString(resultado);
     txtresult.setText(strresultado);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AbrirCadastroAluno(ActionEvent event) {
    try{
        FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }

    @FXML
    private void FecharCadastroAluno(ActionEvent event) {
    }
    
}
