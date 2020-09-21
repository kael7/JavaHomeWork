package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
//        guessTheNumber();
        guessTheWord();
    }

    public static void guessTheNumber() {
        int randomNumber = rand.nextInt(10);
        int userNumber;
        int gameMenu;
        int count = 0;
        System.out.printf("Загаданное число: %d\n", randomNumber);
        do {
            System.out.println("Введите число: ");
            userNumber = sc.nextInt();
            count++;
            if (userNumber == randomNumber) {
                System.out.println("Вы угадали число");
            } else if (userNumber > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }

        } while (userNumber != randomNumber && count < 3);
        System.out.println("Повторить игру еще раз?");
        gameMenu = sc.nextInt();
        switch (gameMenu) {
            case 1:
                guessTheNumber();
                break;
            case 0:
                break;
        }
    }

    public static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomNumber = rand.nextInt(words.length);
        String randomWord = words[randomNumber];
        String userWord;

        int startR = 0;
        int endR = randomWord.length();
        char[] randomArray = new char[endR - startR];
        randomWord.getChars(startR, endR, randomArray, 0);

        System.out.printf("Загаданное слово: %s\n", randomWord);
        do {
            System.out.println("Введите слово: ");
            userWord = sc.next();

            int startU = 0;
            int endU = userWord.length();
            char[] userArray = new char[endU - startU];
            userWord.getChars(startU, endU, userArray, 0);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < userArray.length; i++) {
                if (userArray[i] == randomArray[i]) {
                    sb.append(randomWord.charAt(i));
                }
            }
            if(sb.length() == randomWord.length()){
                System.out.println(sb);
            }
            else {
                System.out.println(sb + "###########");
            }
        } while (!userWord.equals(randomWord));
        System.out.println("Вы угадали слово");
    }
}
