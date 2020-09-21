package HomeWork6.Animals;

public class Dog extends Animal{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int a){
        if (a <= 500){
            System.out.printf("%s пробежал %d м.\n", name, a);
        }
        else {
            System.out.printf("%s не может пробежать больше 500 м.\n", name);
        }
    }

    @Override
    public void swim(int a){
        if (a <= 10){
            System.out.printf("%s проплыл %d м.\n", name, a);
        }
        else {
            System.out.printf("%s не может проплыть больше 10 м.\n", name);
        }
    }
}
