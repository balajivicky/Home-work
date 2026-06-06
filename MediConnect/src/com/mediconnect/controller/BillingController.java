package com.mediconnect.controller;

import com.mediconnect.dao.MedicineDAO;
import com.mediconnect.model.BillItem;
import com.mediconnect.model.Medicine;
import com.mediconnect.dao.BillDAO;
import com.mediconnect.dao.BillItemDAO;
import com.mediconnect.model.Bill;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

public class BillingController implements Initializable {

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtPhoneNo;

    @FXML
    private TextField txtMedicineSearch;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TableView<BillItem> billingTable;

    @FXML
    private TableColumn<BillItem, String> colMedicineName;

    @FXML
    private TableColumn<BillItem, LocalDate> colExpiryDate;

    @FXML
    private TableColumn<BillItem, String> colBatchNo;

    @FXML
    private TableColumn<BillItem, Integer> colQty;

    @FXML
    private TableColumn<BillItem, Double> colPrice;

    @FXML
    private TableColumn<BillItem, Double> colGST;

    @FXML
    private TableColumn<BillItem, Double> colAmount;

    @FXML
    private Label lblSubTotal;

    @FXML
    private Label lblGST;

    @FXML
    private Label lblGrandTotal;

    private ObservableList<BillItem> billItems =
            FXCollections.observableArrayList();

    private double subTotal = 0;
    private double gstTotal = 0;
    private double grandTotal = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        colMedicineName.setCellValueFactory(
                new PropertyValueFactory<>("medicineName"));

        colExpiryDate.setCellValueFactory(
                new PropertyValueFactory<>("expiryDate"));

        colBatchNo.setCellValueFactory(
                new PropertyValueFactory<>("batchNo"));

        colQty.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        colPrice.setCellValueFactory(
                new PropertyValueFactory<>("price"));

        colGST.setCellValueFactory(
                new PropertyValueFactory<>("gst"));

        colAmount.setCellValueFactory(
                new PropertyValueFactory<>("amount"));

        billingTable.setItems(billItems);
    }

    @FXML
    public void addMedicine() {

        try {

            String medicineName =
                    txtMedicineSearch.getText().trim();

            int qty =
                    Integer.parseInt(
                            txtQuantity.getText().trim());

            MedicineDAO dao =
                    new MedicineDAO();

            Medicine medicine =
                    dao.getMedicineByName(medicineName);

            if (medicine == null) {

                Alert alert =
                        new Alert(Alert.AlertType.ERROR);

                alert.setContentText("Medicine Not Found");
                alert.showAndWait();
                return;
            }

            double amount =
                    medicine.getPrice() * qty;

            double gstAmount =
                    amount * medicine.getGst() / 100;

            double finalAmount =
                    amount + gstAmount;

            BillItem item =
                    new BillItem(
                            medicine.getMedicineName(),
                            medicine.getExpiryDate(),
                            medicine.getBatchNo(),
                            qty,
                            medicine.getPrice(),
                            medicine.getGst(),
                            finalAmount
                    );

            billItems.add(item);

            subTotal += amount;
            gstTotal += gstAmount;
            grandTotal = subTotal + gstTotal;

            lblSubTotal.setText(
                    String.format("%.2f", subTotal));

            lblGST.setText(
                    String.format("%.2f", gstTotal));

            lblGrandTotal.setText(
                    "Grand Total : ₹" +
                    String.format("%.2f", grandTotal));

            txtMedicineSearch.clear();
            txtQuantity.clear();

        } catch (Exception e) {

            e.printStackTrace();

            Alert alert =
                    new Alert(Alert.AlertType.ERROR);

            alert.setContentText("Enter Valid Data");
            alert.showAndWait();
        }
    }
@FXML
private void saveBill() {

    try {

        Bill bill =
                new Bill(
                        txtCustomerName.getText(),
                        txtPhoneNo.getText(),
                        java.time.LocalDate.now(),
                        subTotal,
                        gstTotal,
                        grandTotal
                );

        BillDAO billDAO =
                new BillDAO();

        int billId =
                billDAO.saveBill(bill);

        if (billId > 0) {

            BillItemDAO itemDAO =
                    new BillItemDAO();

            for (BillItem item : billItems) {

                itemDAO.saveBillItem(
                        billId,
                        item
                );
            }

            Alert alert =
                    new Alert(Alert.AlertType.INFORMATION);

            alert.setHeaderText(null);

            alert.setContentText(
                    "Bill Saved Successfully\nBill ID : "
                            + billId);

            alert.showAndWait();

        } else {

            Alert alert =
                    new Alert(Alert.AlertType.ERROR);

            alert.setHeaderText(null);

            alert.setContentText(
                    "Failed To Save Bill");

            alert.showAndWait();
        }

    } catch (Exception e) {

        e.printStackTrace();

        Alert alert =
                new Alert(Alert.AlertType.ERROR);

        alert.setHeaderText(null);

        alert.setContentText(
                "Error Saving Bill");

        alert.showAndWait();
    }
}

    @FXML
    private void clearBill() {

        billItems.clear();

        txtCustomerName.clear();
        txtPhoneNo.clear();
        txtMedicineSearch.clear();
        txtQuantity.clear();

        subTotal = 0;
        gstTotal = 0;
        grandTotal = 0;

        lblSubTotal.setText("0.00");
        lblGST.setText("0.00");
        lblGrandTotal.setText("Grand Total : ₹0.00");
    }

    @FXML
    private void printBill() {

        Alert alert =
                new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText("Print Bill Logic Next");
        alert.showAndWait();
    }
}