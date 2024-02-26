import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        GuessNumber guestNumberOne = new GuessNumber(player1,player2);

        guestNumberOne.play();
    }
}