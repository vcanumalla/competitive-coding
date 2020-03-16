package usaco.Training;
/*
ID: vishalc2
LANG: JAVA
TASK: palsquare
*/

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class palsquare {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("palsquare.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
        int base = Integer.parseInt(bf.readLine());
        ArrayList<String> myInts = new ArrayList<>();
        for (int i = 1; i < 300; i++) {
            int square10 = i * i;
            String squareBase = Integer.toString(square10, base);
            if (isPal(squareBase)) {
                String iBase = Integer.toString(i, base);
                out.println(iBase.toUpperCase() + " " + squareBase.toUpperCase());

            }
        }
        out.close();
    }
    public static boolean isPal(String s) {
        StringBuilder sr = new StringBuilder();
        sr.append(s);
        sr.reverse();
        String bruh = sr.toString();
        if (s.equals(bruh)) {
            return true;
        }
        return false;
    }

}
