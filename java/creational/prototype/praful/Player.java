public abstract class Player{
    private String name;
    private int health;
    private int level;

public Player(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }



public String getName() {
    return name;
}

public int getHealth() {
    return health;
}

public int getLevel() {
    return level;
}

public abstract Player clone();
public abstract void print();
}