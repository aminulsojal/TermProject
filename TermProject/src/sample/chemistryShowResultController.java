package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.AbstractCollection;

/**
 * Created by User on 12/5/2015.
 */
public class chemistryShowResultController {
    @FXML
    public TextField showAnswer;
    private logInMain main;
    public void setMain(logInMain main) {
        this.main = main;
        String s = "" + chemistryScriptController.count;
        showAnswer.setText(s);
    }

}
