package com.mediconnect.dao;

import com.mediconnect.model.BillItem;
import com.mediconnect.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BillItemDAO {

    public boolean saveBillItem(
            int billId,
            BillItem item) {

        String sql =
                "INSERT INTO bill_items " +
                "(bill_id, medicine_name, quantity, price, gst, amount) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, billId);
            pst.setString(2, item.getMedicineName());
            pst.setInt(3, item.getQuantity());
            pst.setDouble(4, item.getPrice());
            pst.setDouble(5, item.getGst());
            pst.setDouble(6, item.getAmount());

            return pst.executeUpdate() > 0;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}