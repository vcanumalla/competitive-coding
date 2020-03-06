package bronze.dec18;

import java.io.*;
import java.util.StringTokenizer;

/*
OFFICIAL SOLUTION, DID NOT SOLVE ON OWN
 */
public class backandforth {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("backandforth.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backandforth.out")));
        String b1 = bf.readLine();
        String b2 = bf.readLine();
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        int[] B1 = new int[10];
        int[]B2 = new int[10];
        for (int i = 0; i < 10; i++) {
            B1[i] = Integer.parseInt(st1.nextToken());
            B2[i] = Integer.parseInt(st2.nextToken());

        }

    }
    int[] possibleAnswers = new int[10000];
    public static void tuesday(int b1milk, int[] B1, int[] B2) {
        for (int i = 0; i < B1.length; i++) {
            int x = B1[i];
            int[] newB1 = new int[B1.length];


        }
    }
}
