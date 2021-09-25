package lesson7;

public class Plate {
    private int food;
    private final int foolPlate;

    public Plate(int food) {
        this.food = food;
        foolPlate = food;
    }


    public void decreaseFood(int n) {
        if (n > food) {
            System.out.println("There is too little food in the plate");
        } else {
        food -= n;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood() {
            food = foolPlate;
    }

    public void addFood(int newFood) {
        food += newFood;
        if (food > foolPlate) {
            food = foolPlate;
        }
    }

    public int getFood() {
        return food;
    }
}

