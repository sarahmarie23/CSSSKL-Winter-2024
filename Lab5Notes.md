# Week 5 Lab

CSSSKL 143 - 02/02/24

## 🔑 Key Points 🔑

    1. Project planning: class diagrams
    2. Inheritance: keywords: extends, super 
    3. Exceptions and throw: RuntimeException
    4. Override: what and why
    5. Bonus: interface

## ✏️ Plan it out

* Writing out your plan in notes will help you code it out later.
* What is the purpose of your project? What do you hope for it to do?

```
My card game will allow a user to choose a game from the menu, play a single player game versus the computer, and track the scores they have received over time.
```

* I can pull out classes from that statement. Menu, Player, Scores, Card, classes for each game. They might change over time.

```
    The game choices will be Blackjack, Poker, and Uno
```

* Now decide what each class needs. We already have a Card class. I'd like to create an UnoCard class. Let's check out our Card class. We can reuse a lot of this. Since Uno cards don't have a suit, it would be best to remove it, and then we can make a PlayingCard class later.

## 👑 Inheritance

```
    ⚠️ Uno Cards don't have a suit. That should be added to the PlayingCard Class
    ✔️ They do have an action (skip, reverse etc) so let's add that
```

### Things to note

> * ✅ Use the ```extends``` keyword "public class Child extends Parent
> * ✅ Notice how we don't have to rewrite anything, only add additional items.
> * ✅ Here we have the ```super``` keyword (for superclass). This means that we are calling ```Card```'s version of the constructor.
> * ✅ Use ```@Override``` to use a modified version of the parent class's method.

### Check your understanding
    🤔 Can you have a parent class, a child class, and a grandchild class?
Yes! Don't get too complicated though. 

    🤔 Can a child class extend from more than one parent classes?
No, but you can ```implement``` multiple interfaces

## ⚾ Exceptions and throws

    Why do we have exceptions? They are used to catch errors to they can be handled by the program
Some examples include
* NullPointerException
* ArrayIndexOutOfBoundsException
* ArithmeticException
* IllegalArgumentException

    ✅ `RuntimeException` is the parent class for many exceptions. Check out the documentation for more info.

We've seen them before
```java
public void readFile(String filename) throws FileNotFoundException {
  File file = new File(filename);
  if (!file.exists()) {
    throw new FileNotFoundException("File not found: " + filename);
  }
}
```

In this case, `FileNotFoundException` was thrown in the method signature, and it was handled inside the method. To use an exception with a class, you'd do a `extends`.

```java
public class getScoresFile extends FileNotFoundException {
    // code goes here
}
```

## OOP terms to know

> 📝**Inheitance**
>
> 📝**Overriding**
>
> 📝**Extends**
>
> 📝**Super**
>
> 📝**Exception**
