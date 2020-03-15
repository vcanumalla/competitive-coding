package Codeforces.r411;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i <= r - l; i++) {

            int j = (l + i);
            if (j %2 == 0) {
                ++count2;
            }
            else if (j%3 == 0) {
                ++count3;
            }
        }
        int ans;
        if (count2 > count3) {
            ans = 2;

        }
        else {
            ans = 3;
        }
        System.out.println(ans);


    }

}
