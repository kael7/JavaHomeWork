package java3hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> box = new ArrayList();

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T t : box) {
            weight = weight + t.getWeight();
        }
        return weight;
    }

    public boolean compareFruitBox(Box<? extends Fruit> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.000001f;
    }

    public void replaceFruitBox(Box<T> box) {
        box.box.addAll(this.box);
        this.box.clear();
    }
}
