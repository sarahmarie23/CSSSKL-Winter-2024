public class Game {
    public static void main(String[] args) {

        // Create a new world
        World world = new World(10, 10);

        // Display it
        world.display();

        
        // Last week's code
        Player p1 = new Player();
        Zombie z1 = new Zombie();
        Cow cow2 = new Cow();

        // Testing to see that the player is on the grid
        world.displayPlayer(p1);
        
        System.out.println("Player created!");
        
        System.out.println("Player health is " + p1.getHealth());
        
        System.out.println("Oh no you were attacked by a zombie!");
       
        p1.loseHealth(5);
        
        z1.takeDamage(10);
        
        System.out.println("Player health is " + p1.getHealth());
        
        cow2.damageCow(8);
    }
}