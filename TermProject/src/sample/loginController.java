package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;


import javafx.scene.control.TextField;
import java.io.IOException;




public class loginController {
   @FXML  public Button signUp;
    private logInMain main;
    @FXML
    TextField textField;
    @FXML
    PasswordField password;
    int k = 0;



    @FXML
    public void loginOnAction (ActionEvent actionEvent) {
        readFileForUsersData r = new readFileForUsersData();
        r.openFile();
        r.readFileFromText();
        r.closeFile();
        String[] s = r.getUserData();
       // String validUserName = "admin";
        //String validPassword = "123";
        String userName = textField.getText()+password.getText();
        for(int i = 0; i < s.length;i++) {
            if (userName.equals(s[i])) {
                // successful login
                try {
                    main.showSelectPage();
                    k = 1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if(k == 0) {
            // failed login
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incorrect Credentials");
            alert.setHeaderText("Incorrect Credentials");
            alert.setContentText("The username and password you provided is not correct.");
            alert.showAndWait();
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

    @FXML public void signUPOnAction(ActionEvent actionEvent) throws IOException {
        main.showSignUpPage();
    }
}
