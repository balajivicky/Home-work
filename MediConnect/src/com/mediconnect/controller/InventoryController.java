package com.mediconnect.controller;

import com.mediconnect.dao.MedicineDAO;
import com.mediconnect.model.Medicine;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController implements Initializable {

    @FXML
    private TextField txtSearch;

    @FXML
    private TableView<Medicine> inventoryTable;

    @FXML
    private TableColumn<Medicine, Integer> colId;

    @FXML
    private TableColumn<Medicine, String> colMedicineName;

    @FXML
    private TableColumn<Medicine, String> colCompany;

    @FXML
    private TableColumn<Medicine, String> colCategory;

    @FXML
    private TableColumn<Medicine, String> colBatchNo;

    @FXML
    private TableColumn<Medicine, LocalDate> colExpiryDate;

    @FXML
    private TableColumn<Medicine, Double> colPrice;

    @FXML
    private TableColumn<Medicine, Integer> colQuantity;

    @FXML
    private TableColumn<Medicine, Double> colGST;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        colId.setCellValueFactory(
                new PropertyValueFactory<>("id"));

        colMedicineName.setCellValueFactory(
                new PropertyValueFactory<>("medicineName"));

        colCompany.setCellValueFactory(
                new PropertyValueFactory<>("company"));

        colCategory.setCellValueFactory(
                new PropertyValueFactory<>("category"));

        colBatchNo.setCellValueFactory(
                new PropertyValueFactory<>("batchNo"));

        colExpiryDate.setCellValueFactory(
                new PropertyValueFactory<>("expiryDate"));

        colPrice.setCellValueFactory(
                new PropertyValueFactory<>("price"));

        colQuantity.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        colGST.setCellValueFactory(
                new PropertyValueFactory<>("gst"));

        loadMedicines();
    }

    private void loadMedicines() {

        MedicineDAO dao =
                new MedicineDAO();

        ObservableList<Medicine> medicines =
                dao.getAllMedicines();

        inventoryTable.setItems(medicines);
    }
    @FXML
private void refreshInventory() {

    txtSearch.clear();

    loadMedicines();
}
@FXML
private void showExpiringSoon() {

    MedicineDAO dao =
            new MedicineDAO();

    ObservableList<Medicine> allMedicines =
            dao.getAllMedicines();

    ObservableList<Medicine> expiringSoon =
            FXCollections.observableArrayList();

    LocalDate today =
            LocalDate.now();

    for (Medicine medicine : allMedicines) {

        if (medicine.getExpiryDate()
                .isBefore(today.plusDays(30))) {

            expiringSoon.add(medicine);
        }
    }

    inventoryTable.setItems(expiringSoon);
}
@FXML
private void showLowStock() {

    MedicineDAO dao =
            new MedicineDAO();

    ObservableList<Medicine> allMedicines =
            dao.getAllMedicines();

    ObservableList<Medicine> lowStock =
            FXCollections.observableArrayList();

    for (Medicine medicine : allMedicines) {

        if (medicine.getQuantity() <= 10) {

            lowStock.add(medicine);
        }
    }

    inventoryTable.setItems(lowStock);
}
@FXML
private void searchMedicine() {

    String keyword =
            txtSearch.getText().trim().toLowerCase();

    MedicineDAO dao =
            new MedicineDAO();

    ObservableList<Medicine> allMedicines =
            dao.getAllMedicines();

    ObservableList<Medicine> filtered =
            FXCollections.observableArrayList();

    for (Medicine medicine : allMedicines) {

        if (medicine.getMedicineName()
                .toLowerCase()
                .contains(keyword)) {

            filtered.add(medicine);
        }
    }

    inventoryTable.setItems(filtered);
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

        Parent root =
                FXMLLoader.load(
                        getClass().getResource(
                                "/com/mediconnect/view/" + fxml));

        Stage stage =
                (Stage)((Node)event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.show();
    }
}