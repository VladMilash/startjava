import java.util.Scanner;

public class Player {
    
    private String name;
    static private int count;

    public Player(Scanner scanner) {
        count++;
        System.out.println("Введите имя игрока " + count);
        this.name = scanner.nextLine();
    }
}