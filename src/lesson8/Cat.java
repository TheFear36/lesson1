package lesson8;

public class Cat implements Participant{

    private final String name;
    private final String group = "Cat";
    private final int distance;
    private final int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.distance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(group + " " + name + " running " + distance);
    }

    @Override
    public void jump() {
        System.out.println(group + " " + name + " jumping " + jumpHeight);
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getHeightJump() {
        return jumpHeight;
    }

    public String toString() {
        return group + " " + name;
    }
}
