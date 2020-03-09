//package bronze.jan19;

import java.io.*;
import java.util.*;
public class shell {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader bf = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
        int max = 0;
        int lines = Integer.parseInt(bf.readLine());
        bf.mark((100000000) + 1);

        for (int i =0; i <= 2; i++) { //i is place of pebble for each possible orientation
            int[] shells = {0, 0, 0};
            shells[i] = 1;
            int tally = 0;
            for (int j = 1; j <= lines; j++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken()) -1;
                int b  = Integer.parseInt(st.nextToken()) - 1;
                int g = Integer.parseInt(st.nextToken());
                int temp = shells[a];
                shells[a] = shells[b];
                shells[b] = temp;

                if (shells[g-1] == 1) {
                    tally++;


                }

            }
            if (tally > max) {
                max = tally;

            }

            bf.reset();
        }
        pw.println(max);
        pw.close();


    }
}
