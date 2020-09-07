package java0.tasks.task_2_9_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = fillArray(5);
        System.out.println(Arrays.toString(array));
    }
    static int[] fillArray(int x) {
        int[] arr = new int[x];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
