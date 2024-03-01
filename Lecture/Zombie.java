import java.util.Random;

public class Zombie implements Attackable {
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

    /**
     * When a Zombie attacks the specified target Object.
     * If the target is a Player, reduces the Player's health by the attack damage of the Zombie.
     * Prints a message if the attack is on other Objects.
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
}