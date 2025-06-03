public class BotPlayer extends Player {
    private String bomb;

    public BotPlayer(String name, String bomb, int health, int level) {
        super(name, health, level); // Call the constructor of Player with the name, health, and level
        this.bomb = bomb; // Initialize the bomb type
    }

    public BotPlayer(BotPlayer botPlayer) {
        super(botPlayer.getName(), botPlayer.getHealth(), botPlayer.getLevel()); // Copy constructor
        this.bomb = botPlayer.bomb; // Copy the bomb type
    }

    @Override
    public Player clone() {
        return new BotPlayer(this); // Create a new BotPlayer using the copy constructor
    }

    @Override
    public void print() {
        System.out.println("BotPlayer Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Level: " + getLevel());
        System.out.println("Bomb: " + bomb);
    }
}
