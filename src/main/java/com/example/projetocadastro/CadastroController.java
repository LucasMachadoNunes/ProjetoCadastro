package com.example.projetocadastro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class CadastroController implements Initializable {
    String[] siglas = {"AC","BA","CE","DF","PR","SP","RS","SC","TO"};

    @FXML
    private ListView<String> Cadastros;

    @FXML
    void adicionarcad(MouseEvent event){
        Cadastros.getItems().add(colunanome.getText());
    }
    @FXML
    void removercad(MouseEvent event){
        int selectedID = Cadastros.getSelectionModel().getSelectedIndex();
        Cadastros.getItems().remove(selectedID);
    }
    private ObservableList Cadastros;

    @FXML
    ComboBox<String> comboUF = new ComboBox();

    @FXML
    DatePicker dataNasc;

    @FXML
    CheckBox checkMasc,checkFem;

    @FXML
    TableView<String> tabelacadastro = new TableView<>();

    @FXML
    TableColumn<String, String> colunanome;

    @FXML
    TableColumn<String, String> colunaSobrenome;

    @FXML
    TableColumn<String, String> colunaDtnasc;

    @FXML
    TableColumn<String, String> colunaEndereco;

    @FXML
    TableColumn<String, String> colunaCidade;

    @FXML
    TableColumn<String, String> colunaCep;

    @FXML
    TableColumn<String, String> colunaUF;

    @FXML
    TableColumn<String, String> colunaSexo;

    @FXML
    TableColumn<String, String> colunaEmail;

    @FXML
    TableColumn<String, String> colunaTelefone;



    @Override
    public void initialize(URL location, ResourceBundle resources) {comboUF.getItems().addAll(siglas);}
    public void save(){
        String select = comboUF.getSelectionModel().getSelectedItem();
        System.out.println("UF selecionada: " + select);
        LocalDate date = dataNasc.getValue();
        System.out.println("Data Selecionada: " + date);
        System.out.println(checkMasc.isSelected());
        System.out.println(checkFem.isSelected());
        carregarTableViewCadastros();
    }
}
   public void carregarTableViewCadastros(){
       List cadastros = new ArrayList();
        TableColumncolunanome.setCellFactory(new PropertyValueFactory<>("Nome"));
        TableColumncolunasobrenome.setCellFactory(new PropertyValueFactory<>("Sobrenome"));
        list.add(new Cadastro("Juliana","Almeida"));
        list.add(new Cadastro("Luciano","Gomes"));

        observableListCadastros = FXCollections.observableArrayList(listCadastros);

        tableViewCadastros.setItems(observableListCadastros);
    }
