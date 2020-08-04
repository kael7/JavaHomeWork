package HomeWork6.Animals;

public class Cat extends Animal{
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int a){
        if (a <= 200){
            System.out.printf("%s пробежал %d м.\n", name, a);
        }
        else {
            System.out.printf("%s не может пробежать больше 200 м.\n", name);
        }
    }

    @Override
    public void swim(int a){
        System.out.printf("%s не умеет плавать.\n", name);
    }
}
