package javacore.tasks.task_2_4_16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().evenArray(8)));
    }

    public int[] evenArray(int number) {
        //Твой код здесь
        int[] arr = new int[number/2];
        for (int i = 0, n = 1; i < arr.length; i++, n++) {
            //if (n % 2 == 0) {
                arr[i] = n*2;
            //}
        }
        return arr;
    }
}
