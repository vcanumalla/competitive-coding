package Training;
/*
ID: vishalc2
LANG: JAVA
TASK: namenum
*/
//package Training;
import java.io.*;
import java.util.*;

public class namenum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("namenum.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
        BufferedReader dict = new BufferedReader(new FileReader("dict.txt"));
        ArrayList<String> names = new ArrayList<>();
        String s;
        String stream = bf.readLine();
        while ((s = dict.readLine()) != null) {
            if (s.length() == stream.length()) {
                names.add(s);
            }
        }
        int[] num = new int[stream.length()];
        StringTokenizer st = new StringTokenizer(stream);

//        System.out.println(Arrays.toString(num));
        boolean bool = false;
        for (int i = 0; i < names.size(); i++) {
            if (stream.equals(translate(names.get(i)))) {
                bool = true;
                pw.println(names.get(i));
            }
        }
        if (!bool) {
            pw.println("NONE");
        }
        pw.close();
    }
    public static String translate(String s) {
        int[] code = new int[s.length()];
        for (int i = 0; i < code.length; i++) {
            if (s.charAt(i) == 'A' | s.charAt(i) == 'B' || s.charAt(i) == 'C') {
                code[i] = 2;
            }
            else if (s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') {
                code[i] = 3;
            }
            else if (s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') {
                code[i] = 4;
            }
            else if (s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') {
                code[i] = 5;
            }
            else if (s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') {
                code[i] = 6;
            }
            else if (s.charAt(i) == 'P' || s.charAt(i) == 'R' || s.charAt(i) == 'S') {
                code[i] = 7;
            }
            else if (s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') {
                code[i] = 8;
            }
            else if (s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y') {
                code[i] = 9;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i: code) {
            sb.append(i);
        }
        String str = sb.toString();
        return str;
    }


}
