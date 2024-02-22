public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        WolfOne.sex = "Мужской";
        WolfOne.nickname = "One";
        WolfOne.weight = 2;
        WolfOne.age = 4;
        WolfOne.color = "black";

        System.out.println("Sex = " + WolfOne.sex + 
                "\nnickname = " + WolfOne.nickname +
                "\nweight = " + WolfOne.weight +
                "\nage = " + WolfOne.age +
                "\ncolor = " + WolfOne.color + "\n");

        WolfOne.go();
        WolfOne.sit();
        WolfOne.run();
        WolfOne.howl();
        WolfOne.hunt();
    }
}