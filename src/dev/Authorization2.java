/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autorization;

import Autorization.Note.Note;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Valentin
 */
public class Authorization2 extends Application {
    
    Scene scene;
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setAlignment(Pos.CENTER);
        
        Label labelTop = new Label("Authorization");
        root.add(labelTop, 0, 0);
        
        GridPane enterText = new GridPane();
        enterText.setHgap(5);
        enterText.setVgap(5);
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        enterText.add(nameLabel, 0, 0);
        enterText.add(nameField, 1, 0);
        
        Label lastNameLabel = new Label("Last name");
        TextField lastNameField = new TextField();
        enterText.add(lastNameLabel, 0, 1);
        enterText.add(lastNameField, 1, 1);
        
        Label ageLabel = new Label("Age");
        TextField ageField = new TextField();
        enterText.add(ageLabel, 0, 2);
        enterText.add(ageField, 1, 2);
        root.add(enterText, 0, 1);
        
        FlowPane flowPane2 = new FlowPane();
        flowPane2.setAlignment(Pos.CENTER);
        Label bottom = new Label();
        flowPane2.getChildren().add(bottom);
        root.add(flowPane2, 0, 3);
        
        FlowPane flowPane1 = new FlowPane();
        flowPane1.setAlignment(Pos.CENTER_RIGHT);
        Button signIn = new Button("Sing in");
        signIn.setOnAction((ActionEvent e) -> {
            bottom.setText("");
            String name = nameField.getText();
            String lastName = lastNameField.getText();
            Integer age = Integer.parseInt(ageField.getText().replaceAll("[^\\d]", ""));
            try {
                if(UserController.checkData(name, lastName, age)){
                    User user = new User(name, lastName, age);
                    Note note = new Note(user);
                }
            } catch (UserException ex) {
                bottom.setText(ex.getMessage());
            }
        });
        flowPane1.getChildren().add(signIn);
        root.add(flowPane1, 0, 2);
        
        
        
        scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Authorization");
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
