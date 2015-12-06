package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by User on 12/5/2015.
 */
public class signUpcontroller {

    @FXML public TextField firstName;
    @FXML public TextField lastNmae;
    @FXML public TextField userName;
    @FXML public PasswordField createAPassword;
    @FXML public PasswordField confirmPassword;
    @FXML public TextField instittionName;
    @FXML public Button signUp;
    private logInMain main;

    @FXML public void signUpOnAction(ActionEvent actionEvent) throws IOException {


       /*if ( (!firstName.getText().equals(null)) && (!lastNmae.getText().equals(null)) && (!userName.getText().equals(null)) &&
                (!createAPassword.getText().equals(null)) && (!confirmPassword.getText().equals(null)) &&
                (!instittionName.getText().equals(null)) && (createAPassword.getText().equals(confirmPassword.getText()))) {

                        main.showSelectPage();
                        writeToFile();
                    }
        else if(firstName.getText().equals(null) || lastNmae.getText().equals(null) || userName.getText().equals(null) ||
                createAPassword.getText().equals(null) || confirmPassword.getText().equals(null) || instittionName.getText().equals(null)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Sign Up Problem");
            alert.setHeaderText("Incomplete");
            alert.setContentText("Please complete all the conditions");
            alert.showAndWait();
            //createAPassword.setText(null);
            //confirmPassword.setText(null);
        }*/

        if(createAPassword.getText().equals(confirmPassword.getText())){
            main.showSelectPage();
            writeToFile();
            writeToFile1();

        }
        else if(createAPassword.getText() != confirmPassword.getText()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Password Problem");
            alert.setHeaderText("Password don't match.");
            alert.setContentText("Please reset password correctly");
            alert.showAndWait();
            createAPassword.setText(null);
            confirmPassword.setText(null);
        }





    }
    public void writeToFile(){
        String s = userName.getText()+createAPassword.getText();
        byte data[] = s.getBytes();
        String s1 = "\n";
        byte data1[] = s1.getBytes();
        Path p = Paths.get("./usersData.txt");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
            out.write(data1,0,data1.length);

        } catch (IOException x) {
            System.err.println(x);
        }
    }
    public void writeToFile1(){
        String s = "Name : " + firstName.getText() + " " + lastNmae.getText()+ "; " + "User Name : " + userName.getText() + "; "+
                "Password : " + createAPassword.getText() + "; " + "Institution Name : " + instittionName.getText();
        byte data[] = s.getBytes();
        String s1 = "\n";
        byte data1[] = s1.getBytes();

        Path p = Paths.get("./usersDataDetails.txt");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
            out.write(data1,0,data1.length);

        } catch (IOException x) {
            System.err.println(x);
        }
    }
    public void setMain(logInMain main){
        this.main = main;
    }
}
