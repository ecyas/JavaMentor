package java0.tasks.task_2_7_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Твой код здесь
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println ("Как вас зовут?");

        name = sc.nextLine();

        System.out.println("Здравствуйте, " + name + "!");
    }
}
