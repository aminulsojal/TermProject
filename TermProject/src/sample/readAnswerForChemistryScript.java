package sample;

import java.io.File;
import java.util.Scanner;

/**
 * Created by User on 12/5/2015.
 */
public class readAnswerForChemistryScript {
    private Scanner a;
    // private ArrayList<String> chemistryQues = new ArrayList<>();
    private String messageBox = "";
    char [] answer = new char[40];
    int [] intAnswer = new int[40];
    public  void openFile(){
        try {
            if(selectClassController.selectClass == 1 &&selectSubjectController.choice == 2)a = new Scanner(new File("chemistryAnswerScript.txt"));
            if(selectClassController.selectClass == 1 && selectSubjectController.choice == 1)a = new Scanner(new File("physicsAnswerScript.txt"));
            if(selectClassController.selectClass == 1 && selectSubjectController.choice == 3)a = new Scanner(new File("mathAnswerScript.txt"));
            if(selectClassController.selectClass == 1 && selectSubjectController.choice == 4)a = new Scanner(new File("hmathAnswerScript.txt"));
            if(selectClassController.selectClass == 2 &&selectSubjectController.choice == 2)a = new Scanner(new File("hscchemistryAnswerScript.txt"));
            if(selectClassController.selectClass == 2 && selectSubjectController.choice == 1)a = new Scanner(new File("hscphysicsAnswerScript.txt"));
            if(selectClassController.selectClass == 2 && selectSubjectController.choice == 3)a = new Scanner(new File("hscmathAnswerScript.txt"));
            if(selectClassController.selectClass == 2 && selectSubjectController.choice == 4)a = new Scanner(new File("hschmathAnswerScript.txt"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFileFromText(){
        try {
            while(a.hasNext() != equals(null)){
                String x = a.next();
               // messageBox = messageBox + " " +  x;
                answer = x.toCharArray();
                //messageBox = messageBox + "\n";
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
    public int [] chemistryAnswer(){
        for(int i = 0; i < 40; i++){
            int a = (int) answer[i] -96;
            intAnswer[i] = a;
        }
        return intAnswer;
    }

}



