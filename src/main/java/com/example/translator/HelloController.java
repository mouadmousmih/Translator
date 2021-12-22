package com.example.translator;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {




    @FXML
    private TextArea resulat;
    @FXML
    private TextArea textToTranslate;
    @FXML
    private ChoiceBox choiceBox1;
    @FXML
    private ChoiceBox choiceBox2;
    ObservableList<String> Langues = FXCollections.observableArrayList("English", "Frensh", "Arabic", "Spanish", "Portuguese", "Chinese");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox1.setValue("Frensh"); // this statement shows default value
        choiceBox1.setItems(Langues); // this statement adds all values in choiceBox
        choiceBox2.setValue("English"); // this statement shows default value
        choiceBox2.setItems(Langues); // this statement adds all values in choiceBox
    }
    @FXML
    public void changeLangue(ActionEvent event) {
        String change;
        change = String.valueOf(choiceBox1.getValue());
        choiceBox1.setValue(String.valueOf(choiceBox2.getValue()));
        choiceBox2.setValue(change);

    }

}