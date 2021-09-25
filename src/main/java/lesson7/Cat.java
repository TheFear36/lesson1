package lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public void eat(Plate p) {
        if (satiety) {
            System.out.println(name + " is not hungry");
        } else {
            p.decreaseFood(appetite);
            if (p.getFood() < appetite) {
                System.out.println(name + " didn't have enough food");
            } else {
                System.out.println(name + " eat " + appetite + " gram of food");
                satiety = true;
            }
            catSatiety();
        }
    }

    public void catSatiety () {
        if (satiety) {
            System.out.println(name + " satiety");
        } else {
            System.out.println(name + " is not satiety");
        }
    }

}



