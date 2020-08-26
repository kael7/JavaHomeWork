package java2hw3;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        String array[] = {"A", "B", "C", "A", "B", "D", "E", "A", "F"};
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            Integer value = map.getOrDefault(word, 0);
            map.put(word, value + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.printf("Уникальное слово: %s; \n", entry.getKey());
            }
        }
        System.out.println(map);


        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike", 78545));
        people.add(new Person("Bob", 454794947));
        people.add(new Person("Mike", 784545617));
        people.add(new Person("Sam", 22121545));
        System.out.println(Arrays.toString(new LinkedList[]{people}));
        for (Person p : people) {
            p.get("Mike");
        }
    }
}
