import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        Random random = new Random();

        System.out.println("Введите имя первого игрока:");
        String namePlayer1 = scanner.next();
        player1.setName(namePlayer1);

        System.out.println("Введите имя второго игрока:");
        String namePlayer2 = scanner.next();
        player2.setName(namePlayer2);

        int computerNumber = (random.nextInt(101) + 1);
        int player1Number = 0;
        int player2Number = 0;
        
        while((player1Number != computerNumber) && (player2Number != computerNumber)) {
            System.out.println("Ход первого игрока. Введите число: ");
            player1Number = scanner.nextInt();
            if(player1Number == computerNumber) {
            System.out.println("Победил " + player1.getName());
            } else if(player1Number > computerNumber) {
                System.out.println("Ваше число больше того, которое загадал компьютер");
            } else {
                System.out.println("Ваше число меньше того, которое загадал компьютер");
            }
            if(player1Number != computerNumber) {
                System.out.println("Ход второго игрока. Введите число: ");
                player2Number = scanner.nextInt();
                if(player2Number == computerNumber) {
                    System.out.println("Победил " + player2.getName());
                } else if(player2Number > computerNumber) {
                    System.out.println("Ваше число больше того, которое загадал компьютер");
                } else {
                    System.out.println("Ваше число меньше того, которое загадал компьютер");
                }
            }
        }     
    }
}