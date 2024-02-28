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

        int secretNum = (random.nextInt(101) + 1);
        int playerNum = 0;
        int moveСounter = 0;
        Player playersSwitch = player1; 
        
        while(playerNum != secretNum) {
            if(moveСounter % 2 == 0) {
                playersSwitch = player1;
            } else {
                playersSwitch = player2;
            }
            System.out.println("Игрок " + playersSwitch.getName() + ", ведите число:");
            playerNum = scanner.nextInt();
            moveСounter++;
            if(playerNum > secretNum) {
                System.out.println("Ваше число больше того, которое загадал компьютер");
            } else {
                System.out.println("Ваше число меньше того, которое загадал компьютер");
            }
        } 
        System.out.println("Игрок " + playersSwitch.getName() + ", Вы победили!!!");    
    }
}