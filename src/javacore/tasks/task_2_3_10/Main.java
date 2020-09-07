package javacore.tasks.task_2_3_10;

public class Main {
    public static void main(String[] args) {
        //isPalindrome("Was it a cat I saw");

        System.out.println(isPalindrome("Was it a cat I saw"));
    }

    public static boolean isPalindrome(String text) {
        //Твой код здесь
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text);
        String result = new StringBuilder(text).reverse().toString();
        System.out.println(result);
        return text.equalsIgnoreCase(result);
    }
}
