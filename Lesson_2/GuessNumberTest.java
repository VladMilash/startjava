import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        GuessNumber guestNumberOne = new GuessNumber(player1,player2);
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            guestNumberOne.play();

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.next();
            while(!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Ведите нужное слово: [yes/no]:");
                choice = scanner.next();
            }
        } while(!choice.equals("no"));

        System.out.println("Игра завершена. Всего доброго!");
    }
}