package Table;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Valentin
 */
public class Table extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TableView <Ship> tableView = new TableView<>();
        
        TableColumn<Ship, String> nameCol = new TableColumn<>("Название судна");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableView.getColumns().add(nameCol);
        
        TableColumn<Ship, Integer> numberCol = new TableColumn<>("Номер судна");
        numberCol.setCellValueFactory(new PropertyValueFactory<>("number"));
        tableView.getColumns().add(numberCol);
        
        tableView.setItems(getShipList ());

        StackPane root = new StackPane();
        root.getChildren().add(tableView);
        Scene scene = new Scene(root, 300, 250);
        
        BorderPane brPane = new BorderPane();
        Button button = new Button("Добавить судно");
        brPane.setBottom(button);
        root.getChildren().add(brPane);
        
        
        primaryStage.setTitle("Список судов");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private ObservableList<Ship> getShipList (){
        ArrayList<Ship> arrayList = new ArrayList<>();
        arrayList.add(new Ship ("Aridatha", 320161));
        arrayList.add(new Ship ("Академик Ломоносов", 90066));
        arrayList.add(new Ship ("Garvy", 10102));
        arrayList.add(new Ship ("Charity", 699393));
        arrayList.add(new Ship ("Сибирь",505708));
        arrayList.add(new Ship ("Anneliese", 50112));
        arrayList.add(new Ship ("Adriana", 4040));
        
        return FXCollections.observableArrayList(arrayList);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
