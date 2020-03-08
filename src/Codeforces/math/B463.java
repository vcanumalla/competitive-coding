package Codeforces.math;

import java.util.Scanner;

public class B463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumps = sc.nextInt();
        int energy = 0;
        int cost = 0;
        int p = 0;
        for (int i = 0; i < jumps; i++) {

            int next = sc.nextInt();
            int change = next - p;
            if (change > energy) {
                cost += change - energy;
                energy = 0;
            }
            else {
                energy -= change;
            }

             p = next;

        }
        System.out.println(cost);
    }
}
