# Week 9 Lab

CSSSKL 143 - 03/1/24

## 🔑 Key Points 🔑

    1. Sorting: A note about algorithms
    2. Interfaces: Making our own

## Sorting Algorithms

* This week's lab will have you code out some sorting algorithms, so I'm not going to code them out today.

* As discussed during the introduction, there are many other (faster) sorting algorithms.

* If you find algorithms interesting, you can specialize in it.

* I encourage you to check out other algorithms and read up more about it! ***Introduction to Algorithms*** by CLRS is a highly recommended source (and you might need it for future classes).

* Check out http://www.visualgo.net it has a lot of animations for sorting algorith and using data structures

## Why Interfaces?

* Let's use our Minecraft example from 142. We had a Player class, and it interacted with the Zombie and Cow classes. Later we made a World class to generate a grid representing the different biomes. We tied it all together in a Game class, where we made a Player object and had it attack and kill the zombie.

* You might have considered back when we were learning about inheritance, that you might have created a class that inherited from another class. Perhaps `Zombie` was a subclass of `Mob`. It seemed reasonable at the time.

🤔 Based on your understanding of interfaces and inheritance, why might interfaces be a better idea?

1. **Tight Coupling** - Changes to a parent class can potentially impact all of its subclasses, because they are tightly coupled together. Interfaces promote **loose coupling** since they aren't directly tied to specific implementation details on the interface.

2. **Multiple Implementations** - A class can only inherit from one parent class, but it can implement multiple interfaces at the same time.

3. **Separation of Concerns** - An interface tells the class what it can do through abstract methods. But with inheritance, the child class inherits the behavior and state (all the methods and fields), which makes it harder to manage the code. The more you can separate and restrict your, code, the easier it is to find and fix bugs, and build upon your project.

### How do you know when it would be helpful to make an interface?

🤔 What are some functionalities or behaviors that multiple classes might have?

* `Player` and `Zombie` can both attack. How about an `Attackable` interface?

### Starting with the `Attackable` interface

* Start with the basic `attack` method. Every object that is `Attackable` will have the method to `attack`.
* Don't forget to comment as you go along.

```java
/**
 * Defines a contract for entities that have the ability to attack.
 */
public interface Attackable {
    /**
     * Attacks a target.
     * @param target The target to attack.
     */
    public void attack(Object target);
}
```

Now we update Player and Zombie to include the interface and new method

```java
public class Zombie implements Attackable {
```

* The attack method is going to be different for Zombies and Players. For simplicity, when a Zombie attacks a Player, I want it to print out that the player was attacked by a Zombie. But if the Zombie attacked another entity like a Cow, it would say and do something different.

🌟 Note that the `attack` method in interface is just a plain void method. It is abstract and public by default so you don't need to add `public`.

```java
/**
 * Attacks the specified target object.
 * If the target is a Player, reduces the Player's health by the attack damage of the Zombie.
 * Prints a message indicating the attack.
 * @param target The object to attack.
 */
@Override
public void attack(Object target) {
    if (target instanceof Player) {
        Player player = (Player) target;
        player.loseHealth(this.attackDamage);
        System.out.println("You are attacked by a zombie!");
    } else {
        System.out.println("TODO: write code for other objects");
    }
}
```

* Now on to the Player's implementation of `attack`

```java
/**
* When a Player ttacks the specified target Object.
* If the target is a Zombie, the damage is calculated based on the Zombie's armor, if it has it.
* If the target is a Cow, the deamage is dealt
* A message is printed if the Object is something else.
* @param target The object to attack.
*/
@Override
public void attack(Object target) {
    if (target instanceof Zombie) {
        Zombie zombie = (Zombie) target;
        int damageDealt = this.attackDamage;
        if (zombie.getArmor()) {
            damageDealt /= 2;
        }
        zombie.takeDamage(damageDealt); 
        System.out.println("Player deals " + damageDealt + " damage");
    } else if (target instanceof Cow) {
        Cow cow = (Cow) target;
        cow.damageCow(5);
        System.out.println("You injured the cow!");
    } else {
        System.out.println("You did no damage");
    }
}
```

🌟 Note that we could have an overloaded `attack` method inside Attackable, perhaps we want an attack if the Attackable entity has an enchanted weapon

```java
/**
 * Attacks a target with an enchanted weapon.
 * @param target The target to attack.
 * @param enchantment The type of enchantment.
 */
void attack(Object target, String enchantment);
```

### Other ideas of interfaces you could make

* **Interactible** - used for objects that can be interacted with (most items!). Interaction might include methods for `interact`, `canInteractWith` because some blocks can only be broken with certain tools, for example.

* **Craftable** - used for objects that can be crafted: weapons, anything that you craft at a crafting table (and the crafting table itsself!). It might include a `craft` method which creates the item and adds it to the inventory and a `getCraftingMaterials` method, which lists the required materials and quantities, so that it will only be crafted if the Player has enough supplies.
