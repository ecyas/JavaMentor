package java0.tasks.task_2_8_1;

public class Main {
    public static int getMinFromTwo(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
        int a = getMinFromTwo(x, y);
        int b = getMinFromTwo(m, n);
        return getMinFromTwo(a, b);


    }
}
