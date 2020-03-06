package Codeforces.math;

import java.util.Scanner;

public class A270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        for (int i = 1; i <= t; i++ ) {
            double ang = Integer.parseInt(sc.next());
            double myNum = 360/(180-ang);
            if (myNum %1 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
