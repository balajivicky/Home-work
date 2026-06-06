package com.mediconnect.dao;

import com.mediconnect.model.Medicine;
import com.mediconnect.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MedicineDAO {

    public boolean saveMedicine(Medicine medicine) {

        String sql =
                "INSERT INTO medicines " +
                "(medicine_name, company, category, batch_no, expiry_date, price, quantity, gst) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, medicine.getMedicineName());
            pst.setString(2, medicine.getCompany());
            pst.setString(3, medicine.getCategory());
            pst.setString(4, medicine.getBatchNo());

            pst.setDate(
                    5,
                    java.sql.Date.valueOf(
                            medicine.getExpiryDate()
                    )
            );

            pst.setDouble(6, medicine.getPrice());
            pst.setInt(7, medicine.getQuantity());
            pst.setDouble(8, medicine.getGst());

            return pst.executeUpdate() > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    public ObservableList<Medicine> getAllMedicines() {

        ObservableList<Medicine> medicines =
                FXCollections.observableArrayList();

        String sql = "SELECT * FROM medicines";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement pst =
                    con.prepareStatement(sql);

            ResultSet rs =
                    pst.executeQuery();

            while (rs.next()) {

                Medicine medicine =
                        new Medicine(
                                rs.getInt("id"),
                                rs.getString("medicine_name"),
                                rs.getString("company"),
                                rs.getString("category"),
                                rs.getString("batch_no"),
                                rs.getDate("expiry_date").toLocalDate(),
                                rs.getDouble("price"),
                                rs.getInt("quantity"),
                                rs.getDouble("gst")
                        );

                medicines.add(medicine);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return medicines;
    }

   public Medicine getMedicineByName(String medicineName) {

    String sql =
            "SELECT * FROM medicines WHERE LOWER(medicine_name) = LOWER(?)";

    try {

        Connection con =
                DBConnection.getConnection();

        PreparedStatement pst =
                con.prepareStatement(sql);

        pst.setString(1, medicineName.trim());

        ResultSet rs =
                pst.executeQuery();

        if (rs.next()) {

            System.out.println("FOUND : "
                    + rs.getString("medicine_name"));

            return new Medicine(
                    rs.getInt("id"),
                    rs.getString("medicine_name"),
                    rs.getString("company"),
                    rs.getString("category"),
                    rs.getString("batch_no"),
                    rs.getDate("expiry_date").toLocalDate(),
                    rs.getDouble("price"),
                    rs.getInt("quantity"),
                    rs.getDouble("gst")
            );
        }

        System.out.println("NOT FOUND : " + medicineName);

    } catch (Exception e) {

        e.printStackTrace();
    }

    return null;
}
}