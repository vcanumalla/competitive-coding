package atcoder.abc152;

import java.util.ArrayList;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int min = 200005;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val < min) {
                ++count;
                min = val;
            }
        }
        System.out.println(count);
    }
}
