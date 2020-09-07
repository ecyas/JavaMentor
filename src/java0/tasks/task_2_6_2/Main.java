package java0.tasks.task_2_6_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(determineRainfall(8, 12));

    }
    public static long determineRainfall(double area, double rainfallAmount) {
        //Твой код здесь
        return (long) ((area*1000000) * rainfallAmount * 2);
    }
}
