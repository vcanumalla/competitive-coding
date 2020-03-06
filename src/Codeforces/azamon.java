package Codeforces;

import java.util.Scanner;

public class azamon {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        for (int i = 1; i <= numCases; i++) {
            boolean bool = false;
            String word1 = sc.next();
            String word2 = sc.next();
            if (word2.length() != 1) {
                if (word1.charAt(0) < word2.charAt(0)) {
                    System.out.println(word1);
                } else if (word1.charAt(0) == word2.charAt(0)) {
                    for (int j = 1; j < word1.length(); j++) {
                        if (word1.charAt(j) < word1.charAt(0)) {
                            if (compare(word1.charAt(j), word2.charAt(0)) || bool == false) {
                                System.out.println(swap(word1, 0, j));
                                bool = true;
                                break;
                            }
                        }
                    }
                    if (!bool) {
                        int score;
                        if (word2.length() > 1) {
                            score = word2.charAt(0) + word2.charAt(1);
                        } else {
                            score = word2.charAt(0) + 0;
                        }
                        if (word1.charAt(0) + word1.charAt(1) < score) {
                            System.out.println(word1);
                        } else {
                            for (int j = 1; j < word1.length(); j++) {
                                if (word1.charAt(j) < word2.charAt(1)) {
                                    System.out.println(swap(word1, 1, j));
                                    bool = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!bool) {
                        System.out.println("---");
                    }
                } else {
                    for (int j = 1; j < word1.length(); j++) {
                        if (word1.charAt(j) < word2.charAt(0)) {
                            System.out.println(swap(word1, 0, j));
                            bool = true;
                            break;
                        }
                    }
                    if (!bool) {
                        System.out.println("---");
                    }
                }
            }
            else {
                if (word1.charAt(0) < word2.charAt(0)) {
                    System.out.println(word1);
                } else if (word1.charAt(0) == word2.charAt(0)) {
                    for (int j = 1; j < word1.length(); j++) {
                        if (word1.charAt(j) < word1.charAt(0)) {
                            if (compare(word1.charAt(j), word2.charAt(0)) || bool == false) {
                                System.out.println(swap(word1, 0, j));
                                bool = true;
                                break;
                            }
                        }
                    }
                    if (!bool) {
                        System.out.println("---");
                    }
                } else {
                    for (int j = 1; j < word1.length(); j++) {
                        if (word1.charAt(j) < word2.charAt(0)) {
                            System.out.println(swap(word1, 0, j));
                            bool = true;
                            break;
                        }
                    }
                    if (!bool) {
                        System.out.println("---");
                    }
                }
            }
        }

    }
    public static boolean compare(int i, int j) {
        if (i < j) {
            return true;
        }
        else {
            return false;
        }
    }
    public static char[] swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

}
