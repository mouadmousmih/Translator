module com.example.translator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.translator to javafx.fxml;
    exports com.example.translator;
}