/**
 * Represents a human-controlled player in the game.
 * Inherits from Player and adds a weapon attribute.
 */
public class RealPalyer extends Player {

    private String weapon;

    /**
     * Constructs a RealPalyer with name, health, and weapon.
     */
    public RealPalyer(String name, int health, String weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    /**
     * Copy constructor for RealPalyer.
     */
    public RealPalyer(RealPalyer p) {
        super(p.getName(), p.getHealth());
        this.weapon = p.weapon; 
    }

    /**
     * Returns a cloned instance of this RealPalyer.
     */
    @Override
    public Player clone() {
        return new RealPalyer(this);
    }

    /**
     * Prints RealPalyer information including name, health, and weapon.
     */
    @Override
    public void print() {
        System.out.println("RealPlayer: " + getName() + ", health: " + getHealth() 
                           + ", Weapon: " + weapon);
    }
}
