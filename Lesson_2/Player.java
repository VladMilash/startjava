import java.util.Scanner;

public class Player {
    
    private String name;
    static private int count;

    public Player(String name) {
    count++;
    this.name = name;
    }

    public String getName() {
        return name;
    }
}