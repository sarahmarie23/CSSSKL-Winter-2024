import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileOutputStream;

public class FileIODemoStarter {
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
       //addToFile(input, fileName);
       input.close();
    }
    public static void makeFile(Scanner input) {
        // Initialize a file name, text to write, and a PrintWriter
        String fileName = "";
        String writtenText = "";
    
        
        // Get the file name from the user
        System.out.print("Save file as:");
        fileName = input.next();
        
        // Prompt the user to type their message
        System.out.println("Start typing your message:");
        System.out.println("When you're done, type enter twice"); 
        
        // Use a Try-Catch block
       
            // Attempt to create the PrintWriter
               
            
            // Keep taking in user input as long as there's text being entered
            
                
                // stop when they type enter twice (typing an empty line)

                // Pass the user input into the PrintWriter
   
        
            // Print an error message inside the catch block
            
        
        
        // close the PrintWriter
       
    }
    public static void readFile(String fileName) {
        // Notice the similarities between readFile and makeFile!
        // Attempt to read from the file and display its contents
        
            // Initialize a File and a Scanner

            
            // Loop to print out the file contents
            System.out.println("Contents of the file:");


   
            // Print an error message inside the catch block
          
        
    }
    public static void addToFile(Scanner input, String fileName) { 
        // Use readFile to view the current file's contents
        readFile(fileName);
        // Initialize the text to write and a PrintWriter
        String textToAdd = "";
        
        
        // Prompt the user to type their message
        System.out.println("Type your additional message");
        System.out.println("When you're done, type enter twice");
        
        // Use a Try-Catch block
        
            // Attempt to create the PrintWriter
            
            
            // Keep taking in user input as long as there's text being entered
            
                
                // stop when they type enter twice (typing an empty line)

                // Pass the user input into the PrintWriter
                

            // Print an error message inside the catch block
       
        
        // close the PrintWriter
        
    }
}