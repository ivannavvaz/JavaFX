package agendafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.sql.*;
import java.util.*;

public class InsertarController {

    public static Connection conectar() {

        try {

            // Conexión con la BD

            Connection con = DriverManager.getConnection("jdbc:mysql://172.18.0.3:3306/agenda",
                    "root", "admini");

            // Connection con =
            // DriverManager.getConnection("jdbc:mysql://localhost:3306/menuBD",
            // "root", "2004");

            return con;

        } catch (SQLException e) {

            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
            return null;

        }

    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField idApellidos;

    @FXML
    private TextField idCargo;

    @FXML
    private TextField idFecha;

    @FXML
    private Button idInsertar;

    @FXML
    private Button idIrPaginaPrincipal;

    @FXML
    private TextField idNombre;

    @FXML
    private TextField idTelefono;

    @FXML
    private void cambiarVista(ActionEvent event) throws IOException {
        App.setRoot("vista");
    }

    @FXML
    void insertarEmpleado(ActionEvent event) {

        Connection con;
        String sql;
        PreparedStatement ps;

        try {

            if (idNombre.getText().isEmpty() ||
                    idApellidos.getText().isEmpty() ||
                    idTelefono.getText().isEmpty() ||
                    idFecha.getText().isEmpty() ||
                    idCargo.getText().isEmpty()) {

                throw new Exception("Debes rellenar todos los campos obligatorios");

            }

            con = conectar();
            sql = "insert into empleados(nombre, apellidos, telefono, fechaNacimiento, cargo) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, idNombre.getText());
            ps.setString(2, idApellidos.getText());
            ps.setString(3, idTelefono.getText());
            ps.setString(4, idFecha.getText());
            ps.setString(5, idCargo.getText());
            ps.executeUpdate();

            idNombre.clear();
            idApellidos.clear();
            idTelefono.clear();
            idFecha.clear();
            idCargo.clear();

            Alert usuarioCreado = new Alert(Alert.AlertType.CONFIRMATION);
            // usuarioCreado.setTitle("!! USUARIO CREADO ¡¡");
            usuarioCreado.setContentText("Usuario creado con exito :)");
            usuarioCreado.showAndWait();

        } catch (Exception e) {

            Alert error = new Alert(Alert.AlertType.ERROR);
            // usuarioCreado.setTitle("!! ERROR ¡¡");
            error.setContentText("ERROR - " + e.getMessage());
            error.showAndWait();

        }

    }

    @FXML
    void initialize() {
        assert idApellidos != null : "fx:id=\"idApellidos\" was not injected: check your FXML file 'insertar.fxml'.";
        assert idCargo != null : "fx:id=\"idCargo\" was not injected: check your FXML file 'insertar.fxml'.";
        assert idFecha != null : "fx:id=\"idFecha\" was not injected: check your FXML file 'insertar.fxml'.";
        assert idInsertar != null : "fx:id=\"idInsertar\" was not injected: check your FXML file 'insertar.fxml'.";
        assert idIrPaginaPrincipal != null
                : "fx:id=\"idIrPaginaPrincipal\" was not injected: check your FXML file 'insertar.fxml'.";
        assert idNombre != null : "fx:id=\"idNombre\" was not injected: check your FXML file 'insertar.fxml'.";
        assert idTelefono != null : "fx:id=\"idTelefono\" was not injected: check your FXML file 'insertar.fxml'.";

    }

}
