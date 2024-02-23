public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("Мужской");
        wolfOne.setNickname("One");
        wolfOne.setWeight(2);
        wolfOne.setAge(4);
        wolfOne.setСolor("black");

        System.out.println("Sex = " + wolfOne.getSex() + 
                "\nnickname = " + wolfOne.getNickname() +
                "\nweight = " + wolfOne.getWeight() +
                "\nage = " + wolfOne.getAge() +
                "\ncolor = " + wolfOne.getСolor() + "\n");

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}