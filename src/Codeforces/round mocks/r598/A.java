package Codeforces.r598;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int s = sc.nextInt();
            if (s %n <= b && a * n + b >= s) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
