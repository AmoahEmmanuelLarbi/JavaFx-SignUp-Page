package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class try1 {

    @FXML
    private TextField nameField;
    @FXML
    private Label displayLabel;
    @FXML
    private Label emptyNamePrompt; // Label to show if nameField is empty
    @FXML
    private Button okButton;


    public String getName(){
        return nameField.getText();
    }

    public void displayName(){
        displayLabel.setText("Your Name: " + getName());
        System.out.println(getName());
        // disable okButton
    }
    public void emptyName(){
        if(nameField.getText().isEmpty()){
            emptyNamePrompt.setText("Please Enter Your Name!");
            displayLabel.setText("");
        } else {
            emptyNamePrompt.setText("");
            // clear displayLabel content
            displayName();
        }
    }

}
