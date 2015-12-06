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
            a = new Scanner(new File("chemistryAnswerScript.txt"));
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


