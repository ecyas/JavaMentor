package javacore.tasks.task_2_4_17;

public class Main {
    public static void main(String[] args) {
        printOddNumbers(new int[]{3,5,20,8,7,3,100});
    }
    public static void printOddNumbers(int[] arr) {
        //Твой код здесь
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                //System.out.print(arr[i]);
                res = res.append(arr[i] + ",");
            }
        }
        System.out.println(res.toString());
    }
}
