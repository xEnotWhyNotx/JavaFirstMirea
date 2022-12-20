package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //3
        System.out.println("Task 3");
        for (int i = 1; i <= 10; ++i) {
            System.out.print(1 + "/" + i + " ");
        }
        System.out.println();
        //4

        System.out.println("Task 4");
        Random rand = new Random();
        int[] arr = new int[10];
        for (var i = 0; i < arr.length; ++i)
            arr[i] = rand.nextInt(100);
        for (var i : arr)
            System.out.print(i + " ");
        Arrays.sort(arr);
        System.out.println();
        for (var i : arr)
            System.out.print(i + " ");
    }
}
