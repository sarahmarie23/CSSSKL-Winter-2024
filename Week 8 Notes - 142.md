# Week 8 Lab

CSSSKL 142 - 2/23/24

## 🔑 Key Points 🔑

    1. Array vs ArrayList
    2. 2D Arrays
    3. Array fun facts
    4. Ragged/Jagged arrays


### You've had some practice with arrays, let's first talk about how they relate to ArrayLists

## 📦 Array vs ArrayList? - Make a table to compare them

✅ Arrays and ArrayLists are both data structures.

✅ They both hold a collection of the same type.

✅ They both are accessible by index.

✅ ArrayLists are **dynamic**. They can grow and shrink.

✅ You don't need to declare the size when you initialize ArrayLists.

✅ ArrayLists have their own set of methods [add(), remove(), size(), get(), indexOf()].

✅ Arrays use .length to get the length

✅ Arrays.sort(arrName), Arrays.toString(arrName)

✅ ArrayLists hold objects, while arrays can hold objects or primitives

## 🏠 2D arrays

* An array holds a group of elements, ordered by index. But what if we wanted to hold a group of *arrays*? Now we would have a 2D array. And yes, you can nest them even further.

### Common Examples - Why use 2D arrays?

    1. Matrix operations
    2. Displaying a game grid (tic-tac-toe, chess, battleship)
    3. Displaying a 2D map or image (top-down video game, screen pixels)
    4. Traversing a maze

### Initializing 2D arrays

* **Method 1**: With elements declared

    ```java
    String[][] playlists = {
        {"s1", "s2", "s3"},
        {"s4", "s5", "s6"},
    };
    ```

* **Method 2**: Without elements

    ```
    String[][] playlists = new String[2][3];
    ```
* The first value in `String[2][3]` refers to the number of **rows**, or number of arrays.
* The second value refers to the number of **columns**, or number of elements in each array.
* In this example, we have 2 sets of playlists with 3 songs in each.


### Connection to for loops

* When we studied double nested for loops, like for drawing ascii art, we talked about how the outside loop goes row-by-row and the inside loop goes char-by-char.
* When you are going through a 2D array, you also use a double nested for loop. The outer loop goes row-by-row, while the inner goes column by column.

    ```java
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(array[i][j]);
            }
        }
    ```
✅ How do you figure out what value to use for `rows` and `columns`?
* With a regular array, you use `arrayName.length`.
* To get the number of rows for the outer loop, think "How many arrays are in this array?" So you can just use `arrayName.length`  
* The inner loop is a little different. You need to know how many elements are in each array. So you need to get the length of a single array. You can do this by `arrayName[0].length`

## 🚀 Array fun facts
* Arrays in Java are passed ***by reference***. This means that you can pass an array into a method, change it, and you don't have to return it back for the changes to be saved!

```java
public class ArrayReferenceExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Before modification
        System.out.println("Before modification:");
        printArray(array);
        
        // Modifying the array inside a method
        modifyArray(array);
        
        // After modification
        System.out.println("\nAfter modification:");
        printArray(array);
    }
    
    // Method to modify the array
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Doubling each element
        }
    }
    
    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```
📝 **By default, int elements are initialized to 0**

📝 **By default, String elements are initialized to `null`**

📝 **By default, boolean elements are initialized to `false`** 


* `String[] args` is a 1D array!

```java
public static void main(String[] args) {...}
```
* We use an IDE to run Java programs, but you can run a program from the command line and pass in *arguemnts* for args, and the main method can access those arguments like you would in an array anywhere else. `args[0]` for example would get you the first argument passed in.

## ⛰️ Ragged/Jagged 2D array

* An array of arrays, where the inner arrays (rows) can be different lengths

* Example: Read in a text file, and parse each line into an array of Strings for each word of the line.

* Task: Create a text file of some song lyrics. Perform these tasks:

####
    1. Figure out the length of the longest line
    2. How many words are in the whole song
    3. Print out the lyrics

### Steps

* Count how many lines there are in the file
* Create a 2D array with that many lines
* For each line of the file
  * Read in each line using Scanner
  * Split each line into a String array
  * Put this array into the 2D array


#### When is this used in real life?

>**1. Sentiment analysis:** take Amazon reviews or Twitter/X posts and analyze keywords to see if they are positive, negative, or neutral.
>
>**2. Speech-to-text:** spoken words are broken down so that they can be converted and displayed on the screen.
>
>**3. Siri/Alexa/Hey Google:** spoken words are tokenized so that key words or phrases can be understood.
