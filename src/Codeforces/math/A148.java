package Codeforces.math;

import java.util.Arrays;
import java.util.Scanner;

public class A148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int[] drags = new int[d];
//        System.out.println(Arrays.toString(drags)   );

        for (int i = k-1; i < drags.length; i = i+=k) {
            drags[i] = 1;
        }
        for (int i = l-1; i < drags.length; i +=l) {
            drags[i]  =1;
        }
        for (int i = m - 1; i < drags.length; i +=m) {
            drags[i]  =1;
        }
        for (int i = n - 1; i < drags.length; i +=n) {
            drags[i]  =1;
        }
//        System.out.println(Arrays.toString(drags)   );
        int num = 0;
        for (int i: drags) {
            if (i == 1) {
                ++num;
            }
        }
        System.out.println(num);
    }
}
