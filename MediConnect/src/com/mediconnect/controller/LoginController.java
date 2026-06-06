package com.mediconnect.controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.mediconnect.dao.UserDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
private void handleLogin(ActionEvent event) throws Exception {

    String username = txtUsername.getText();
    String password = txtPassword.getText();

    UserDAO userDAO = new UserDAO();

    boolean validUser = userDAO.validateLogin(username, password);

    if (validUser) {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/mediconnect/view/dashboard.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) txtUsername.getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.setTitle("MediConnect Dashboard");
        stage.show();

    } else {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Failed");
        alert.setHeaderText(null);
        alert.setContentText("Invalid Username or Password!");
        alert.showAndWait();
    }
}

    @FXML
    private void openRegisterScreen(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Register");
        alert.setHeaderText(null);
        alert.setContentText("Register Screen Coming Soon");
        alert.showAndWait();
    }
}