/**
 * Demonstrates prototype cloning with BotPlayer and RealPalyer.
 */
public class Main {

    /**
     * Returns a cloned copy of the given player.
     */
    public static Player copyPlayer(Player player) {
        return player.clone();
    }

    public static void main(String[] args) {
    
        Player realPlayer = new RealPalyer("John", 100, "AK-47");
        Player botPlayer = new BotPlayer("AI", 70, "Grenade");

        Player copiedRealPlayer = copyPlayer(realPlayer);
        realPlayer.print();
        copiedRealPlayer.print();

        Player copiedBotPlayer = copyPlayer(botPlayer);
        copiedBotPlayer.print();
        copiedBotPlayer.print();
    }
}
