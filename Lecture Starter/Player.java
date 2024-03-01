public class Player implements Attackable {
    // instance variables
    private int health;
    private String[] inventory;
    private int speed;
    private int xLocation;
    private int yLocation;
    private int attackDamage; // NEW; this is the base amount of damage a player deals to an entity when the player attacks it
    
    // default constructor
    public Player() {
        this.health = 10;
        this.inventory = new String[10];
        this.speed = 0;
        this.xLocation = 0;
        this.yLocation = 0;
        this.attackDamage = 3; // Updated for the new variable
    }
    
    // accessor 
    public int getHealth() {
        return health;
    }

    public int getX() {
        return xLocation;
    }

    public int getY() {
        return yLocation;
    }
    
    // mutator
    public void loseHealth(int damage) {
        System.out.println("you lost " + damage + " health!");
        health -= damage;
    }
    
    // NEW for 2024
    // ADDING IN INTERFACE METHODS HERE

}
