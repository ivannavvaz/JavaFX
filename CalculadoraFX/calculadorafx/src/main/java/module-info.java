module calculadorafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens calculadorafx to javafx.fxml;
    exports calculadorafx;
}
