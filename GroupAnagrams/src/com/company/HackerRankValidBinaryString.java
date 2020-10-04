package com.company;

import java.util.ArrayList;
import java.util.List;

public class HackerRankValidBinaryString {
    public int minimumMoves(String s, int d) {
        int minimumMoves = 0;

        for (int i = 0; i <= s.length() - d; i++) {
            String subStr = s.substring(i, i + d);
            if (!subStr.contains("1")) {
                minimumMoves++;
                char[] c = s.toCharArray();
                c[i + subStr.length() - 1] = '1';
                s = String.valueOf(c);
                System.out.println("changed string " + s + ", for " + subStr);
            }
        }

        return minimumMoves;
    }

    public List<String> findSubStringOfGivenLength(String s, int d) {
        List<String> subStrs = new ArrayList<String>();

        for (int i = 0; i <= s.length() - d; i++) {
            //for (int j = i + 1; j <= d; j++)
            subStrs.add(s.substring(i, i + d));
        }

        //System.out.println("subStrs size " + subStrs.size());
        //System.out.println("subStrs " + subStrs);

        return subStrs;
    }
}
