package com.example.projetocadastro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    String[] siglas = {"AC","BA","CE","DF","PR","SP","RS","SC","TO"};
    @FXML
    ComboBox<String> comboUF = new ComboBox();

    @FXML
    DatePicker dataNasc;

    @FXML
    CheckBox checkMasc,checkFem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            comboUF.getItems().addAll(siglas);
    }
    public void save(){
        String select = comboUF.getSelectionModel().getSelectedItem();
        System.out.println("UF selecionada: " + select);
        LocalDate date = dataNasc.getValue();
        System.out.println("Data Selecionada: " + date);
        System.out.println(checkMasc.isSelected());
        System.out.println(checkFem.isSelected());
    }
}