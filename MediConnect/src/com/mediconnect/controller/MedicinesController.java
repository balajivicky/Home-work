package com.mediconnect.controller;

import com.mediconnect.dao.MedicineDAO;
import com.mediconnect.model.Medicine;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

public class MedicinesController implements Initializable {

    @FXML
    private TextField txtMedicineName;

    @FXML
    private TextField txtCompany;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtBatchNo;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtGST;

    @FXML
    private DatePicker dpMfgDate;

    @FXML
    private DatePicker dpExpiryDate;

    @FXML
    private TableView<Medicine> medicineTable;

    @FXML
    private TableColumn<Medicine, Integer> colSerialNo;

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
        System.out.println("MEDICINES CONTROLLER LOADED");
        colSerialNo.setCellValueFactory(
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

    @FXML
    private void saveMedicine(ActionEvent event) {

        try {

            String medicineName = txtMedicineName.getText();
            String company = txtCompany.getText();
            String category = txtCategory.getText();
            String batchNo = txtBatchNo.getText();

            LocalDate expiryDate =
                    dpExpiryDate.getValue();

            double price =
                    Double.parseDouble(txtPrice.getText());

            int quantity =
                    Integer.parseInt(txtQuantity.getText());

            double gst =
                    Double.parseDouble(txtGST.getText());

            Medicine medicine =
                    new Medicine(
                            medicineName,
                            company,
                            category,
                            batchNo,
                            expiryDate,
                            price,
                            quantity,
                            gst
                    );

            MedicineDAO medicineDAO =
                    new MedicineDAO();

            boolean saved =
                    medicineDAO.saveMedicine(medicine);

            if (saved) {

                Alert alert =
                        new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText(
                        "Medicine Saved Successfully");

                alert.showAndWait();

                clearFields();

                loadMedicines();

            } else {

                Alert alert =
                        new Alert(Alert.AlertType.ERROR);

                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText(
                        "Failed To Save Medicine");

                alert.showAndWait();
            }

        } catch (Exception e) {

            e.printStackTrace();

            Alert alert =
                    new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(
                    "Please Enter Valid Data");

            alert.showAndWait();
        }
    }

    private void loadMedicines() {

    MedicineDAO dao = new MedicineDAO();

    ObservableList<Medicine> medicines =
            dao.getAllMedicines();

    System.out.println("Records Found = " + medicines.size());

    for(Medicine m : medicines){
        System.out.println(m.getMedicineName());
    }

    medicineTable.setItems(medicines);
}

    private void clearFields() {

        txtMedicineName.clear();
        txtCompany.clear();
        txtCategory.clear();
        txtBatchNo.clear();

        txtPrice.clear();
        txtQuantity.clear();
        txtGST.clear();

        dpMfgDate.setValue(null);
        dpExpiryDate.setValue(null);
    }
}