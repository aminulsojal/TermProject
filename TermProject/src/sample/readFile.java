package sample;

/**
 * Created by User on 11/28/2015.
 */
import java.io.File;
import java.util.Scanner;


public class readFile {
    private Scanner a;
   // private ArrayList<String> chemistryQues = new ArrayList<>();
    private String messageBox = "";
    public  void openFile(){
        try {
            if(selectSubjectController.choice == 2)a = new Scanner(new File("chemistryQuestion.txt"));
            if(selectSubjectController.choice == 1)a = new Scanner(new File("physicsQuestion.txt"));
            if(selectSubjectController.choice == 3)a = new Scanner(new File("mathQuestion.txt"));
            if(selectSubjectController.choice == 4)a = new Scanner(new File("hmathQuestion.txt"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFileFromText(){
        try {
            while(a.hasNextLine() != equals(null)){
                String x = a.nextLine();
                messageBox = messageBox + " " +  x;
                messageBox = messageBox + "\n";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println();
    }
    public void closeFile(){
        try{
            a.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public String getques(){
        return messageBox;
    }

}

