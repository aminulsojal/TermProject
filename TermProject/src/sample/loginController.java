package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;


import javafx.scene.control.TextField;
import java.io.IOException;




public class loginController {
    logInMain main;
    @FXML
    TextField textField;
    @FXML
    PasswordField password;



    @FXML
    public void loginOnAction (ActionEvent actionEvent) {
        try {
            main.showSelectPage();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public void setMain (logInMain main){
        this.main = main;
    }

    @FXML
    public void resetOnAction(ActionEvent actionEvent) {
        textField.setText(null);
        password.setText(null);

    }
}
