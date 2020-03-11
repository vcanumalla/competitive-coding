package Codeforces.math;

import java.util.Scanner;

public class A466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b/m < a) {
            int maxB = n/ m;
            // System.out.println(maxB);
            int maxA = n - (maxB * m);
            // System.out.println(maxA);
            int pos = (maxB * b) + (maxA * a);
            if (pos < (maxB + 1) * b) {
                System.out.println(pos);
            }
            else System.out.println((maxB + 1) * b);
        }
        else {
            System.out.println(n * a);
        }


    }
}
