package Codeforces.math;

import java.util.Scanner;

public class B463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = 0;
        int n  = Integer.parseInt(sc.next());
        int p = 0;
        int energy = 0;
        for (int i = 0; i < n; i++) {
            int next = Integer.parseInt(sc.next());
            int change = next - p;
            if (p < next) {
                cost += change - energy;
            }
            else {
                energy += change;
            }
            p = next;
        }
        System.out.println(cost);

    }
}
