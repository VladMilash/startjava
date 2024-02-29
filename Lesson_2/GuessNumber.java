import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNum = (random.nextInt(101) + 1);
        int playerNum = 0;
        Player currentPlayer = player2; 
        
        while(playerNum != secretNum) {
            if(currentPlayer == player2) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }
            System.out.println("Игрок " + currentPlayer.getName() + ", ведите число:");
            playerNum = scanner.nextInt();
            if(playerNum > secretNum) {
                System.out.println("Ваше число больше того, которое загадал компьютер");
            } else {
                System.out.println("Ваше число меньше того, которое загадал компьютер");
            }
        } 
        System.out.println("Игрок " + currentPlayer.getName() + ", Вы победили!!!");    
    }
}