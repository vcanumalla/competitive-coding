package Codeforces.dp;

import java.util.Scanner;

public class A580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1;
        int count = 1;
        int prev = sc.nextInt();
        for (int i = 1; i < n; i++) {

            int cur = sc.nextInt();
            System.out.println(prev + " " + cur + " " + count);
            if (cur >= prev) {
                count++;
                prev= cur;
                if (count > max ) {
                    max = count;
                }
            }
            else {
                if (count > max) {
                    max = count;
                    count = 1;
                    prev = cur;
                }
                else {
                    prev = cur;
                    count = 1;
                }
            }
        }
        System.out.println(max);
    }
}
