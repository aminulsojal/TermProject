package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

/**
 * Created by User on 11/25/2015.
 */
public class selectSubjectController {
    logInMain main;
    public static int choice;
    readFile r = new readFile();
    chemistryScriptController che = new chemistryScriptController();

    public void chemistry(ActionEvent actionEvent) throws IOException {
        choice = 2;
        main.showChemistryQues();
//        che.getChemistryQuestionScript();


    }
    public void setMain(logInMain main){
        this.main = main;
    }

    public void physicsOnAction(ActionEvent actionEvent) throws IOException {
        choice = 1;
        main.showChemistryQues();

    }


    public void mathOnAction(ActionEvent actionEvent) throws IOException {
        choice = 3;
        main.showChemistryQues();
    }

    public void hmathOnAction(ActionEvent actionEvent) throws IOException {
        choice = 4;
        main.showChemistryQues();
    }

    public void profileOnAction(ActionEvent actionEvent) throws IOException {
        main.profileDetails();
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        main.showLogInPage();
    }
}
