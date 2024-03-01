public class Game2 {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        
        System.out.println("Cow health = " + cow1.getHealth());
        
        System.out.println("You attack the cow!");
        cow1.damageCow(2);
        
        System.out.println("Cow health now = " + cow1.getHealth());
    }
}