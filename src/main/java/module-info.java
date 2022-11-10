module com.example.algoviz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.algoviz to javafx.fxml;
    exports com.example.algoviz;
}