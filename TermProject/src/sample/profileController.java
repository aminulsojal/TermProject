package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Created by User on 12/8/2015.
 */
public class profileController {
    @FXML public TextArea userName;
    @FXML public TextArea profileDetails;
    public static int sub = 0;
    readFileForProfileData r = new readFileForProfileData();
    private logInMain main;
    void setMain(logInMain main){
        this.main = main;
        String s = "UserName : " + loginController.s1;
            r.openFile();
            r.readFileFromText();
            profileDetails.setText(r.getques());
            profileDetails.setEditable(false);
            profileDetails.setStyle("-fx-background-color: rgba(53,89,119,0.4); -fx-text-fill: green;");
            userName.setText(s);
            userName.setEditable(false);
            r.closeFile();
        }

    public void gotoMainMenuOnAction(ActionEvent actionEvent) throws IOException {
        main.showSubjectPage();
        sub = 1;
        chemistryScriptController.count = 0;
    }
}



