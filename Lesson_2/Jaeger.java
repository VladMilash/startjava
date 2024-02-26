public class Jaeger {

    private String nickname;
    private String mark;
    private int height;
    private int weight;
    private int speed;
    private int strength;
    private int armor;
    static int count;

    public Jaeger() {
        System.out.println("Создан новый робот");
        count++;
    }

    public Jaeger(String nickname, String mark, int height, int weight, 
            int speed, int strength, int armor) {
        System.out.println("Создан новый робот");
        this.nickname = nickname;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        count++;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void go() {
        System.out.println("Идет");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void guard() {
        System.out.println("Охраняет");
    }

    public void attack() {
        System.out.println("Атакует");
    }

    public void hide() {
        System.out.println("Прячется");
    }

    public void countRobots() {
        System.out.println("Роботов всего создано: " + count);
    }
}
