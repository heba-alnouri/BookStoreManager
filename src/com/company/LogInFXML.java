package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class LogInFXML {

    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passwordTextField;


    public void cancelButtonAction(ActionEvent event){
        Stage stage =(Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void registerButtonAction(ActionEvent event){

    }
    public void loginButtonAction(ActionEvent event){
        if(emailTextField.getText().isBlank() == true && passwordTextField.getText().isBlank() == true){
            loginMessageLabel.setText("Empty Fields");
        } else if(validLogin(emailTextField.getText(),passwordTextField.getText()) == true) {

        }
        else{
            loginMessageLabel.setText("Invalid Login, Try Again.");
        }
    }

    public boolean validLogin(String email,String password){


        return true;
    }




}
