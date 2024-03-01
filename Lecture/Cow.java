public class Cow {
    // instance variables
    private int health;
    private String[] drops; //Item[] 
    private boolean isBaby;
    
    // default constructor
    public Cow() {
        this.health = 8;
        this.drops = new String[2];
        this.isBaby = false;
        System.out.println("A cow has spawned!");
    }
    
    // accessor
    public int getHealth() {
        return health;
    }
    
    public boolean isBaby() {
        return isBaby;
    }
    
    // mutator
    public void damageCow(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("You killed the cow :(");
        }
    }
    
    public void growUp() {
        if (isBaby) {
            isBaby = false;
        }
    }
}