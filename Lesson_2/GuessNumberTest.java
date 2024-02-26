import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Player player1 = new Player(scanner);
        Player player2 = new Player(scanner);
        
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