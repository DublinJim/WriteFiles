module com.example.writefiles {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.writefiles to javafx.fxml;
    exports com.example.writefiles;
}