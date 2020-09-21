package java3hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {17, 28, 49, 57, 63};
        changePositionOfElements(arr, 0,1);
        toArrayList(arr);


        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        Box<Orange> newBox = new Box<>();

        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println(appleBox.compareFruitBox(orangeBox));

        orangeBox.replaceFruitBox(newBox);
        System.out.println(orangeBox.getBox());
        System.out.println("New box weight: " + newBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
    }

    private static void changePositionOfElements(Object[] arr, int i, int j){
        Object value = arr[i];
        arr[i]=arr[j];
        arr[j]=value;
        System.out.println(Arrays.toString(arr));
    }

    private static <T> void toArrayList(T[]arr){
        ArrayList<T> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrList);
    }
}
