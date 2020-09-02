package java2hw5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];

    public static void main(String[] args) {
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            System.arraycopy(arr, 0, a1, 0, h);
            calArray(a1);
            System.arraycopy(a1, 0, arr, 0, h);
            System.out.println("Time Thread 1: " + (System.currentTimeMillis() - a) + " ms");
        });

        Thread t2 = new Thread(() -> {
            System.arraycopy(arr, h, a2, 0, h);
            calArray(a2);
            System.arraycopy(a2, 0, arr, h, h);
            System.out.println("Time Thread 2: " + (System.currentTimeMillis() - a) + " ms");
        });

        t1.start();
        t2.start();

        calArray(arr);

        System.out.println("Time: " + (System.currentTimeMillis() - a) + " ms");
    }

    public static void calArray(float[] newarr){

        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = (float) (newarr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
