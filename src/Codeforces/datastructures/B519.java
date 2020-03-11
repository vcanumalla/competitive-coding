package Codeforces.datastructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class B519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1  =0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < n; i++)  {
                sum1+= sc.nextInt();


        }
        for (int i = 0; i < n -1; i++) {
            sum2+= sc.nextInt();

        }
        for (int i = 0; i < n - 2; i++) {
            sum3+= sc.nextInt();

        }
        System.out.println(sum1 - sum2);
        System.out.println(sum2-sum3);

    }
}
