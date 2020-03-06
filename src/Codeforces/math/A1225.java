package Codeforces.math;

import java.util.Scanner;

public class A1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int da = Integer.parseInt(sc.next());
        int db = Integer.parseInt(sc.next());

        if (db - da > 1 || da -db > 1) {
            System.out.println("-1");
        }
        else if (da + 1 == db){
            System.out.println(da +"9 " + db +"0");
        }
        else if (da == 9 && db == 1) {
            System.out.println(99 + " " + 100);

        }
        else if (db == da) {
            System.out.println(da + "4 " + db + "5");
        }
        else if (da > db) {
            System.out.println("-1");
        }
        else {
            System.out.println("-1");
        }



    }
}
