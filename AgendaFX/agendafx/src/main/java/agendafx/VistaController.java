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

public class VistaController {

    private int posicion = -1;

    private boolean medio = false;

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

    public static ArrayList empleados() {

        ArrayList<empleado> empleados = new ArrayList<empleado>();

        try {

            Connection con = conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleados");

            while (rs.next()) {

                empleados
                        .add(new empleado(rs.getString("idEmpleado"), rs.getString("nombre"), rs.getString("apellidos"),
                                rs.getString("telefono"), rs.getString("fechaNacimiento"), rs.getString("cargo")));

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return empleados;

    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button idAnterior;

    @FXML
    private TextField idApellidos;

    @FXML
    private Button idBorrar;

    @FXML
    private TextField idCargo;

    @FXML
    private TextField idEmpleado;

    @FXML
    private TextField idFecha;

    @FXML
    private Button idFin;

    @FXML
    private Button idIni;

    @FXML
    private Button idInsertar;

    @FXML
    private Button idModificar;

    @FXML
    private TextField idNombre;

    @FXML
    private Button idSiguiente;

    @FXML
    private TextField idTelefono;

    @FXML
    void anterior(ActionEvent event) {

        if (empleados().size() == 0) {

            idAnterior.setDisable(true);
            idSiguiente.setDisable(true);

        }

        if (!medio) {

            posicion = posicion - 1;

        }

        if (posicion == 0) {

            idAnterior.setDisable(true);

        } else {

            idAnterior.setDisable(false);

        }

        if (posicion == empleados().size() - 1) {

            idSiguiente.setDisable(true);

        } else {

            idSiguiente.setDisable(false);

        }

        if (empleados().size() <= 1) {

            idFin.setDisable(true);
            idIni.setDisable(true);

        }

        idEmpleado.setText(((empleado) empleados().get(posicion)).getIdEmpleado());
        idNombre.setText(((empleado) empleados().get(posicion)).getNombre());
        idApellidos.setText(((empleado) empleados().get(posicion)).getApellidos());
        idTelefono.setText(((empleado) empleados().get(posicion)).getTelefono());
        idFecha.setText(((empleado) empleados().get(posicion)).getFechaNacimiento());
        idCargo.setText(((empleado) empleados().get(posicion)).getCargo());

        medio = false;

    }

    @FXML
    void borrar(ActionEvent event) {

        //System.out.println(posicion + " - " + empleados().size());

        if ((idNombre.getText().isEmpty() ||
                idApellidos.getText().isEmpty() ||
                idTelefono.getText().isEmpty() ||
                idFecha.getText().isEmpty() ||
                idCargo.getText().isEmpty()) && posicion < 0) {

            idAnterior.setDisable(true);
            posicion = -1;
            //System.out.println("1");

        } else if ((idNombre.getText().isEmpty() ||
                idApellidos.getText().isEmpty() ||
                idTelefono.getText().isEmpty() ||
                idFecha.getText().isEmpty() ||
                idCargo.getText().isEmpty()) && posicion >= 0 && empleados().size() != 1) {

            idSiguiente.setDisable(true);
            posicion = empleados().size()-1;
            //System.out.println("2");

        } else if (posicion == 0 && empleados().size() != 1) {

            posicion = -1;
            //System.out.println("2.2");

        } else {

            if (empleados().size() > 2 & posicion > 0
                    || empleados().size() > 2 & posicion < empleados().size() - 1 & posicion > 0) {
                //System.out.println("3");
                medio = true;
                posicion--;

            } else {

                if (empleados().size() != 2 && !(idNombre.getText().isEmpty() ||
                idApellidos.getText().isEmpty() ||
                idTelefono.getText().isEmpty() ||
                idFecha.getText().isEmpty() ||
                idCargo.getText().isEmpty())) {
                    //System.out.println("4");
                    posicion--;

                }

            }

        }

        if (empleados().size() <= 2) {

            idFin.setDisable(true);
            idIni.setDisable(true);

        }

        Connection con = conectar();
        String sql;
        PreparedStatement ps;

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT idEmpleado FROM empleados WHERE idEmpleado = '"
                    + idEmpleado.getText() + "' AND nombre = '" + idNombre.getText() + "' AND apellidos = '"
                    + idApellidos.getText() + "' AND telefono = '" + idTelefono.getText() + "'");

            if (!rs.next()) {

                throw new Exception("Usuario no encontrado con esos valores");

            }

            sql = "DELETE FROM empleados WHERE idEmpleado = ? AND nombre = ? AND apellidos = ? AND telefono = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, idEmpleado.getText());
            ps.setString(2, idNombre.getText());
            ps.setString(3, idApellidos.getText());
            ps.setString(4, idTelefono.getText());
            ps.executeUpdate();

            idEmpleado.clear();
            idNombre.clear();
            idApellidos.clear();
            idTelefono.clear();
            idFecha.clear();
            idCargo.clear();

            Alert usuarioEliminado = new Alert(Alert.AlertType.CONFIRMATION);
            // usuarioCreado.setTitle("!! USUARIO CREADO ¡¡");
            usuarioEliminado.setContentText("Usuario eliminado con exito :)");
            usuarioEliminado.showAndWait();

        } catch (Exception e) {

            Alert error = new Alert(Alert.AlertType.ERROR);
            // usuarioCreado.setTitle("!! ERROR ¡¡");
            error.setContentText("ERROR - " + e.getMessage());
            error.showAndWait();

        }

        //System.out.println(posicion + " - " + empleados().size());

    }

    @FXML
    void fin(ActionEvent event) {

        posicion = empleados().size() - 1;

        if (posicion == empleados().size() - 1) {

            idSiguiente.setDisable(true);

        } else {

            idSiguiente.setDisable(false);

        }

        if (posicion == 0) {

            idAnterior.setDisable(true);

        } else {

            idAnterior.setDisable(false);

        }

        if (empleados().size() <= 1) {

            idAnterior.setDisable(true);
            idSiguiente.setDisable(true);

        }

        idEmpleado.setText(((empleado) empleados().get(empleados().size() - 1)).getIdEmpleado());
        idNombre.setText(((empleado) empleados().get(empleados().size() - 1)).getNombre());
        idApellidos.setText(((empleado) empleados().get(empleados().size() - 1)).getApellidos());
        idTelefono.setText(((empleado) empleados().get(empleados().size() - 1)).getTelefono());
        idFecha.setText(((empleado) empleados().get(empleados().size() - 1)).getFechaNacimiento());
        idCargo.setText(((empleado) empleados().get(empleados().size() - 1)).getCargo());

        medio = false;

    }

    @FXML
    void inicio(ActionEvent event) {

        if (empleados().size() <= 1) {

            idAnterior.setDisable(true);
            idSiguiente.setDisable(true);

        }

        posicion = 0;

        if (posicion == empleados().size() - 1) {

            idSiguiente.setDisable(true);

        } else {

            idSiguiente.setDisable(false);

        }

        if (posicion == 0) {

            idAnterior.setDisable(true);

        } else {

            idAnterior.setDisable(false);

        }

        idEmpleado.setText(((empleado) empleados().get(0)).getIdEmpleado());
        idNombre.setText(((empleado) empleados().get(0)).getNombre());
        idApellidos.setText(((empleado) empleados().get(0)).getApellidos());
        idTelefono.setText(((empleado) empleados().get(0)).getTelefono());
        idFecha.setText(((empleado) empleados().get(0)).getFechaNacimiento());
        idCargo.setText(((empleado) empleados().get(0)).getCargo());

        medio = false;

    }

    @FXML
    private void cambiarInsertar(ActionEvent event) throws IOException {
        App.setRoot("insertar");
    }

    @FXML
    void modificar(ActionEvent event) {

        if (empleados().size() <= 1) {

            idAnterior.setDisable(true);
            idSiguiente.setDisable(true);
            idFin.setDisable(true);
            idIni.setDisable(true);

        }

        Connection con = conectar();
        String sql;
        PreparedStatement ps;

        try {

            if (idNombre.getText().isEmpty() ||
                    idApellidos.getText().isEmpty() ||
                    idTelefono.getText().isEmpty() ||
                    idFecha.getText().isEmpty() ||
                    idCargo.getText().isEmpty()) {

                throw new Exception("Debes rellenar todos los campos");

            }

            sql = "UPDATE empleados SET nombre = ?, apellidos = ?, telefono = ?, fechaNacimiento = ?, cargo = ? WHERE idEmpleado = "
                    + idEmpleado.getText();
            ps = con.prepareStatement(sql);
            ps.setString(1, idNombre.getText());
            ps.setString(2, idApellidos.getText());
            ps.setString(3, idTelefono.getText());
            ps.setString(4, idFecha.getText());
            ps.setString(5, idCargo.getText());
            ps.executeUpdate();

            Alert usuarioEditado = new Alert(Alert.AlertType.CONFIRMATION);
            // usuarioCreado.setTitle("!! USUARIO CREADO ¡¡");
            usuarioEditado.setContentText("Usuario editado con exito :)");
            usuarioEditado.showAndWait();

        } catch (Exception e) {

            Alert error = new Alert(Alert.AlertType.ERROR);
            // usuarioCreado.setTitle("!! ERROR ¡¡");
            error.setContentText("ERROR - " + e.getMessage());
            error.showAndWait();

        }

    }

    @FXML
    void siguiente(ActionEvent event) {

        posicion = posicion + 1;

        if (posicion == empleados().size() - 1) {

            idSiguiente.setDisable(true);

        } else {

            idSiguiente.setDisable(false);

        }

        if (posicion == 0) {

            idAnterior.setDisable(true);

        } else {

            idAnterior.setDisable(false);

        }

        if (empleados().size() <= 1) {

            idFin.setDisable(true);
            idIni.setDisable(true);

        }

        idEmpleado.setText(((empleado) empleados().get(posicion)).getIdEmpleado());
        idNombre.setText(((empleado) empleados().get(posicion)).getNombre());
        idApellidos.setText(((empleado) empleados().get(posicion)).getApellidos());
        idTelefono.setText(((empleado) empleados().get(posicion)).getTelefono());
        idFecha.setText(((empleado) empleados().get(posicion)).getFechaNacimiento());
        idCargo.setText(((empleado) empleados().get(posicion)).getCargo());

        medio = false;

    }

    @FXML
    void initialize() {
        assert idAnterior != null : "fx:id=\"idAnterior\" was not injected: check your FXML file 'vista.fxml'.";
        assert idApellidos != null : "fx:id=\"idApellidos\" was not injected: check your FXML file 'vista.fxml'.";
        assert idBorrar != null : "fx:id=\"idBorrar\" was not injected: check your FXML file 'vista.fxml'.";
        assert idCargo != null : "fx:id=\"idCargo\" was not injected: check your FXML file 'vista.fxml'.";
        assert idEmpleado != null : "fx:id=\"idEmpleado\" was not injected: check your FXML file 'vista.fxml'.";
        assert idFecha != null : "fx:id=\"idFecha\" was not injected: check your FXML file 'vista.fxml'.";
        assert idFin != null : "fx:id=\"idFin\" was not injected: check your FXML file 'vista.fxml'.";
        assert idIni != null : "fx:id=\"idIni\" was not injected: check your FXML file 'vista.fxml'.";
        assert idInsertar != null : "fx:id=\"idInsertar\" was not injected: check your FXML file 'vista.fxml'.";
        assert idModificar != null : "fx:id=\"idModificar\" was not injected: check your FXML file 'vista.fxml'.";
        assert idNombre != null : "fx:id=\"idNombre\" was not injected: check your FXML file 'vista.fxml'.";
        assert idSiguiente != null : "fx:id=\"idSiguiente\" was not injected: check your FXML file 'vista.fxml'.";
        assert idTelefono != null : "fx:id=\"idTelefono\" was not injected: check your FXML file 'vista.fxml'.";

        idAnterior.setDisable(true);

        if (empleados().size() <= 1) {

            idAnterior.setDisable(true);
            idFin.setDisable(true);
            idIni.setDisable(true);

        }

        if (empleados().size() == 0) {

            idAnterior.setDisable(true);
            idSiguiente.setDisable(true);
            idFin.setDisable(true);
            idIni.setDisable(true);

        }

    }

}
