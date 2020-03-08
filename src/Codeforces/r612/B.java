package Codeforces.r612;

import java.util.*;

import java.util.*;
//Incomplete
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashSet<String> cardSet = new HashSet<>();
        double possible = 0;
        String[] arr = new String[1500];
        for (int i = 0; i < n -1; i++) {
            if (arr[i] == null) {
                arr[i] = sc.next();
                cardSet.add(arr[i]);
            }
            for (int j = i+1 ; j < n; j++) {
                if (arr[j] == null) {
                    arr[j] = sc.next();
                    cardSet.add(arr[j]);
                }
                String s = "";
                for (int q = 0; q  < k; q++) {
                    if (arr[i].charAt(q) == arr[j].charAt(q)) {
                        s+= arr[i].charAt(q);
                    }

                    else {
                        TreeSet<Character> pos = new TreeSet<>();
                        pos.add('S');
                        pos.add('E');
                        pos.add('T');
                        pos.remove(arr[i].charAt(q));
                        pos.remove(arr[j].charAt(q));
                        for (Character item: pos) {
                            s+= item;
                        }
                    }
                }
                System.out.println(s);
                cardSet.add(sc.next());
                if (cardSet.contains(s)) {
                    possible++;
                }
            }
        }
        System.out.println(possible/3);
//        for (int i = 0; i < n; i++) System.out.println(Arrays.toString(sets[i]));
    }
}
