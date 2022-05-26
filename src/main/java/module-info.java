module com.example.lab_01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_01 to javafx.fxml;
    exports com.example.lab_01;
}