/*
ID: vishalc2
LANG: JAVA
TASK: dualpal
 */
package usaco.Training;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class dualpal {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("dualpal.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int s = sc.nextInt();
        int k = 1;
        int count = 0;
        while (count < n) {
            int num = s +k;
            if (isDualPal(num)) {
                count++;
                k++;
                out.println(num);
            }
            else {
                k++;
            }

        }
        out.close();

    }
    public static boolean isDualPal(int num) {
        int count = 0;
        for (int i = 2; i <= 10; i++) {
            String numInBase = Integer.toString(num, i);
            if (isPal(numInBase)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;

        }
        return false;
    }
    public static boolean isPal(String s) {
        StringBuilder sr = new StringBuilder();
        sr.append(s);
        sr.reverse();
        String bruh = sr.toString();
        if (s.equals(bruh)) {
            return true;
        }
        return false;
    }
}
