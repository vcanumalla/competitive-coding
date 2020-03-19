package atcoder.abc152;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder ab = new StringBuilder();
        StringBuilder bb = new StringBuilder();

        for (int i = 0; i < b; i++) {
            ab.append(a);
        }
        for (int i = 0; i < a; i++) {
            bb.append(b);
        }
        String as = ab.toString();
        String bs = bb.toString();

        if (as.compareTo(bs) <= 0) {
            System.out.println(as);
        }
        else {
            System.out.println(bs);
        }
    }
}
