package com.company;

public class HackerRankSeparateNumbers {
    public void separateNumbers(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++)  {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
