public class InterfaceDriver {
    public static void main(String[] args) {
        // Create instances of Player, Zombie, and Cow
        Player player = new Player();
        Zombie zombie = new Zombie();
        Cow cow = new Cow();
        
        // Simulate attack by Player on Zombie
        System.out.println("\nPlayer attacks Zombie:");
        player.attack(zombie);
        
        // Simulate attack by Zombie on Player
        System.out.println("\nZombie attacks Player:");
        zombie.attack(player);
        
        // Simulate attack by Player on Cow
        System.out.println("\nPlayer attacks Cow:");
        player.attack(cow);
        
        // Simulate attack by Zombie on Cow
        System.out.println("\nZombie attacks Cow:");
        zombie.attack(cow);

        // Get the health for Zombie and Player
        System.out.println("\nZombie health now " + zombie.getHealth());
        System.out.println("\nPlayer health now " + player.getHealth());

        // Zombie attack! 
        // Create zombies until one of them has armor
        Zombie zombie2;
        do {
            zombie2 = new Zombie();
        } while (!zombie2.getArmor());
        
        // Simulate attack by Player on Zombie
        System.out.println("\nPlayer attacks Zombie2:");
        player.attack(zombie2);

    }
}

