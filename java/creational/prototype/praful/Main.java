public class Main {
    public static Player copyPlayer(Player player) {
        return player.clone(); // Use the clone method to create a copy of the player
    }

    public static void main(String[] args) {
        Player botPlayer = new BotPlayer("pj", "Explosive", 100, 1);
        Player realPlayer = new RealPlayer("pjp", "Sword", 100, 0);

        // Print original players
        System.out.println("Original Players:");
        botPlayer.print();
        realPlayer.print();

        // Copy players
        Player copiedBotPlayer = copyPlayer(botPlayer);
        Player copiedRealPlayer = copyPlayer(realPlayer);

        // Print copied players
        System.out.println("\nCopied Players:");
        copiedBotPlayer.print();
        copiedRealPlayer.print();
    }
}
