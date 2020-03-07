//package bronze.feb20;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class triangles {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
        int max = 0;
        int numPairs = Integer.parseInt(bf.readLine());
        int[][] pairs = new int[numPairs][2];
        for (int i = 0; i < numPairs; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            pairs[i][0] = Integer.parseInt(st.nextToken());
            pairs[i][1] = Integer.parseInt(st.nextToken());

        }
//        for(int i = 0; i < numPairs; i++) {
//            System.out.println(Arrays.toString(pairs[i]));
//        }
        for (int i = 0; i < numPairs; i++) {
            for (int j = i+1; j < numPairs; j++ ) {
                for (int k = j+1;k < numPairs; k++) {
                    int x1 = pairs[i][0];
                    int x2 = pairs[j][0];
                    int x3 = pairs[k][0];
                    int y1 = pairs[i][1];
                    int y2 = pairs[j][1];
                    int y3 = pairs[k][1];
                    double area = .5 * ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
                    double absArea = 2 * Math.abs(area);
                    boolean axisPX = false;
                    boolean axisPY = false;
                    if (y2 - y1 == 0 || y3 - y1 == 0 || y3 - y2 == 0) {
                        axisPX = true;
                    }
                    if (x3 - x1 == 0 ||x2 - x1 == 0 || x3 - x2 == 0) {
                        axisPY = true;
                    }
                    if (absArea > max && axisPX && axisPY) {
                        max = (int) (absArea);
                    }
                }
            }
        }
        pw.println(max);
        pw.close();
    }

}
