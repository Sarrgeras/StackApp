module com.example.stackapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stackapp to javafx.fxml;
    exports com.example.stackapp;
}