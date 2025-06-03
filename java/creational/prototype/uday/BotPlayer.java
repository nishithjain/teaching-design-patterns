/**
 * Represents an AI-controlled player (Bot) in the game.
 * Inherits from Player and adds a bomb type as an attribute.
 */
public class BotPlayer extends Player {

    private String bomb;

    /**
     * Constructs a BotPlayer with name, health, and bomb type.
     */
    public BotPlayer(String name, int score , String bomb) {
        super(name, score);
        this.bomb = bomb;
    }

    /**
     * Copy constructor for BotPlayer.
     */
    public BotPlayer(BotPlayer p) {
        super(p.getName(), p.getHealth());
        this.bomb = p.bomb; 
    }

    /**
     * Returns a cloned instance of this BotPlayer.
     */
    @Override
    public Player clone() {
        return new BotPlayer(this);
    }

    /**
     * Prints BotPlayer information including name, health, and bomb.
     */
    @Override
    public void print() {
        System.out.println("BotPlayer: " + getName() + ", Score: " + getHealth() 
                           + ", Bomb: " + bomb);
    }
}
