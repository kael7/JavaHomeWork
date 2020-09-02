package java2hw5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        singleThread();
        doubleThread();
    }

    public static void singleThread() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long time = System.currentTimeMillis();
        calculateArray(arr);
        System.out.println("Single Thread Time: " + (System.currentTimeMillis() - time) + " ms");
    }

    public static void doubleThread() {
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr, 1);
        long time = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> calculateArray(a1));
        Thread t2 = new Thread(() -> calculateArray(a2));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("Double Thread Time: " + (System.currentTimeMillis() - time) + " ms");
    }

    public static void calculateArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
