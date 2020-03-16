package atcoder.abc158;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long  ballsLeft = n% (a+b);
        long times = n / (a+b);
        if (ballsLeft >= a) {
            System.out.println(a * (times + 1));
        }
        else {
            System.out.println(a * (times) + (ballsLeft));
        }
    }
}
