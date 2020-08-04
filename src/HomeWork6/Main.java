package HomeWork6;

import HomeWork6.Animals.*;

public class Main {
    public static void main(String[] args) {
        int dogCount = 0;
        int catCount = 0;

        Animal[] animals= {
                new Cat("Barsik", "red", 3),
                new Dog("Tuzik", "white", 5),
                new Cat("Murzik", "pink", 8),
                new Dog("Vulkan", "brown", 1)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(501);
            animals[i].swim(11);
            if( animals[i] instanceof Dog){
                dogCount++;
            }
            if( animals[i] instanceof Cat){
                catCount++;
            }
        }
        System.out.printf("Кол-во собак: %d, Кол-во кошек: %d", dogCount, catCount);

    }
}
