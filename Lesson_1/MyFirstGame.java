public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 90;
        int playerNumber = 100;
        if (playerNumber > computerNumber) {
            while (playerNumber != computerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            }
        } else if (playerNumber < computerNumber) {
            while (playerNumber != computerNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        if (playerNumber == computerNumber) {
            System.out.println("Вы победили");
        }
    }
}
