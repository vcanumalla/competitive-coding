

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class whereami {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));
        int numHouses = Integer.parseInt(bf.readLine());
        String spew = bf.readLine();
        char[] houses = new char[numHouses];
        for (int i = 0; i < numHouses; i++) {
            houses[i] = spew.charAt(i);
        }
//        System.out.println(Arrays.toString(houses));
        int size = 1;
        HashSet<String> container = new HashSet<>();
        boolean bool = true;
        while (true) {
            for (int i  =0; i <= numHouses - size; i++ ) {
                String str;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    sb.append(houses[i+j]);
                }
                str = sb.toString();
//                System.out.println(str);
                if (container.contains(str)) {
                    bool = false;
                    break;
                }
                else {
                    container.add(str);
                    bool = true;
                }

            }
//            System.out.println(container.toString());
            if (bool) {
                break;
            }
            else {
                size++;
            }
        }
        pw.println(size);
        pw.close();

    }
}
