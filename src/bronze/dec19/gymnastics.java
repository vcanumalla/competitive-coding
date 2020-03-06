

package bronze.dec19;
import java.io.*;
import java.util.*;

public class gymnastics {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
        Scanner sc = new Scanner(bf.readLine());
        int numSessions = sc.nextInt();
        int numCows = sc.nextInt();
        int numPairs = 0;
        for (int i = numCows - 1; i >0; i--) {
            numPairs +=i;
        }
        ArrayList<HashSet<Integer>> bank = new ArrayList<>();
        ArrayList<Integer> base = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < numCows; i++) {
            base.add(Integer.parseInt(st.nextToken()));
        }

        for (int sessions =1; sessions < numSessions; sessions++) {

            ArrayList<Integer> newArr = new ArrayList<>();
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for (int i = 0; i < numCows; i++) {
                newArr.add(Integer.parseInt(st2.nextToken()));
            }
            for (int i = 0; i < numCows -1; i++) {
                int num1 = newArr.get(i);
                for (int j = i+1; j <numCows; j++) {

                    int num2 = newArr.get(j);
                    if (checkConsistent(base, newArr, num1, num2)) {

                    }
                    else {
                        boolean bool = false;
                        for (int k = 0; k < bank.size(); k++) {
                            if (bank.get(k).contains(num1) && bank.get(k).contains(num2)) {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool) {
                            HashSet<Integer> pair = new HashSet<>();
                            pair.add(num1);
                            pair.add(num2);
                            bank.add(pair);
                        }
                    }
                }
            }

        }
        pw.println(numPairs - bank.size());
        pw.close();

    }
    public static boolean checkConsistent(ArrayList<Integer> base, ArrayList<Integer> newArr, int i, int j) {
        if (base.indexOf(i) < base.indexOf(j) && newArr.indexOf(i) < newArr.indexOf(j)) {
            return true;
        }
        else if (base.indexOf(i) > base.indexOf(j) && newArr.indexOf(i) > newArr.indexOf(j)) {
            return true;
        }
        else {
            return false;
        }
    }

}
