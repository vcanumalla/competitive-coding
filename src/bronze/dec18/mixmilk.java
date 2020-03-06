

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class mixmilk {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("mixmilk.in"));
        int[][] buckets = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            buckets[i][0] = Integer.parseInt(st.nextToken());
            buckets[i][1] = Integer.parseInt(st.nextToken());
        }

        int tick = 0;

        while (tick <= 99) {
            for (int i = 0; i <= 2; i++) {
                tick++;
                if (tick == 100) {
                    break;
                }
                if (i < 2) {
                    pour(buckets[i], buckets[i + 1]);



                } else {
                    pour(buckets[i], buckets[i - 2]);


                }

            }
        }
        pour(buckets[0], buckets[1]);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));


        pw.println(buckets[0][1]);
        pw.println(buckets[1][1]);
        pw.println(buckets[2][1]);
        pw.close();

    }
    public static void pour(int[] buck1, int[] buck2) {
        if (buck1[1] + buck2[1] <= buck2[0]) {
            buck2[1] = buck1[1] + buck2[1];
            buck1[1] =0;
        }
        else {
            buck1[1] = buck1[1] - (buck2[0] - buck2[1]);
            buck2[1] = buck2[0];
        }
    }

}
