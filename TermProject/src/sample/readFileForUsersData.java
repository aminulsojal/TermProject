package sample;

import java.io.File;
import java.util.Scanner;

/**
 * Created by User on 12/5/2015.
 */
public class readFileForUsersData {
    private Scanner a;
    // private ArrayList<String> chemistryQues = new ArrayList<>();
    private String messageBox[] = new String[100];
    int i = 0;
    public  void openFile(){
        try {
            a = new Scanner(new File("usersData.txt"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFileFromText(){
        try {
            while(a.hasNextLine() != equals(null)){
                String x = a.nextLine();
                messageBox[i] = x;
                i++;
               // messageBox = messageBox + " " +  x;
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
    public String [] getUserData(){
        return messageBox;
    }

}
