public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 5;
        int playerNumber = 1;
        while (computerNumber != playerNumber) {
            if (computerNumber > playerNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
            else if (computerNumber < playerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            }
        }
        System.out.println("Вы победили");
    }
}