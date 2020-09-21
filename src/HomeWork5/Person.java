package HomeWork5;

public class Person {
    String name;
    String job;
    String email;
    int number;
    int salary;
    int age;

    public Person(String name, String job, String email, int number, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("name: %s job: %s email: %s number: %d salary: %d age: %d \n", name, job, email, number, salary, age);
    }

    public void info(int a) {
        if (age >= a) {
            System.out.printf("name: %s job: %s email: %s number: %d salary: %d age: %d \n", name, job, email, number, salary, age);
        }
    }
}
