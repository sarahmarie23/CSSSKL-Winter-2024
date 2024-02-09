# Week 6 Lab

CSSSKL 143 - 02/09/24

## 🔑 Key Points 🔑

    1. Recursion: powerOfTwo problem
    2. Pseudocode: How to think it through  
    3. Bonus: Rubber Duck


## 📃 Pseudocode

* I've talked about planning and pseudocode throughout our times together. Writing out pseudocode is another tool for your coding toolbox which you can use to help solve problems.

* These are my steps. **Please consult your various CSS 143 professors for their required steps**

   1. Understand the problem
   2. Understand the constraints
   3. Make a plan, in plain English. Use test cases.

* Now we can follow the steps of recursion and write some pseudocode and solve the problem.

### ✏️ Going through the problem powerOfTwo (LC 231)

#### Read it first, then try the rest

1. **Understand the problem**
    * Make sure all the terms make sense.
    * What does it mean to be a "power of 2"?
2. **Understand the constraints**
    * What are the range of numbers? Can they be doubles?
    * Are negatives, decimals, 0 included?
    * Are empty strings allowed?
3. **Make a plan, in plain English. Use test cases.**
    * 1 returns true, 16 returns true, 3 returns false
        > What does 0 return? false. How about -1? false.
    * Next, move on to writing pseudocode

## 🔁 Recursion

### Pseudocode for recursion is a bit unique, but here are some steps you can follow

1. **Identify Base Cases**

    ⭐ In recursion you usually work your way down to the **simplest answer**, often an answer of 0 or 1, or an empty string.

    * Determine the simplest cases that can be solved directly without recursion.
    * These are typically the stopping conditions for the recursion.

    ❓ Anything that pops out at you?

    ⭐ Notice that if the number is <= 0, it will reutrn false

2. **Define Recursive Cases**
    * Identify how to break down the problem into smaller, similar subproblems. This is the recursive step.

    📝 Consider what it means to be a power of two:

        1, 2, 4, 8, 16...
    ❓ Do you notice a pattern? Multiplying by 2 to get to the next number.

    ⭐ So if we want to work **down** to 1, we would divide by 2.

    ⭐ We can **only** get to 1 if the number divides evenly by 2.

3. **Implement Recursion**
    * Write the recursive function using the identified base cases and recursive cases.

    ⭐ Remember, in recursion you usually work your way down to the **simplest answer**, often an answer of 0 or 1, or an empty string. Figure out how you'd get to that simplest, base case.

4. **Test the Function**
    * Ensure that the recursive function works correctly by testing it with various inputs, including edge cases.

5. **Optimize (if necessary)**
    * Evaluate the efficiency of the recursive solution and consider optimization techniques.
    * You'll need to do this if you get a "Time Limit Exceeded" on Leetcode.
    * Remember that you might have to use a non-recursive solution, as recursion can be very time consuming.

### 📝After solving the problem, demo on the board the call stack for n = 16

```java
public boolean isPowerOfTwo(int n) {
    if (n <= 0) {
        return false;
    }

    if (n == 1) {
        return true;
    }

    if (n % 2 == 0) {
        return isPowerOfTwo(n / 2);
    }

    return false;
}
```

## 🦆 Rubber Duck

* "Rubber Ducking" is a debugging technique where you speak aloud the problem you are trying to solve. Oftentimes, you'll discover a solution, or something to try, just because you were talking about it and explaining it.

* The rubber duck is just a tradition. You can use anything, or even describe it to a friend. Being able to speak about a problem to someone who doesn't know coding can be especially beneficial. If you can explain it, you have a much stronger understanding of the topic.

* The Pragmatic Programmer pg 94

        "A very simple but particularly useful technique for finding the cause of a problem is simply to explain it to someone else. The other person should look over your shoulder at the screen, and nod his or her head constantly (like a rubber duck bobbing up and down in a bathtub). They do not need to say a word; the simple act of explaining, step by step, what the code is supposed to do often causes the problem to leap off the screen and announce itself."

### Once you solve powerOfTwo, try solving powerOfThree (326) and powerOfFour (342).