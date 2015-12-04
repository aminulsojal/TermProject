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
            a = new Scanner(new File("hello.txt"));
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

