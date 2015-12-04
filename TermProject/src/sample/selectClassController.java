package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;


public class selectClassController {
    logInMain main;
    @FXML
    void ssc(ActionEvent actionEvent) {
        try {
            main.showSubjectPage();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void hsc(ActionEvent actionEvent) {

    }
    public void setMain(logInMain main){
        this.main = main;
    }
}
