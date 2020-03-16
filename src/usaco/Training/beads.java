package usaco.Training;
/*
ID: vishalc2
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.Arrays;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("beads.in"));
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        int numBeads = Integer.parseInt(bf.readLine());
        char[] beads = new char[numBeads];
        String myBeads = bf.readLine();
        for (int i = 0; i < numBeads; i++) {
            beads[i] = myBeads.charAt(i);
        }
        pw.println(maxBeads(beads));
        pw.close();

    }
    public static void checkBeads(char[] beads) {
        int max = 0;
//        for (int i = 0; i <= 0; i++) {
//            System.out.println("hi");
//            char[] left = Arrays.copyOfRange(beads, i + 1, beads.length - 1);
//            int leftSum = findPatternBack(left);
//            int rightSum = findPatternFront(beads);
//            if (leftSum + rightSum > max) {
//                max = leftSum + rightSum;
//            }
//        }
        for (int i = 1; i < beads.length - 1; i++) {
            System.out.println("Splice " + i);
            char[] splice1 = Arrays.copyOfRange(beads, i + 1, beads.length - 1);
            char[] splice2 = Arrays.copyOfRange(beads, 0, i - 1);
            char[] right = new char[beads.length];
            char[] left = new char[beads.length - 1];
            for (int j = 0; j < splice1.length; j++) {
                left[j] = splice1[j];
            }
            for (int j = 0; j < splice2.length; j++) {
                left[splice1.length + j] = splice2[j];
            }
            right[0] = beads[i];
            for (int j = 1; j <= splice1.length; j++) {
                right[j] = splice1[j-1];

            }
            for (int j = 1; j <= splice2.length; j++ ) {
                right[splice2.length + j] = splice2[j -1];
            }
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
            int num1 = findPatternBack(left);
            int num2 = findPatternFront(right);
        }
    }
    public static int findPatternBack(char[] arr) {
        int sum = 1;
        char key = arr[arr.length -1];
        for (int i =arr.length - 1; i > 0; i--) {
            if (arr[i - 1] == key || arr[i-1] == 'w') {
                sum++;
            }
            else {
                break;
            }
        }
        return sum;
    }
    public static int findPatternFront(char[] arr) {
        int sum = 1;
        char key = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] == key || arr[i-1] == 'w') {
                sum++;
            }
            else {
                break;
            }
        }
        return sum;
    }
    public static int maxBeads(char[] beads) {
        int max = 0;
        for (int i = 0; i < beads.length; i++) {
            char[] copyOfRight = Arrays.copyOfRange(beads, i+1, beads.length);
            char[] copyOfLeft = Arrays.copyOfRange(beads, 0, i);
            char[] copyOfLeft2 = Arrays.copyOfRange(beads, 0, i);
            char[] concat = new char[2 * beads.length - 1];
            int pos = 0;



            for (char element: copyOfRight) {
                concat[pos] = element;
                pos++;
            }
            for (char element: copyOfLeft) {
                concat[pos] = element;
                pos++;
            }
            concat[pos] = beads[i];
            pos++;
            for (char element: copyOfRight) {
                concat[pos] = element;
                pos++;
            }
            for (char element: copyOfLeft) {
                concat[pos] = element;
                pos++;
            }
//            System.out.println(Arrays.toString(concat));

            if (findConsec(concat) > max) max = findConsec(concat);






        }
        return max;
    }
    public static int findConsec(char[] beads) {
        int sum = 0;
        int left = 1;
        int right = 1;
        int index = (beads.length + 1) / 2 - 1;
//        System.out.println(index);
        char color = beads[index];
        for (int i = index; i > 0; i--) {

            if (beads[i-1] == color || beads[i-1] == 'w') {
                left++;
            }
            else break;
        }
//        System.out.println("left");

//        System.out.println(left);
        color = beads[index + 1];
        for (int i = index + 1; i < beads.length - 1; i++) {

//            System.out.println(color);
            if (beads[i+1] == color || beads[i+1] == 'w') {
                right++;
            }
            else break;
        }
//        System.out.println(right);
        sum = right + left;
//        System.out.println(sum);
        return sum;

    }
}

/*w w r  r b r w w b*/
