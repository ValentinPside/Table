/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class PropAppStage extends Stage{
    public PropAppStage() {
        init();
    }

    private void init() {
        GridPane root = new GridPane();
        GridPane enterText = new GridPane();
        enterText.setHgap(5);
        enterText.setVgap(5);
        
        Label lastNameLabel = new Label("Last name");
        TextField lastNameField = new TextField();
        enterText.add(lastNameLabel, 0, 1);
        enterText.add(lastNameField, 1, 1);
        
        Label ageLabel = new Label("Age");
        TextField ageField = new TextField();
        enterText.add(ageLabel, 0, 2);
        enterText.add(ageField, 1, 2);
        root.add(enterText, 0, 1);
        
        Label label = new Label("Добавление нового судна: ");
        root.add(label, 0, 0);
        ObservableList <String> observableList = FXCollections.observableArrayList("txt", "doc");
        ChoiceBox<String> choiceBox = new ChoiceBox<>(observableList);
        root.add(choiceBox, 1, 0);
        choiceBox.setOnAction((e) -> {
            PropApp.setValue("formatFile", choiceBox.getValue());
        });
        
        choiceBox.setOnAction((e) -> {
            PropApp.setValue("formatFile", choiceBox.getValue());
        });
        
        
        Scene scene = new Scene(root, 300, 250);
        
        setTitle("Settings");
        setScene(scene);
        show();
    }
}
