# Week 7 Lab

CSSSKL 142 - 2/16/24

## 🔑 Key Points 🔑

    1. String methods 
    2. String problem techniques
    3. Work through a coding problem

### 🚀 Today's goal

> **To become familiar some string methods and apply how you'd use them to solve some coding problems.**

## 🛠️ String methods

* Strings are objects in Java, and they come with useful methods. We've worked with `Scanner` objects that use the `nextLine()` or `next()` methods. We have used `Random` objects that have the `nextInt()` method. These methods are built in, and the String class comes with several built-in methods.

### 🧰 Tools to keep on hand 🛠️

>
> ✅ **1. equals()**
>
>* ⭐ Use: Check if two strings are equal to each other

```java
String str1 = "Hello";
String str2 = "World";
str1.equals(str2); // returns false
```
>
> ✅ **2. substring()**
>
>* ⭐ Use: Returns a portion of a string. The first number is the starting index (inclusive) and the second number is the end index (exclusive).
>* ⚠️ It won't work if the index is out of bounds. It will throw an exception (error).
>* 👉 If you use one parameter, it returns the substring from that index to the end of the string.

```java
String myString = "Hello World";
String sub = myString.substring(1, 5); // returns "ello"
String sub2 = myString.substring(6); // returns "World"
```
>
> ✅ **3. charAt()**
>
>* ⭐ Use: Returns the char at a specific index
>* ⚠️ It won't work if the index is out of bounds. It will throw an exception (error).

```java 
String myString = "Hello World";
myString.charAt(4); // Returns 'o' 
```
>
> ✅ **4. indexOf()/lastIndexOf()**
>
>* ⭐ Use: Get the first/last index of a character in a string
>* 👉 You can even check the index of a substring
>* 👉 You can even check the index of a substring starting from a given index
>* 👉 Returns -1 if the character/substring isn't in the string

```java
String myString = "Hello World";
System.out.println(myString.indexOf("llo")); // Returns 2
System.out.println(myString.lastIndexOf('o')); // Returns 7
System.out.println(myString.indexOf('o', 5)); // Returns 7
System.out.println(myString.indexOf('o', 8)); // Returns -1
```
>
> ✅ **5. toUpperCase()/toLowerCase()**
>
>* ⭐ Use: Changes a string to all capitals or all lowercase

```java
String myString = "Hello World";
myString = myString.toUpperCase(); // Returns "HELLO WORLD"
```
>
> ✅ **6. trim()**
>
>* ⭐ Use: Remove whitespaces at the beginning or end of a string

```java
String myString = "   Hello World   ";
myString = myString.trim(); // Returns myString = "Hello World"
```

## 🧩 Java String problem techniques

* Having the tools is great, but it would be nice to know some techniques that will improve your problem-solving skills

### 🌟 Going through each character of a string

* Using a for loop and `charAt()`

```java
String myString = "Hello World";

for (int i = 0; i < myString.length(); i++) {
    System.out.println(myString.charAt(i)); // Iterates over each character
}
```

* Using a for each loop and `toCharArray()`

```java
String myString = "Hello World";

for(char c : myString.toCharArray()) {
    System.out.println(c); // Iterates over each character
}
```

### 🪓 Splitting a string into an array

* Our class hasn't done arrays yet, but we will next week
* You can split by any sequence, doesn't have to be a single space

```java
String snacks  = "juice, ice cream, chips, bananas";
String[] shopping = snacks.split(", ");
// Returns an array of ["juice", "ice cream", "chips", "bananas"]
```

>* 👉 Notice how if I split by ", " instead of " " it will keep 'ice cream' together as one string.

### 🧱 StringBuilder

* Instead of concatenating strings together with '+', use a `StringBuilder` as a convenient way to keep adding on to a string
* 🌟`StringBuilder` is more efficient than concatenating strings because it doesn't initialize a new string every time a string is added on.

```java
StringBuilder fullName = new StringBuilder();
String first = "Holly";
String middle = "the";
String last = "Husky";

fullName.append(first);
fullName.append(" ").append(middle);
fullName.append(" ").append(last);
fullName.append(" is the UW mascot");

System.out.println(fullName.toString());
```

>* 👉 Notice that you need to convert it to a string to be able to print it out.
>* 👉 Notice that you can chain multiple methods together!

## Problem solving practice

### Each table will get a different scenario and work as a group to decide which methods to use to try and solve it. If not enough time, use one problem and have them break into groups to try to solve it.

* **Problem 1: Anagram Checker** - Given two strings, determine if they are anagrams of each other. Anagrams have the same characters, but in different orders. For example, "listen" and "silent" would return true, but "java" and "code" would return false.

* **Problem 2: String Rotation** - Given a string and an index, rotate the string that many spaces. For example, the string "todayisfriday" rotates 3 spaces would be "ayisfridaytod".

* **Problem 3: Vowel Counter** - Given a string, count how many vowels (A, E, I, O, U) are in the string. Ignore case. In other words, consider both capital and lowercase letters. For example, "I can't wait to go to DISNEYLAND!" has 10 vowels. 