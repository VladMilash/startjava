import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scanner = new Scanner(System.in);
    }

    public void play() {
        Random random = new Random();

        int computerNumber = (random.nextInt(101) + 1);
        int playerNumber = 0;
        
        while(playerNumber != computerNumber) {
            System.out.println("Каждый игрок вводит число по очереди. Введите число:");
            playerNumber = scanner.nextInt();
            if(playerNumber > computerNumber) {
                System.out.println("Ваше число больше того, которое загадал компьютер");
            } else {
                System.out.println("Ваше число меньше того, которое загадал компьютер");
            }
        } 
        System.out.println("Ура!!! Вы победили!!!");    
    }
}