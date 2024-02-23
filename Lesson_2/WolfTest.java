public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        WolfOne.setSex = "Мужской";
        WolfOne.setNickname = "One";
        WolfOne.setWeight = 2;
        WolfOne.setAge = 4;
        WolfOne.setColor = "black";

        System.out.println("Sex = " + WolfOne.getSex + 
                "\nnickname = " + WolfOne.getNickname +
                "\nweight = " + WolfOne.getWeight +
                "\nage = " + WolfOne.getAge +
                "\ncolor = " + WolfOne.getColor + "\n");

        WolfOne.go();
        WolfOne.sit();
        WolfOne.run();
        WolfOne.howl();
        WolfOne.hunt();
    }
}