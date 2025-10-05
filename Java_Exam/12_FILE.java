/*
Aim: To copy the contents of one file to another using JavaFileInputStream and FileOutputStream classes.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";       
        String destinationFile = "destination.txt"; 
        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
