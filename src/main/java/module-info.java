module com.example.projetocadastro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetocadastro to javafx.fxml;
    exports com.example.projetocadastro;
}