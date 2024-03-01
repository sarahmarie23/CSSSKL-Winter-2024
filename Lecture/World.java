public class World {
    // Instance variables
    private int width;
    private int height;
    private char[][] grid;

    // Constructors
    public World() {
        this.width = 10;
        this.height = 10;
        this.grid = new char[height][width];
        initializeTerrain();
    }

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];
        initializeTerrain();
    }

    // Methods
    // Initializes the terrain with a randomly generated amount of mountains, water, and plains
    public void initializeTerrain() {
        // Random: nextInt(high - low) + low
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                double rand = Math.random();
                if (rand < 0.2) { // Mountains percent
                    grid[row][col] = '^'; // Represents mountains
                } else if (rand > 0.7) { 
                    grid[row][col] = '*'; // Representing water
                } else {
                    grid[row][col] = '-'; // Represents plains
                }
            }
        }
    }

    // Prints the grid to the screen
    public void display() {
        for (int row = 0; row < height; row++) { // Outer loop goes row by row
            for (int col = 0; col < width; col++) { // Inner loop goes column by column, over a single row
                System.out.print(grid[row][col] + " "); 
            }
            System.out.println();
        }
    }

    // Given a Player, display them on the map as an X
    public void displayPlayer(Player p1) {
        // Get the coordinates
        int playerX = p1.getX();
        int playerY = p1.getY();

        // Make a copy because we are just printing, not updating the grid
        char[][] tempGrid = grid.clone(); // Shallow copy, we don't need an actual deep copy here!
        tempGrid[playerX][playerY] = 'X';

        // Now print with the player's location
        for (int row = 0; row < height; row++) { // Outer loop goes row by row
            for (int col = 0; col < width; col++) { // Inner loop goes column by column, over a single row
                System.out.print(grid[row][col] + " "); 
            }
            System.out.println();
        }
    }
}
