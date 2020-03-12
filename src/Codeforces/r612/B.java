package Codeforces.r612;

import java.util.*;

import java.util.*;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashSet<String> cardSet= new HashSet<>();
        while (sc.hasNext()) {
            cardSet.add(sc.next());
        }
        int possible = 0;
        String[] arr = cardSet.toArray(new String[cardSet.size()]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                String s = "";
                for (int q = 0; q  < k; q++) {
                    if (arr[i].charAt(q) == arr[j].charAt(q)) {
                        s+= arr[i].charAt(q);
                    }

                    else {
                        char a = arr[i].charAt(q);
                        char b = arr[j].charAt(q);
                        if ((a == 'S' && b == 'E') || (a == 'E' && b == 'S')) {
                            s += 'T';
                        } else if ((a == 'S' && b == 'T') || (a == 'T' && b == 'S')) {
                            s += 'E';
                        } else {
                            s += 'S';
                        }
                    }
                }
                if (cardSet.contains(s)) {
                    possible++;
                }
            }
        }
        System.out.println(possible /3);
//        for (int i = 0; i < n; i++) System.out.println(Arrays.toString(sets[i]));
    }
}
