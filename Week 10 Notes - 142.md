# Week 10 Lab

CSSSKL 142 - 3/8/24

## 🔑 Key Points 🔑

    1. Classes with multiple constructors
    2. Terms: private, public, static
    3. 2D Arrays
    4. File I/o


### FINAL REVIEW

## Make a `World` class

Let's create a class that represents a World at the start of a player's game.

1. Planning the class: The World class needs to have a height, a width, and a grid that is randomly generated with biomes.

2. Instance variables: Use an int for the width and height, and a 2D array to represent the world generation. It will be a randomly filled char array.

>🤔 Why am I making these `private`?

3. Constructors: From now on, you'll need to make at a minimum, a no-argument constructor, and one that does take in arguments. You can have more depending on your values (ex: a Person class that has a name and age, but you have a constructor to only set the age).

>🤔 What happens if you have a class and don't make any constructors?

4. Methods: Start with getters and setters (accessors and mutators). Then do static and non-static methods.

>🤔 When do you use a `static` method?

`initializeTertain()` method

* Use a double nested for loop to fill the 2D grid

✅ The outer loop goes row by row. It goes up until the height.

✅ The inner loop goes column by column. It goes up until the width.

* Random number review: I need a random number between 1-100, so I can set percentages. Say I want the world to be about 20% mountains, 70% water, and 10% plains.

### Using 2D array - generating

```java
public void initializeTerrain() {
    Random random = new Random();
    // Random: nextInt(high - low) + low
    for (int row = 0; row < height; row++) {
        for (int col = 0; col < width; col++) {
            int rand = random.nextInt(100) + 1;
            if (rand < 20) { // Mountains percent
                grid[row][col] = '^'; // Represents mountains
            } else if (rand < 90) { 
                grid[row][col] = '*'; // Representing water
            } else {
                grid[row][col] = '-'; // Represents plains
            }
        }
    }
}
```

### Using 2D array - changing a value

* I would like so that when the grid is printed out, the character's location is noted with a **X**
* To access a certain index:

```java
grid[row][column]
```
>🤔 What's your idea on how to solve this?

    Brainstorm; don't worry about if its slow or sounds complicated or wrong

>🤔 Which of these two options would you pick? Modify the grid in World so that it has an X at the correct spot, and print it? Or get the location of the player, make a new grid, and print it there?

* Think about this: You could have the **X** be saved on the 2D grid array, and then just print the grid.

* **Even better, store the x and y coordinates of the Player with the Player class, and then get those values when printing out the grid!**

* Keep in mind that it is better to have pieces of code as separated  and private as possible. Since the player's coordinates has to do with the player class, keep them there and let the World class get them using the accessor methods.



## File I/O

Let's save the map to a txt file, and then upload it again. But first go over some terms:

**BufferedReader** - For when you need to read large files and/or read characters.

**Scanner** - For when you need to read in tokens of strings separated by spaces, commas, etc.

They both have different methods.
Scanner is easier to understand. 

### Reading in a file to 2D array - use Scanner

```java
public void loadGrid(String filename) {
    try {
        Scanner scanner = new Scanner(new File(filename));
        int row = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (int col = 0; col < line.length(); col++) {
                grid[row][col] = line.charAt(col);
            }
            row++;
        }
        scanner.close(); // Don't forget!
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
        System.exit(0);
    }
    System.out.println("Your game is now loaded");
}
```

### Writing out to a text file - use PrintWriter and FileOutputStream

>🤔 When would you need to add `true` to the FileOutputStream? Hint: we used it when making the diary log. 
```java
public void saveGrid(String filename) {
    try {
        PrintWriter writer = new PrintWriter(new FileOutputStream(filename)); // not adding "true" because we want to overwrite

        for (char[] row : grid) {
            for (char block : row) {
                writer.print(block);
            }
            writer.println();
        }
        System.out.println("Your game has been saved to " + filename);
        writer.close();
    } catch (IOException e) {
        System.out.println("File not found!");
        System.exit(0);
    }
```

## Switch Statement

* Allow the user to select the item on their inventory bar with the number keys
* To keep it simple, I'll just use 1-3

```java
Scanner input = new Scanner(System.in);
System.out.println("Choose item 1 2 or 3");

int choice;

while (!input.hasNextInt()) {
    System.out.println("Make your selection");
    input.next();
}

choice = input.nextInt();

switch (choice) {
    case 1:
        System.out.println("pickaxe selected");
        break;
    case 2:
        System.out.println("sword selected");
        break;
    case 3:
        System.out.println("torches selected");
        break;
    default:
        System.out.println("other");
}
```

### Surround it with a do-while to make it keep looping

```java

Scanner input = new Scanner(System.in);
int choice;

do {
    System.out.println("Choose 1 2 or 3");
    
    while (!input.hasNextInt()) {
        System.out.println("Make your selection");
        input.next();
    }

    choice = input.nextInt();

    switch (choice) {
        case 1:
            System.out.println("choice 1");
            break;
        case 2:
            System.out.println("choice 2");
            break;
        case 3:
            System.out.println("choice 3");
            break;
        default:
            System.out.println("GAME OVER");
    }

} while (choice != 0);
```