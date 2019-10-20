package Training;
/*
ID: vishalc2
LANG: JAVA
TASK: gift1
*/


import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class gift1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("gift1.in"));
        HashMap<String, Integer> people = new HashMap<>();

        int numPeople = Integer.parseInt(bf.readLine());
        String[] peopleNames = new String[numPeople];
        for (int i = 0; i < numPeople; i++) {
            String currName = bf.readLine();
            people.put(currName, 0);
            peopleNames[i] = currName;
        }
        for (int i = 1; i <= numPeople; i++) {
            String name = bf.readLine();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int amount = Integer.parseInt(st.nextToken());
            int numRecipients = Integer.parseInt(st.nextToken());
            int returnNum;
            int giftValue;
            if (numRecipients != 0) {
                returnNum = amount % numRecipients;
                giftValue = (amount - returnNum) / numRecipients;
            }
            else {
                returnNum = 0;
                giftValue = amount;
            }

            people.put(name, people.get(name) - amount + returnNum);
            for (int j = 1; j <= numRecipients; j++) {
                String nameRecipient = bf.readLine();
                people.put(nameRecipient, people.get(nameRecipient) + giftValue);
            }

        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        for (String i: peopleNames) {
            pw.println(i + " " + people.get(i));
        }
        pw.close();
    }

}