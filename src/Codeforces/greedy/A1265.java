package Codeforces.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class A1265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++ ) {
            String chars = sc.next();
            char[] stream = chars.toCharArray();

        }
    }
    public static boolean isBeautiful(char[] stream) {
        boolean check = true;
        for (int i = 0; i < stream.length - 1; i++) {
            if (stream[i] == stream[i+1] && stream[i] != '?') {
                return false;
            }

        }
        return true;
    }
}
