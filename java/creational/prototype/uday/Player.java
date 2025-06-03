/**
 * Abstract base class representing a Player in the game.
 * Defines common properties like name and health, and abstract methods
 * for cloning and printing player details.
 */
public abstract class Player {
    
    private String name;
    private int health;
  
    /**
     * Constructs a Player with given name and health.
     */
    public Player(String name, int score) {
        this.name = name;
        this.health = score;
    }

    /**
     * Copy constructor to clone a Player.
     */
    public Player(Player player) {
        this.name = player.name;
        this.health = player.health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    /**
     * Abstract method to create a copy of the Player.
     */
    public abstract Player clone();

    /**
     * Abstract method to print player information.
     */
    public abstract void print();
}
