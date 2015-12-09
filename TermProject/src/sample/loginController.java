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
    public static String s1 = "";
    public static int selectClass ;



    @FXML
    public void loginOnAction (ActionEvent actionEvent) {
        readFileForUsersData r = new readFileForUsersData();
        r.openFile();
        r.readFileFromText();
        r.closeFile();
        String[] s = r.getUserData();
        s1 = textField.getText();
       // String validUserName = "admin";
        //String validPassword = "123";
        String userName = textField.getText()+password.getText()+"SSC";
        String userName1 = textField.getText()+password.getText()+"HSC";
        for(int i = 0; i < s.length;i++) {
            if (userName.equals(s[i])) {
                try {
                    //main.showSelectPage();
                    main.showSubjectPage();
                    k = 1;
                    selectClass = 1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (userName1.equals(s[i])) {
                try {
                    //main.showSelectPage();
                    main.showSubjectPage();
                    k = 1;
                    selectClass = 2;
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
    public String getText(){
        return textField.getText();
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
