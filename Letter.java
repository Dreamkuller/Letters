package vower.Letters;

import java.util.Scanner;

/**
 * Created by Andrew on 29.09.2016.
 */
public class Letter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inner = sc.next();
        String outer = "";


        for (int i = 0; i < inner.length(); i++) {
            Character letter = inner.charAt(i);

            if (!isVover(letter)) outer += "." + Character.toLowerCase(letter);
        }
        System.out.println(outer);

    }

    private static boolean isVover(Character letter) {
        Character letterMin = Character.toLowerCase(letter);
        return letterMin == 'a' ||
                letterMin == 'o' ||
                letterMin == 'u' ||
                letterMin == 'e' ||
                letterMin == 'y' ||
                letterMin == 'i';

    }
}
