package usaco.bronze.jan20;
import java.util.*;
import java.io.*;
public class photo {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("photo.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int[] stream = new int[n-1];
        for (int i = 0; i < stream.length; i++) {
            stream[i] = Integer.parseInt(st.nextToken());

        }
        String s = "ZZZ";
        for (int i = 1; i < stream[0]; i++) {
            String temp = "";
            StringBuilder sb = new StringBuilder(temp);
            sb.append(i);
            for (int j = 0; j < stream.length; j++) {
                int num = stream[j] - Character.getNumericValue(sb.toString().charAt(j));
                sb.append(Integer.toString(num));
            }
            temp = sb.toString();
            if (temp.compareTo(s) < 0 && checkRepeats(temp)) {
                s = temp;
            }

        }
        for (int i = 0; i < s.length() - 1; i++) {
            out.print(s.charAt(i) + " ");
        }
        out.print(s.charAt(s.length()-1));
        out.close();
    }
    public static boolean checkRepeats(String temp) {
        char[] arr = temp.toCharArray();
        HashSet<Character> bool = new HashSet<>();
        for (char ch: arr) {
            if (bool.add(ch) == false) {
                return false;
            }
        }
        if (bool.contains('0')) {
            return false;
        }
        return true;
    }

}
