package Codeforces.r612;

import java.util.Scanner;

public class A {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++ ) {
            int students = sc.nextInt();
            char[] arr = sc.next().toCharArray();

            int max = 0;
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] == 'A') {
                    int count = 0;
                    for (int j = k+1; j < arr.length; j++) {
                        if (arr[j] == 'P') {
                            ++count;
                        }
                        else {
                            break;
                        }
                    }
                    if (count > max ) {
                        max = count;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
