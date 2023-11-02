module com.example.vehicletaxcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.vehicletaxcalculator to javafx.fxml;
    exports com.example.vehicletaxcalculator;
}