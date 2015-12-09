package sample;

import java.io.File;
import java.util.Scanner;

/**
 * Created by User on 12/8/2015.
 */
public class readFileForProfileData {
    private Scanner a;
    // private ArrayList<String> chemistryQues = new ArrayList<>();
    private String messageBox = "";
    public  void openFile(){
        try {
            String s = "./" + loginController.s1+".txt";
                a = new Scanner(new File(s));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFileFromText(){
        try {
            while(a.hasNextLine() != equals(null)){
                String x = a.nextLine();
                messageBox = messageBox +  x +"\n";
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
}
