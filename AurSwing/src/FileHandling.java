//Question N0: 7

import java.io.File;
import java.io.FileWriter;      //create and read
import java.io.IOException;     //exception
import java.io.FileNotFoundException;  //exception
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {

        //File Create Code
        /*
        File myfile = new File("data.txt");
        try{
            myfile.createNewFile();
            System.out.println("File Created ");
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //File Writing Code
        /*
        //File myfile = new File("data.txt");
        try{
            FileWriter fileWriter = new FileWriter("data.txt");
            fileWriter.write("Keep Learning\nBest Wishes\nHappy Coding");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //File Reading Code(assignment Q7 part)

        File myfile = new File("data.txt");
        try{
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line  = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
