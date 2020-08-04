package HomeWork6.Animals;

public class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void run(int a){
        System.out.printf("%s пробежал %d м.\n", name, a);
    }
    public void swim(int a){
        System.out.printf("%s проплыл %d м.\n", name, a);
    }
}
