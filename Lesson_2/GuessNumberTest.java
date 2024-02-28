import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        String playerName = scanner.next();
        Player player1 = new Player(playerName);

        System.out.println("Введите имя второго игрока: ");
        playerName = scanner.next();
        Player player2 = new Player(playerName);
        
        GuessNumber game = new GuessNumber(player1, player2);
        
        String choice;

        do {
            game.play();

            System.out.println("Хотите еще сыграть? [yes/no]:");
            choice = scanner.next();
            while(!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Ведите нужное слово: [yes/no]:");
                choice = scanner.next();
            }
        } while(!choice.equals("no"));

        System.out.println("Игра завершена. Всего доброго!");
    }
}