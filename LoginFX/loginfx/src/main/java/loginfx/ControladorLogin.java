package loginfx;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.*;
import java.io.*;
import java.io.File;

public class ControladorLogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button idboton;

    @FXML
    private TextField idcontrasenya;

    @FXML
    private TextField idusuario;

    @FXML
    void validar(ActionEvent event) {

        Scanner sc = new Scanner(System.in);

        // PARA INICIAR SESION
        String usuario = idusuario.getText();
        String contrasena = idcontrasenya.getText();

        // VARIABLES
        Scanner entrada = null;
        String linea;
        boolean contiene = false;
        boolean usuarioEncontrado = false;

        try {

            // Pasar el contenido del bloc de notas a una arraylist de usuarios

            ArrayList<usuario> usuarios = new ArrayList<usuario>();

            File f = new File("src/main/java/loginfx/usuarios.txt");
            entrada = new Scanner(f);

            while (entrada.hasNext()) {

                linea = entrada.nextLine();

                String[] lineaSeparada = linea.split(":");

                usuarios.add(new usuario(lineaSeparada[0], lineaSeparada[1]));

            }

            // Comprobar que el usuario y contraseña escrito no tienen espacios en blanco

            if (usuario.contains(" ") || contrasena.contains(" ")) {

                throw new excepciones.espacioEnBlanco(
                        "El nombre y contrasena no puede contener espacios");

            }

            for (int i = 0; i < usuarios.size(); i++) {

                if (usuarios.get(i).getNombre().equals(usuario)) { // SI ENCUENTRA EL USUARIO

                    usuarioEncontrado = true;

                }

                if (usuarios.get(i).getNombre().equals(usuario) && usuarios.get(i).getConsetrena().equals(contrasena)) { // SI EL USUARIO Y LA CONSEÑA SON CORRECTOS

                    Alert sesionIniciada = new Alert(Alert.AlertType.CONFIRMATION);
                    sesionIniciada.setTitle("SESION INICIADA");
                    sesionIniciada.setContentText("Bienvenido " + usuario);
                    sesionIniciada.showAndWait();

                    contiene = true;

                }

            }

            // SI EL ARCHIVO NO CONTIENE EL USUARIO CON LA CONTRASEÑA DADOS ...

            if (!contiene) {

                if (usuarioEncontrado) { // SI A ENCONTRADO EL USUARIO Y LA CONSTRASEÑA ES INCORRECTA

                    Alert contraseñaIncorrecta = new Alert(Alert.AlertType.ERROR);
                    contraseñaIncorrecta.setTitle("!! CONTRASEÑA INCORRECTA ¡¡");
                    contraseñaIncorrecta.setContentText("Usuario: " + usuario + " - " + "Constrasena: " + contrasena);
                    contraseñaIncorrecta.showAndWait();

                } else { // SI NO A ENCONTRADO AL USUARIO

                    Alert usuarioNoEncontrado = new Alert(Alert.AlertType.ERROR);
                    usuarioNoEncontrado.setTitle("!! USUARIO NO EXISTENTE ¡¡");
                    usuarioNoEncontrado.setContentText("Usuario: " + usuario);
                    usuarioNoEncontrado.showAndWait();

                }

            }

        } catch (excepciones.espacioEnBlanco e) {

            Alert alertEspacioBlanco = new Alert(Alert.AlertType.ERROR);
            alertEspacioBlanco.setTitle("!! ERROR ¡¡");
            alertEspacioBlanco.setContentText(e.getMessage());
            alertEspacioBlanco.showAndWait();

        } catch (Exception e) {

            System.out.println(e.toString());

        } finally {

            if (entrada != null) {

                entrada.close();

            }

        }

    }

    @FXML
    void initialize() {
        assert idboton != null : "fx:id=\"idboton\" was not injected: check your FXML file 'vista.fxml'.";
        assert idcontrasenya != null : "fx:id=\"idcontrasenya\" was not injected: check your FXML file 'vista.fxml'.";
        assert idusuario != null : "fx:id=\"idusuario\" was not injected: check your FXML file 'vista.fxml'.";

    }

}
