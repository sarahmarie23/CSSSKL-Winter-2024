# Week 2 Lab

CSSSKL 142 - 1/12/24

## 🔑 Key Points 🔑

    1. Method Recipe
    2. Scanner Class
    3. Math Class
 

## 👨‍🍳 Method Recipe

* To help you write methods, think about these steps:

> ✅ 1. Signature
>
>* 📝 Write the method name, expected types, and return type
>* ⭐ Choose a meaningful name and use lowerCamelCase
>
> ✅ 2. Purpose
>
>* 📝 What does the method expect?
>* 📝 What does it return?
>
> ✅ 3. Method header
> 
>```java
>public static [RETURN TYPE] [NAME]([PARAMETERS]) {
>    //
>}
>```
> ✅  4. Finish off the method body
>
>* 📝 Write the pseudocode
>* 📝 Translate into Java
>

### Practice designing a method for the scenario:

You have a pizzeria that serves the best pizza in town. When a customer orders a pizza online, the total cost for the pizza will be displayed on the screen. Write a method that takes the size of pizza (small, medium, large), number of toppings, whether it was deep dish or not (because deep dish is an extra charge) and returns the cost of this pizza.

* For this example, we aren't worrying about how to calculate the cost (not yet anyways!)

### Example method design

* **1. Signature**:

> pizzaCost: String, int, boolean -> double

* **2. Purpose**:

> **Expects** the size of pizza, number of toppings, whether it was deep dish or not
>
> **Returns** the cost of the pizza

* **3. Method header**:


```java
public static double pizzaCost(String size, int numToppings, boolean deepDish) {

}
```
* **4. Finish it**
> We will get there!

### Some definitions to remember

> 📝 **Method** - a block of code that performs a specific task or function
>
> 📝 **Type** - the classification of data (String, int, double, boolean, char, etc.)
> 
> 📝 **Parameters** - the list of variables your method expects. They go between the ()
>
> 📝 **Argument** - the actual values that are passed into the method when it is called

## 🏫 Scanner Class

* Remember that we use the `Scanner` class to take in user input, so that we can do something with that data.

> 📝 `import java.util.Scanner;` add this at the very top of the file
>
> 📝 `Scanner theScannerName = new Scanner(System.in);` create a `Scanner` object
>
> 📝 `nextLine()` method to read in a `String` value
>
> 📝 `nextInt()` method to read in an `int` value
>
> 📝 `next()` method to read in a single chunk of input
>
> 📝 `close()` method to close the `Scanner`
>
>>⭐This ensures that the program can properly clean-up memory and use it for other tasks. It's like returning a borrowed book to the library when you're done so the next person can check it out.

### Add on to the example we started earlier

* ✅ In the main method, add a `Scanner` that asks the user for their pizza size, number of toppings, and if they would like deep dish or not.
* ✅ Requirements: Print the questions one at a time. First ask for pizza size, the user inputs their response. Then ask for topping amount.
* ✅ For the deep dish option, the user should enter `true` or `false` (we will learn a better way soon!)
* ✅ Don't forget to add a `close()` method!

### Possible solution
```java
Scanner input = new Scanner(System.in);

System.out.println("Enter your pizza size:");
String pizzaSize = input.next();

System.out.println("Enter the number of toppings:");
int toppingCount = input.nextInt();

System.out.println("Do you want deep dish? (true/false):");
boolean deepDish = input.nextBoolean();

System.out.println("Any special requests?");
String specialRequests = input.nextLine();

input.close();  // Don't forget to close the Scanner
```

⚠️ Be careful with `next()` vs `nextLine()`. `next()` only reads in a single chunk of text at a time (this is called *tokenization*). `nextLine()` will read in the entire line, including whitespace.

⚠️ How do you know if you should use `next()` or `nextLine()`?
> Use `next()` when
>* You are reading in input that is separated by spaces and you need to separate the parts into different variables.
>* You are reading in a single chunk
```java
Scanner input = new Scanner(System.in);

System.out.println("Enter your full name");
String fname = input.next();
String mname = input.next();
String lname = input.next();
System.out.println("your name is " + fname + " " + mname + " " + lname);
```

>
> Use `nextLine()` when
>* You are reading in input that contains spaces
>* You need to read in an entire line of data, not just a single word
```java
Scanner input = new Scanner(System.in);

System.out.println("Any special requests on your pizza order?");
String request = input.nextLine();

System.out.println("Your request was: " + request);
```

## 📐 Math Class 

* The Math class has many useful methods
* It comes with Java, so you don't need to import the library
* `Math.min(num1, num2)` returns the smaller number
* `Math.max(num1, num2)` returns the larger number
> Notice how `min(num1, num2)` looks like a method call because it is one!

## Bonus

⭐Float vs Double - how big can you go?

```java
double dub = Double.MAX_VALUE;
float flt = Float.MAX_VALUE;

System.out.println(Math.max(dub, flt));
```

⭐Using `printf`
```java
String favFood = "Pizza";
System.out.printf("My favorite food is %s", favFood);

double total = 23.9089;
System.out.printf("Your total with tax is $%.2f", total);
``` 