package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class logInMain extends Application {
    Stage stage;
    //public static chemistryScriptController che;

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        showLogInPage();


    }

    public void showLogInPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        //Image image1 = new Image("E:\\TermProject\\cover.png", true);
        //image1.isBackgroundLoading();

        Parent root = loader.load();
        loginController loginController1 = loader.getController();
        loginController1.setMain(this);


        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/color.css");
        //scene.getStylesheets().add(getClass().getResource("E:\\TermProject\\color.css").toExternalForm());
        stage.setScene(scene);
        //stage.setFullScreen(true);
        stage.setTitle("SIGN UP");
        stage.show();
    }
    public void showSelectPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectClass.fxml"));


        Parent root = loader.load();
        selectClassController loginController1 = loader.getController();
        loginController1.setMain(this);


        Scene scene = new Scene(root);

        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Select");
        stage.show();
    }
    public void showSubjectPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectSubject.fxml"));




        Parent root = loader.load();
        selectSubjectController loginController1 = loader.getController();
        loginController1.setMain(this);


        Scene scene = new Scene(root);
        //scene.getStylesheets().add("E:\\TermProject\\color.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Select Subject");
        stage.show();
    }
    public void showChemistryQues() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("chemistryScript.fxml"));
        //Image image1 = new Image("E:\\TermProject\\cover.png", true);
        //image1.isBackgroundLoading();

        Parent root = loader.load();
        chemistryScriptController loginController1 = loader.getController();
        loginController1.setChemistryQuestionScript();
        loginController1.setAnswerScript();
        loginController1.setMain(this);




        Scene scene = new Scene(root);
        //scene.getStylesheets().add("sample/color.css");
        // scene.getStylesheets().add("sample/color.css");
        //scene.getStylesheets().add(getClass().getResource("E:\\TermProject\\color.css").toExternalForm());
        root.setStyle("-fx-background-color:#8fbc8f; -fx-text-fill: green;");;
        stage.setScene(scene);
        stage.setTitle("Question");
        //stage.setMaximized(true);

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
