package bronze.dec18;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class blist {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("blist.in"));
        int numCows =  Integer.parseInt(bf.readLine());
        int numBuckets = 0;
        int numBucketsInUse = 0;
        int[] bucketsInUse = new int[1001];
        for (int i = 1; i <= numCows; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            int bucksNeeded = Integer.parseInt(st.nextToken());
            for (int j = startTime; j <= endTime; j++) {
                bucketsInUse[j] = bucketsInUse[j] + bucksNeeded;

            }

        }
        int ans = max(bucketsInUse);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
        pw.println(ans);
        pw.close();

    }
    public static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

