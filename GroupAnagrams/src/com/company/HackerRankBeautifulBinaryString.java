package com.company;

public class HackerRankBeautifulBinaryString {
    public int beautifulBinaryString(String b) {
        int minimumMoves = 0;

        for (int i = 0; i <= b.length() - 3; i++) {
            String subStr = b.substring(i, i + 3);
            if (subStr.equals("010")) {
                System.out.println("String before change : " + b);
                minimumMoves++;
                char[] c = b.toCharArray();
                c[i + subStr.length() - 1] = '1';
                b = String.valueOf(c);
                System.out.println("changed string " + b + ", for " + subStr + " starting at index " + i);
            }
        }

        return minimumMoves;
    }
}
