module com.example.tuan3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lettuce;
    requires jedis;


    opens com.example.tuan3 to javafx.fxml;
    exports com.example.tuan3;
}