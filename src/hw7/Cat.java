package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    private int food;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        food = plate.getFood();
        if (food >= appetite) {
            satiety = true;
            System.out.println(name + " eat " + satiety);
            plate.decreaseFood(appetite);
        } else {
            System.out.println(name + " no eat " + satiety);
        }

    }
}
