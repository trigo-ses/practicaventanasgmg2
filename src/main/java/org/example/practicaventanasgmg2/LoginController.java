package org.example.practicaventanasgmg2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controlador de la ventana de inicio de sesión ({@code login.fxml}).
 * <p>
 * Al pulsar el botón de iniciar, abre la ventana principal de la aplicación
 * ({@code hello-view.fxml}) y cierra la ventana de login.
 */
public class LoginController {

    /**
     * Botón que inicia la aplicación.
     */
    @FXML
    private Button btnIniciar;

    /**
     * Abre la ventana principal de la aplicación y cierra la ventana de login.
     *
     * @param event evento de acción que dispara el inicio
     */
    @FXML
    private void handleIniciar(ActionEvent event) {
        try {
            // 1. Cargar la vista principal de la aplicación
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            // 2. Crear la ventana principal
            Stage ventanaPrincipal = new Stage();
            ventanaPrincipal.setTitle("Gestor de Material G2");
            ventanaPrincipal.setScene(new Scene(root));
            ventanaPrincipal.show();

            // 3. Cerrar la ventana actual de inicio de sesión
            Stage ventanaActual = (Stage) btnIniciar.getScene().getWindow();
            ventanaActual.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se pudo cargar la vista principal.");
        }
    }
}
