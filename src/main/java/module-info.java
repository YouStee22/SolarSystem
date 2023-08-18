module com.example.finalsolarsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalsolarsystem to javafx.fxml;
    exports com.example.finalsolarsystem;
}