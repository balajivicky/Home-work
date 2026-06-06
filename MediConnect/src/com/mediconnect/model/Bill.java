package com.mediconnect.model;

import java.time.LocalDate;

public class Bill {

    private int billId;
    private String customerName;
    private String phoneNo;
    private LocalDate billDate;
    private double subTotal;
    private double gst;
    private double grandTotal;

    public Bill(int billId,
                String customerName,
                String phoneNo,
                LocalDate billDate,
                double subTotal,
                double gst,
                double grandTotal) {

        this.billId = billId;
        this.customerName = customerName;
        this.phoneNo = phoneNo;
        this.billDate = billDate;
        this.subTotal = subTotal;
        this.gst = gst;
        this.grandTotal = grandTotal;
    }

    public Bill(String customerName,
                String phoneNo,
                LocalDate billDate,
                double subTotal,
                double gst,
                double grandTotal) {

        this.customerName = customerName;
        this.phoneNo = phoneNo;
        this.billDate = billDate;
        this.subTotal = subTotal;
        this.gst = gst;
        this.grandTotal = grandTotal;
    }

    public int getBillId() {
        return billId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getGst() {
        return gst;
    }

    public double getGrandTotal() {
        return grandTotal;
    }
}

