public class Game {
    public static void main(String[] args) {
        int number = 25;
        int userNumber = 100;
        if (userNumber == number) {
            System.out.println("Вы победили");
        }
        else if (userNumber > number) {
            System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
            userNumber = 0;
            while (userNumber != number) {
                userNumber++;
                if (userNumber < number) {
                    System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
                }
                if (userNumber == number) {
                    System.out.println("Вы победили");
                }
            }
        }
    }
}