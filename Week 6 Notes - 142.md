# Week 6 Lab

CSSSKL 142 - 2/9/24

## 🔑 Key Points 🔑

    1. File I/O 
    2. Try/Catch
    3. Finding min and max (my way)
 

## 📝 File I/O:

* There are multiple ways to accomplish reading and writing to files in Java. I will show you the methods used in the lab assignment. While you may use your preferred methods, please refer to your CSS 142 professor if they have specific methods you'll need to use.

### 🧰 Tools to keep on hand 🛠️

> ✅ **1. PrintWriter**
>
>* ⭐ Use: To write to a **new** file or overwrite an existing file
>* ⭐ Parameter: A file name, such as "MyFile.txt"
>
> ✅ **2. Scanner**
>
>* ⭐ Use: To take in input, can be from the user or a File
>* ⭐ Parameter: `System.in` for a user or a `File`
>
> ✅ **3. File**
>
>* ⭐ Use: For reading in a file that already exists
>* ⭐ `File myFile = new File(fileName);`
>* Then use `Scanner` to print out each line
>
> ✅ **4. FileOutputStream**
>
>* ⭐ Use: To add to an existing file
>* ⭐ Parameters: A file name, such as "MyFile.txt", and boolean
>* ⭐ `FileOutputStream fos = new FileOutputStream(myFile, true);`
>
> * **the `true` will ensure that you don't overwrite the file!**
>

### Scenario: Complete FileIODemo. Implement the following methods

1. `makeFile`: Creates a new file with user-inputted text
2. `readFile`: Reads a text file and prints it to the screen
3. `addToFile`: Adds more text to a file without deleting it

### 🔨 makeFile using `PrintWriter`

* Initialize a PrintWriter, along with a file name

* Use a try-catch block. In file I/O we use it to try to read in the file and catch an error in case the file does not exist.

  👉 This way you can handle the error instead of having the code crash.

* Use a `while` loop with the `Scanner.hasNextLine()` method

    ❓ Why not `Scanner.hasNext()`?
* Write each line to the PrintWriter

        writer.println(writtenText);

### 📖 readFile using `File` and `Scanner`

* Again, use a try-catch block. Catch a `FileNotFoundException`

* Initialize a `File` with the name of your file.

* Use a `while` loop to print out line by line.

### ➕ addToFile using `Printwriter` and `FileOutputStream`

* It's just like the makeFile method, but `PrintWriter` also needs a `FileOutputStream` passed into it

* `FileOutputStream` takes in a file name, and `true` if you don't want it to overwrite the file.

* The `while` loop is just like the makeFile method

## 🕸️ Try/Catch

* The purpose of the try/catch block is to catch errors so that you can do something about it if an error happens.
* You can prevent the program from crashing.
* Think of `try/catch` like an `if/else`. If the condition in the `if` statement is met, we proceed with what's in the block.
If not, we move onto the `else`.
* In `try/catch`, we try to do what's in the `try`, and if an exception, or error occurs, you can print an error message or call some other code.

## 🌟 Bonus: Max and Min

* Use `Double.MAX_VALUE` to keep track of the min value, instead of 0.0. `Double.MIN_VALUE` is used for the max value.

```java
public class MinMaxExample {
    public static void main(String[] args) {
        double min = Double.MAX_VALUE; // initialize to Double.MAX_VALEUE;
        double max = Double.MIN_VALUE; // initialize to Double.MIN_VALIUE;
        double[] temps = {10.0, 15.0, 20.0, 18.0, 12.0};
        
        for (double temp : temps) {
            System.out.println("current temp: " + temp);
            System.out.println("current min: " + min);
            System.out.println("current max: " + max);
            
            if (temp < min) { // Check for min
                min = temp;
                System.out.println("new min: " + min);
            }
            if (temp > max) { // Check for max
                max = temp;
                System.out.println("new max: " + max);
            }
            System.out.println();
        }
        System.out.println("Minimum temperature: " + min);
        System.out.println("Maximum temperature: " + max);
    }
}
```
