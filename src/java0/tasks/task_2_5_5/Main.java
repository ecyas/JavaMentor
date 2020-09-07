package java0.tasks.task_2_5_5;

public class Main {
    public static void main(String[] args) {
        determineAdult(-3);
    }
    public static boolean determineAdult(int age) {
        //Твой код здесь
        if(age >= 18) {
            return true;
        } else if(age < 18 && age >=0) {
            return false;
        } else {
            System.out.println("Ошибка! Введите правильный возраст.");
        }
        return false;
    }
}
