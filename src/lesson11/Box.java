package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <F extends Fruit> {

    private final ArrayList<Fruit> fruits = new ArrayList<>();

    public void put(Fruit fruit) {
        fruits.add(fruit);
    }

    public void put(F[] fruit) {
        fruits.addAll(Arrays.asList(fruit));
    }

    public float getWeight() {
        float boxWeight = 0f;
        for (int i = 0; i < fruits.size(); i++) {
            boxWeight += fruits.get(i).weight();
        }return boxWeight;
    }

    public boolean compare(Box<Orange> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }


    public void pourToAnotherBox(Box<Fruit> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public void addFruit(F fruit, int count) {
        for (int i = 1; i < count; i++) {
            fruits.add(fruit);
        }
    }



}
