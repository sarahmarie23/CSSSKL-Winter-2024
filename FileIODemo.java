import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileOutputStream;

public class FileIODemo {
    public static void main(String[] args) {
        /*
        This method will have the following functions:
            - makeFile: Make and save a new text file
            - readFile: Read in a text file
            - addToFile: Add more text to a file
        */
       Scanner input = new Scanner(System.in);
       //makeFile(input);
       String fileName = "test.txt";
       //readFile(fileName);
       addToFile(input, fileName);
       input.close();
    }
    public static void makeFile(Scanner input) {
        // Initialize a file name, text to write, and a PrintWriter
        String fileName = "";
        String writtenText = "";
        PrintWriter writer = null;
        
        // Get the file name from the user
        System.out.print("Save file as:");
        fileName = input.nextLine();
        
        // Prompt the user to type their message
        System.out.println("Start typing your message:");
        System.out.println("When you're done, type enter twice"); 
        
        // Use a Try-Catch block
        try {
            // Attempt to create the PrintWriter
            writer = new PrintWriter(fileName);    
            
            // Keep taking in user input as long as there's text being entered
            while (input.hasNextLine()) {
                writtenText = input.nextLine();
                
                // stop when they type enter twice (typing an empty line)
                if (writtenText.isEmpty()) {
                    break;
                }
                // Pass the user input into the PrintWriter
                writer.println(writtenText);
            }
        } catch (IOException e) {
            // Print an error message inside the catch block
            System.out.println("ERROR");
        }
        
        // close the PrintWriter
        writer.close();
    }
    public static void readFile(String fileName) {
        // Notice the similarities between readFile and makeFile!
        // Attempt to read from the file and display its contents
        try {
            File file = new File(fileName);
            Scanner input = new Scanner(file);

            System.out.println("Contents of the file:");
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found or could not be opened.");
        }
    }
    public static void addToFile(Scanner input, String fileName) { 
        // Use readFile to view the current file's contents
        readFile(fileName);
        // Initialize the text to write and a PrintWriter
        String textToAdd = "";
        PrintWriter writer = null;
        
        // Prompt the user to type their message
        System.out.println("Type your additional message");
        System.out.println("When you're done, type enter twice");
        
        // Use a Try-Catch block
        try {
            // Attempt to create the PrintWriter
            writer = new PrintWriter(new FileOutputStream(fileName, true));  // DIFFERENT HERE when appending
            
            // Keep taking in user input as long as there's text being entered
            while (input.hasNextLine()) {
                textToAdd = input.nextLine();
                
                // stop when they type enter twice (typing an empty line)
                if (textToAdd.isEmpty()) {
                    break;
                }
                // Pass the user input into the PrintWriter
                writer.println(textToAdd);
            }
        } catch (FileNotFoundException e) {
            // Print an error message inside the catch block
            System.out.println("File not found or could not be opened.");
        }
        
        // close the PrintWriter
        writer.close();
    }
}
