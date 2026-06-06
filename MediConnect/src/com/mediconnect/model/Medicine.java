package com.mediconnect.model;

import java.time.LocalDate;

public class Medicine {

    private int id;
    private String medicineName;
    private String company;
    private String category;
    private String batchNo;
    private LocalDate expiryDate;
    private double price;
    private int quantity;
    private double gst;

    public Medicine(int id,
                    String medicineName,
                    String company,
                    String category,
                    String batchNo,
                    LocalDate expiryDate,
                    double price,
                    int quantity,
                    double gst) {

        this.id = id;
        this.medicineName = medicineName;
        this.company = company;
        this.category = category;
        this.batchNo = batchNo;
        this.expiryDate = expiryDate;
        this.price = price;
        this.quantity = quantity;
        this.gst = gst;
    }

    public Medicine(String medicineName,
                    String company,
                    String category,
                    String batchNo,
                    LocalDate expiryDate,
                    double price,
                    int quantity,
                    double gst) {

        this.medicineName = medicineName;
        this.company = company;
        this.category = category;
        this.batchNo = batchNo;
        this.expiryDate = expiryDate;
        this.price = price;
        this.quantity = quantity;
        this.gst = gst;
    }

    public int getId() {
        return id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getCompany() {
        return company;
    }

    public String getCategory() {
        return category;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getGst() {
        return gst;
    }
}