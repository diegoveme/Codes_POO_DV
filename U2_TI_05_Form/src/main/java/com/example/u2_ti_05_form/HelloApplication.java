package com.example.u2_ti_05_form;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.scene.control.Button;

import org.controlsfx.control.action.Action;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido: ");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad: ");
        TextField tfEdad = new TextField();
        Label lblRol = new Label("Rol: ");
        ObservableList<String> Rol = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> cbRol = new ComboBox<>(Rol);
        Button btnCrear = new Button("Creado");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label("Resultado: ");
        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: green;");
        lblResultado.setStyle("-fx-text-fill: #4bd8e6;");

        btnCrear.setOnAction( e -> {
            if (tfNombre.getText().isEmpty() || tfApellido.getText().isEmpty() || tfEdad.getText().isEmpty()) {
                lblResultado.setText("Ingresa datos en los campos");
            }
        else {
            lblResultado.setText("Nombre: " + tfNombre.getText() + " Apellido: " + tfApellido.getText() + " Edad: " + tfEdad.getText());
            }});
        btnReset.setOnAction( e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cbRol.getSelectionModel().clearSelection();
            lblResultado.setText("");
            lblResultado.setStyle("");
            grid.setStyle("");
        });

        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(lblNombre, 0, 0);
        grid.add(tfNombre, 1, 0);
        grid.add(lblApellido, 0, 1);
        grid.add(tfApellido, 1, 1);
        grid.add(lblEdad, 0, 2);
        grid.add(tfEdad, 1, 2);
        grid.add(lblRol, 0, 3);
        grid.add(cbRol, 1, 3);
        grid.add(btnCrear, 1, 4);
        grid.add(btnReset, 1, 5);
        grid.add(lblResultado, 1, 6);

        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}