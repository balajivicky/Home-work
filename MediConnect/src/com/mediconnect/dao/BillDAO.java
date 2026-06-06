package com.mediconnect.dao;

import com.mediconnect.model.Bill;
import com.mediconnect.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class BillDAO {

    public int saveBill(Bill bill) {

        String sql =
                "INSERT INTO bills " +
                "(customer_name, phone_no, bill_date, subtotal, gst, grand_total) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement pst =
                    con.prepareStatement(
                            sql,
                            Statement.RETURN_GENERATED_KEYS
                    );

            pst.setString(1, bill.getCustomerName());
            pst.setString(2, bill.getPhoneNo());

            pst.setDate(
                    3,
                    java.sql.Date.valueOf(
                            bill.getBillDate()
                    )
            );

            pst.setDouble(4, bill.getSubTotal());
            pst.setDouble(5, bill.getGst());
            pst.setDouble(6, bill.getGrandTotal());

            pst.executeUpdate();

            ResultSet rs =
                    pst.getGeneratedKeys();

            if (rs.next()) {

                return rs.getInt(1);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return -1;
    }
}

