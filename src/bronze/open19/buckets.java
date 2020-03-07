import java.util.*;
import java.io.*;
import java.lang.*;
public class buckets {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("buckets.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out")));
        int xCoordB = 100;
        int xCoordR = 100;
        int xCoordL = 100;
        int yCoordB = 100;
        int yCoordR = 100;
        int yCoordL = 100;
        for (int i =1; i <= 10; i++) {

            String str = bf.readLine();
            char[] line = str.toCharArray();
            for (int j = 1; j <= 10; j++) {
                if (line[j-1] == 66) { //B
                    xCoordB = j;
                    yCoordB = i;
                }
                if (line[j-1] == 82) { //R
                    xCoordR = j;
                    yCoordR = i;
                }
                if (line[j-1] == 76) { //L
                    xCoordL = j;
                    yCoordL = i;
                }
            }
        }
        int deltaX = java.lang.Math.abs(xCoordB - xCoordL);
        int deltaY = java.lang.Math.abs(yCoordB - yCoordL);
        int min = deltaX + deltaY -1;
        if (xCoordB == xCoordL) {
            if (xCoordR == xCoordL) {
                if (yCoordB < yCoordR && yCoordR < yCoordL) {
                    min += 2;
                }
                else if (yCoordL < yCoordR && yCoordR < yCoordB) {
                    min +=2;
                }
            }
        }
        if (yCoordB == yCoordL) {
            if (yCoordR == yCoordL) {
                if (xCoordB < xCoordR && xCoordR < xCoordL) {
                    min += 2;
                }
                else if (xCoordL < xCoordR && xCoordR < xCoordB) {
                    min +=2;
                }
            }
        }

        pw.println(min);
        pw.close();
    }

}
