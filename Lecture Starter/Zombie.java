import java.util.Random;

public class Zombie {
    // instance variables
    private int health;
    private int attackDamage;
    private String zombieType;
    private boolean hasArmor;
    
    // default constructor
    public Zombie() {
        this.health = 10;
        this.attackDamage = 5;
        this.zombieType = "Adult";
        this.hasArmor = new Random().nextInt(4) == 0; // 1 in 4 chance of being true
        System.out.println("A zombie has spawned!");
    }
    
    // accessors
    public int getHealth() {
        return health;
    }
    
    public String getZombieType() {
        return zombieType;
    }

    public boolean getArmor() {
        return hasArmor;
    }
    
    // mutators
    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        System.out.println("Zombie's health is now " + health);
        
        if (health <= 0) {
            System.out.println("You killed the zombie!");
        }
    } 

    // NEW for 2024
    // ADDING IN INTERFACE METHODS HERE

}