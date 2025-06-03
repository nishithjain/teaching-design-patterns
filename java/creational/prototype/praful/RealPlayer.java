public class RealPlayer extends Player {
    private String weapon;

    public RealPlayer(String name, String weapon, int health, int level) {
        super(name, health, level); // Call the constructor of Player with level
        this.weapon = weapon; // Initialize the weapon
    }

    public RealPlayer(RealPlayer realPlayer) {
        super(realPlayer.getName(), realPlayer.getHealth(), realPlayer.getLevel()); // Copy constructor
        this.weapon = realPlayer.weapon; // Copy the weapon
    }

    @Override
    public Player clone() {
        return new RealPlayer(this); // Create a new RealPlayer using the copy constructor
    }

    @Override
    public void print() {
        System.out.println("RealPlayer Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Level: " + getLevel());
        System.out.println("Weapon: " + weapon);
    }
}
