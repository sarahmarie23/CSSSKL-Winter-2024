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

    /**
    * When a Player attacks the specified target Object.
    * If the target is a Zombie, the damage is calculated based on the Zombie's armor, if it has it.
    * If the target is a Cow, the damage is dealt.
    * A message is printed if the Object is something else.
    * @param target The object to attack.
    */
    @Override
    public void attack(Object target) {
        if (target instanceof Zombie) {
            Zombie zombie = (Zombie) target;
            int damageDealt = this.attackDamage;
            if (zombie.getArmor()) {
                System.out.println("The zombie had armor, your attack was weakened!");
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
}
