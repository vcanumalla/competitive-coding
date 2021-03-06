package usaco.Training;
/*
ID: vishalc2
LANG: JAVA
TASK: milk2
*/

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class milk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("milk2.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
        int numFarmers = Integer.parseInt(bf.readLine());
        int[][] times = new int[numFarmers][2];
        for (int i = 0; i <= numFarmers -1; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            times[i][0] = Integer.parseInt(st.nextToken());
            times[i][1] = Integer.parseInt(st.nextToken());
        }
        int maxGap = 0;
        int startTime = 1000000;
        int endTime = 0;
        for (int i = 0; i < numFarmers; i++) {
            if (times[i][0] < startTime) {
                startTime = times[i][0];
            }
            if (times[i][1] > endTime) {
                endTime = times[i][1];
            }
        }
        int timeInterval = endTime - startTime;
        int[] timeline = new int[timeInterval];
        for (int i = 0; i < numFarmers; i++) {
            int shift = times[i][0] - startTime;
            for (int j = shift; j < times[i][1] - startTime ; j++) {
                if (timeline[j] == 0) {
                    timeline[j] = 1;
                }
            }
        }
        pw.println(maxLength(timeline, timeInterval, 0) + " " + maxLength(timeline, timeInterval, 1));
        pw.close();
    }

    public static void printArray(int[][] times) {
        for (int i = 0; i < times.length; i++) {
            System.out.println(Arrays.toString(times[i]));
        }
    }
    public static int maxLength(int arr[], int n, int falseNum) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == falseNum) {
                count = 0;
            }
            else {
                count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }

}
