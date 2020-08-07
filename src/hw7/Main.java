package hw7;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(100);

        Cat[] cat = {
                new Cat("Barsik", 10, false),
                new Cat("Tigr", 15, false),
                new Cat("Murzik", 25, false),
                new Cat("Bart", 35, false),
                new Cat("Vasyok", 20, false),
        };

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }

        plate.increaseFood(20);


        System.out.println(plate);
    }
}
