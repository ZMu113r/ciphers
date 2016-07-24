/*
Hill Cipher 
CIS 3360 - Spring 2016
Author: Zach Muller
 */
package hillcipher;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HillCipher {

    public static void main(String[] args) {
            //Declare PT array to hold text file
            String [] PT = new String[10000]; 
        try{
            //Declare File
            File file = new File(args[0]);
            
            //Scan in the file
            Scanner sc = new Scanner(new FileInputStream(file));

            while(sc.hasNextLine()){
                String ptSentence = sc.nextLine();
                if (ptSentence.trim().length() > 0){
                    PT = ptSentence.split(" ");
                    PT = ptSentence.split(".");
                    System.out.println(PT);
                }
            }
        }
        catch(FileNotFoundException e){
                e.printStackTrace();
               
            }    


    }
    
}
