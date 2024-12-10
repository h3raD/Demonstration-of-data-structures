module com.example.adapter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adapter to javafx.fxml;
    exports com.example.adapter;
}