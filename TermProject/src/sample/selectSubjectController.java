package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

/**
 * Created by User on 11/25/2015.
 */
public class selectSubjectController {
    logInMain main;
    readFile r = new readFile();
    chemistryScriptController che = new chemistryScriptController();

    public void chemistry(ActionEvent actionEvent) throws IOException {
        main.showChemistryQues();
//        che.getChemistryQuestionScript();


    }
    public void setMain(logInMain main){
        this.main = main;
    }
}
