import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        String player1Name = scanner.next();

        System.out.println("Введите имя второго игрока: ");
        String player2Name = scanner.next();
        
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        
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