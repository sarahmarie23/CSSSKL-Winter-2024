# Week 7 Lab

CSSSKL 143 - 02/16/24

## 🔑 Key Points 🔑

    1. LinkedList: Fast and Slow Pointer
    2. Stack: Stack-based Approach   
    3. Queue: Priority Queue

* Since you've had a chance to practice linked lists, stacks and queues, I thougth I'd show you some techniques that you could use for solving problems involving these data structures.

* I will be using my own ListNode class for demoing linked list, because you'll most likely need to solve linked list problems that way. I will use the built-in Stack class. For queue, because it is an interface, I will show you an implementation of it.

## 🏃 Technique #1: Fast and Slow Pointer on Linked List

>**📝 Draw it out to help with understanding**

* Use two pointers to traverse the linked list. One moves one node at a time (slow), the other moves two nodes at a time (fast).

* Some uses for this

   1. Finding the middle of the linked list
   2. Finding the Nth node from the end of the linked list
   3. Detecting and removing cycles

### 💻 Find the middle of the linked list

### How it works -> **📝 Draw it out to help with understanding**

>✔️ The fast pointer moves two steps for every one step of the slow pointer. When it reaches the end, the slow pointer will be at the middle node.

    ❓ Ask: Why do I need to check if its null first?

```java
public static int findMiddleNode(ListNode head) {
    // Check if its null first!
    if (head == null) {
        return -1;
    }

    // Both pointers start at the beginning
    ListNode slow = head;
    ListNode fast = head;

    // While loop until fast pointer is not at the end, advance both pointers
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Return the value of the slow pointer
    return slow.val;
}
```

## 🥞 Technique #2: "Stack-based Approach"

>**📝 Draw it out to help with understanding**

* Iterate through objects, pushing them onto a stack and popping them off when a certain condition is met. If you're left with an empty stack when you get to the end, then you have a balanced structure.

* Some uses for this

    1. Checking for valid pairs of parentheses
    2. Reversing a string to check for a palindrome
    3. Keeping track of browser history

### 💻 Check if a string has valid parentheses

#### How it works -> **📝 Draw it out to help with understanding**

>✔️ Iterate over a string character-by-character.

* If you have an opening parentheses ( { [ then push it to the stack.
* Otherwise, if the stack is empty, then you need to return false because there was no opening parenthesis to match it.
* If you have a closing parentheses ) } ] then pop from the stack.
Check if the popped parenthesis is a match or not, because if its not, you can return false.
* If the stack is empty after going through the whole string, then the string had valid parentheses.

```java
public static boolean isValidParentheses(String s) {
    // Initialize a Stack
    Stack<Character> stack = new Stack<>();

    // Loop over the string
    for (char c : s.toCharArray()) {
        // Push to the stack if its an opening parenthesis
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        // Else its a closing parenthesis
        } else { 
            // Before popping, check if the stack is empty
            if (stack.isEmpty()) {
                return false;
            }

            // Now check if the top of the stack is valid, and return false if its not valid
            char top = stack.pop();
            if ((c == ')' && top != '(') || 
                (c == '}' && top != '{') || 
                (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    // Return if stack is empty or not
    return stack.isEmpty();
}
```

## 🎢 Technique #3: Priority Queue Implementation

* Queue in Java is an **interface**. It's just a list of methods that explain a way to process elements in FIFO oder. This means we need to implement it using some other class. One way you can do that is with the **LinkedList** class.

* Since you'll have practice with that in the lab, I will show you a different class called the **PriorityQueue** class.

* Priority queue is like a queue with first-in-first-out, but the elements are arranged in their natural ordering: smallest number first, smallest lexicographically string first, etc.

* This is also known as a **heap**.

### 💻 Find the kth smallest element

    ❓ Ask: How would you usually find the kth smallest element?

### How it works -> **📝 Draw it out to help with understanding**

* The head of the queue will return the smallest element. If we dump all the elements into the priority queue, it will keep track of the smallest element. If a new element is added, it doesn't sort itself, but just maintains the smallest in front.

* When an element is removed, it rearranges the elements so the next smallest is on top, but it doesn't actually sort everything in a strict order.

```java
public static int findKthSmallest(int[] values, int k) {
    // Initialize a Priority Queue
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Add values to the PQ
    for (int i : values) {
        pq.offer(i);
    }

    int kthSmallest = -1; // -1 just for this demo

    // Loop through k times to get the kth largest element
    for (int i = 1; i <= k; i++) {
        kthSmallest = pq.poll();
    }

    // Return kthSmallest
    return kthSmallest;
}
```