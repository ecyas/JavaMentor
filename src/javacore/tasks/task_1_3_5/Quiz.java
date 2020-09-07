package javacore.tasks.task_1_3_5;

import java.security.MessageDigest;

public class Quiz {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
        System.out.println();
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }
    public static boolean isPowerOfTwo(int value) {
        //Твой код здесь
        return (int)(Math.ceil((Math.log(value) / Math.log(2))))

                == (int)(Math.floor(((Math.log(value) / Math.log(2)))));
    }

}
