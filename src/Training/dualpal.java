/*
ID: vishalc2
LANG: JAVA
TASK: dualpal
 */
package Training;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class dualpal {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("dualpal.in"));
//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int k = 0;
        for (int j = 0; j < 30; j++) {
            int num =s +k + 1;
            int numSquare = (num) * (num);
//
//            if (isDualPal(numSquare)) {
//                System.out.println("true");
//                i++;
//                System.out.println(num);
//                k++;
//            }
//            else {
//                System.out.println((num) + " " + isDualPal(numSquare));
            System.out.println(num + " " + isDualPal(numSquare));
            k++;


        }

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
    public static boolean isDualPal(int squareNum) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            String numBase = Integer.toString(squareNum, i);
            if (isPal(numBase)) {
                System.out.println("Bool");
                count++;
            }
        }
        return count >= 2;
    }
}
