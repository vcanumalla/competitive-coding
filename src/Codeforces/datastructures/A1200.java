package Codeforces.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class A1200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] events = new char[n];
        String s = sc.next();
        for (int i =  0; i < n; i++) {
            events[i] = s.charAt(i);
        }
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'L') {
                for (int j = 0; j < 10; j++) {
                    if (arr[j] == 1);
                    else {
                        arr[j] = 1;
                        break;
                    }
                }

            }
            else if (s.charAt(i) == 'R') {
                for (int j = 9; j >= 0; j--) {
                    if (arr[j] == 1);
                    else {
                        arr[j] = 1;
                        break;
                    }
                }
            }
            else {
                arr[s.charAt(i) - 48] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
        }
    }
}
