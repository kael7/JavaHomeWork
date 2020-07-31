package HomeWork5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Янкелевич Кириак", "animator", "123@mail.ru", 491491991, 25602, 45);
        persArray[2] = new Person("Ромодановская Галина", "croupier", "Vadyuser@sfztn.com", 8525434, 12414, 50);
        persArray[3] = new Person("Бахтыгозина Мокрина", "pianist", "Vekezhnh@sfztn.com", 435325253, 36565, 25);
        persArray[4] = new Person("Блудова Иоанникия", "waiter", "Reakvosh@sfztn.com", 865858575, 55757, 21);

//        for (Person person : persArray) {
//            person.info();
//        }

        for (Person person : persArray) {
            person.info(40);
        }
    }

}
