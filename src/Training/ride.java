package Training;
/*
ID: vishalc2
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.StringTokenizer;

public class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("ride.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        char[] comet = bf.readLine().toCharArray();
        char[] group = bf.readLine().toCharArray();
        int ansComet = 1;
        int ansGroup = 1;
        for (int i = 0; i < comet.length; i++) {
            ansComet *= (comet[i] - 64);
        }
        for (int i = 0; i < group.length; i++) {
            ansGroup *= (group[i] - 64);
        }
        ansGroup %= 47;
        ansComet %= 47;
        if (ansGroup == ansComet) {
            pw.println("GO");
        }
        else{
            pw.println("STAY");
        }
        pw.close();
    }
}
