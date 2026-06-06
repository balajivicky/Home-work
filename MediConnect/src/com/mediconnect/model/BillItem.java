package com.mediconnect.model;

import java.time.LocalDate;

public class BillItem {

    private String medicineName;
    private LocalDate expiryDate;
    private String batchNo;
    private int quantity;
    private double price;
    private double gst;
    private double amount;

    public BillItem(String medicineName,
                    LocalDate expiryDate,
                    String batchNo,
                    int quantity,
                    double price,
                    double gst,
                    double amount) {

        this.medicineName = medicineName;
        this.expiryDate = expiryDate;
        this.batchNo = batchNo;
        this.quantity = quantity;
        this.price = price;
        this.gst = gst;
        this.amount = amount;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getGst() {
        return gst;
    }

    public double getAmount() {
        return amount;
    }
}


