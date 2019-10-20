package Codeforces;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLanterns = sc.nextInt();
        long length = (long) sc.nextInt();
        long[] lanterns = new long[numLanterns];
        for (int i = 0; i < numLanterns; i++) {
            lanterns[i] = sc.nextInt();

        }
        Arrays.sort(lanterns);

        long totalGap = lanterns[numLanterns -1] - lanterns[0];
        long begGap = lanterns[0] - 0;
        long endGap = length - lanterns[numLanterns -1];


        long maxGap = 0;



        for (int i = 1; i <= numLanterns - 1; i++) {
            long temp = lanterns[i] - lanterns[i-1];
            if (temp > maxGap) {
                maxGap = temp;
            }
        }


        long mG =  maxGap;

        long edgeGap = 0;
        if (begGap > endGap) {
            edgeGap = begGap;
        }
        else {
            edgeGap = endGap;
        }

        if (maxGap == 0 && edgeGap == 0) {

            System.out.println(totalGap / 2);
        }
        else if ((long) (maxGap) /2.0 <= edgeGap) {

            System.out.println(edgeGap);
        }
        else {

            System.out.println((long) maxGap / 2.0);
        }
    }
}
