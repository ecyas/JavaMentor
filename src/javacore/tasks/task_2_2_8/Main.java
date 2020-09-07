package javacore.tasks.task_2_2_8;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }

    public static boolean isPowerOfTwo(int value) {
        //Твой код здесь
        value = Math.abs(value);

        return Integer.bitCount(value) == 1;
    }
}
