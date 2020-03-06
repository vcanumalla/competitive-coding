package Codeforces;

import java.util.Scanner;

public class suffixthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        for (int i = 1; i <= numLines; i++) {
            String s = sc.next();
            String end = s.substring(s.length() -1);
            if (end.equals("u")) {
                System.out.println("JAPANESE");
            }
            else if (end.equals("a")) {
                System.out.println("KOREAN");
            }
            else {
                System.out.println("FILIPINO");
            }
        }

    }
    public static boolean isKorean(String s) {
        String end = s.substring(s.length() - 5);
        if (end.equals("mnida")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isFil(String s) {
        String end = s.substring(s.length() - 2);
        if (end.equals("po")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isJap(String s) {
        String end = s.substring(s.length() - 4);
        if (end.equals("desu") || end.equals("masu")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void chooseLanguage(String s) {
        if (isKorean(s)) {
            System.out.println("KOREAN");
        }
        else if (isJap(s)) {
            System.out.println("JAPANESE");
        }
        else if (isFil(s)) {
            System.out.println("FILIPINO");
        }
    }
    public static void printLanguage(String s, int numLines) {
        for (int i = 1; i < numLines; i++) {
            String end = s.substring(s.length() -1);
            if (end.equals("u")) {
                System.out.println("JAPANESE");
            }
            else if (end.equals("a")) {
                System.out.println("KOREAN");
            }
            else {
                System.out.println("FILIPINO");
            }
        }
    }
}
