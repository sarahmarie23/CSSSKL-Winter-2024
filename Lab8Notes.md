# Week 8 Lab

CSSSKL 143 - 02/23/24

## 🔑 Key Points 🔑

    1. Big-O Demo: Plotting it out
    2. Clean code: Using Constants and Refactoring  


* The purpose of "Big-O Notation" is to explain the time complexity of the code. Given an input size n, how many expressions of code will occurr?

* It might be a 1-to-1 ratio, so running the code with an array of 100 elements takes 100 expressions. Perhaps running 100 elements takes 300 expressions. Maybe the size doesn't even matter and a fixed number of epxressions will occurr.

```
❓ Ask: Why should we care about big-o notation?
```

* It allows us to easily compare algorithms and consider their runtime as n reaches infinity. How efficient is this algorithm?

* It provides an upper bound on time and space, meaning, no matter how many input elements you use, it will never go above this maximum time or amount of memory used.

## Big-O demo: Let's prove it

>**📝 List out all of the reference equations**

### Example: Test an algorithm to predict its Big-O notation

I would like to

   1. Run an algorithm several times
   2. Create a txt file of the number of elements and the runtimes
   3. Plot this in Excel and see how the runtime changes with respect to the number of elements

* I have a couple methods, starting with a recursive method, `factorial`

The OLD way
```java
public static long factorial(long n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```
**BigInteger** - a useful class for when you need *really* big numbers (`long` is only about 10^18)
```java
public static BigInteger factorial(BigInteger n) {
    if (n.equals(BigInteger.ZERO)) {
        return BigInteger.ONE;
    } else {
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
```
In theory it should run **O(n)**

#### Other things to note

1. **Using constants** - if you need to change something, its a lot easier to find the value at the top than in the middle of the code
2. **Refactoring** - restructuring code to clean it up and make improvements without changing the way it works. `BigODemo` could use some refactoring because of how repetitive the methods are! I already did some by removing all the methods to their own `Test` file. I would argue that the generating random arrays should be in their own class, along with the constants.



## The Big Picture: Big O gives you a standardized way to compare code and make improvements 

