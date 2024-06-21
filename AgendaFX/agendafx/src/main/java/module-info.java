module agendafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens agendafx to javafx.fxml;
    exports agendafx;
}
