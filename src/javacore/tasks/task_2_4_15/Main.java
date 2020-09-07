package javacore.tasks.task_2_4_15;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().determineGroup(25));
    }
    public int determineGroup(int age) {
        //Твой код здесь
        if (age > 7 && age <= 13) {
            return 1;
        } else if (age > 13 && age <= 17) {
            return 2;
        } else if (age > 17 && age <= 65) {
            return 3;
        }
        return -1;
    }
}
