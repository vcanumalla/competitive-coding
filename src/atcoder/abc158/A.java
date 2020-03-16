package atcoder.abc158;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean not = true;
        if (a.charAt(1) == a.charAt(0)) {
            if (a.charAt(2) == a.charAt(1)) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
        else {
            System.out.println("Yes");
        }
    }
}
