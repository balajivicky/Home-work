package com.mediconnect.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExpiryController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void openDashboard(ActionEvent event) throws IOException {
        loadScreen(event, "dashboard.fxml", "Dashboard");
    }

    @FXML
    private void openBilling(ActionEvent event) throws IOException {
        loadScreen(event, "billing.fxml", "Billing");
    }

    @FXML
    private void openMedicines(ActionEvent event) throws IOException {
        loadScreen(event, "medicines.fxml", "Medicines");
    }

    @FXML
    private void openInventory(ActionEvent event) throws IOException {
        loadScreen(event, "inventory.fxml", "Inventory");
    }

    @FXML
    private void openExpiry(ActionEvent event) throws IOException {
        loadScreen(event, "expiry.fxml", "Expiry");
    }

    @FXML
    private void openReports(ActionEvent event) throws IOException {
        loadScreen(event, "reports.fxml", "Reports");
    }

    @FXML
    private void openPatients(ActionEvent event) throws IOException {
        loadScreen(event, "patients.fxml", "Patients");
    }

    @FXML
    private void openSettings(ActionEvent event) throws IOException {
        loadScreen(event, "settings.fxml", "Settings");
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        loadScreen(event, "login.fxml", "Login");
    }

    private void loadScreen(ActionEvent event,
                            String fxml,
                            String title) throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource(
                        "/com/mediconnect/view/" + fxml));

        Stage stage = (Stage)((Node)event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.show();
    }
}