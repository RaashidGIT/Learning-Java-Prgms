/*
Aim of the Program:
-------------------
To copy the contents of one file into another file using Java
FileInputStream and FileOutputStream classes.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Declare source and destination file paths
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try {
            // Create FileInputStream to read from source file
            FileInputStream fis = new FileInputStream(sourceFile);

            // Create FileOutputStream to write to destination file
            FileOutputStream fos = new FileOutputStream(destFile);

            int c;  // variable to store byte data
            while ((c = fis.read()) != -1) {  // Read byte by byte
                fos.write(c);  // Write into destination file
            }

            // Close both streams
            fis.close();
            fos.close();

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } 
        catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

/*
Simulated Output:
-----------------

Case 1: When source.txt contains
Hello World

After running the program:
destination.txt will contain
Hello World

Console Output:
File copied successfully from source.txt to destination.txt
*/
