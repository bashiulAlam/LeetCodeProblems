package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        //String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs = new String[] {"", ""};

        List<List<String>> anagrams = groupAnagrams.groupAnagrams(strs);
        for (int i = 0; i < anagrams.size(); i++) {
            for (int j = 0; j < anagrams.get(i).size(); j++)
                System.out.println(" item : " + anagrams.get(i).get(j));
            System.out.println();
        }

        /*HackerRankValidBinaryString validBinaryString = new HackerRankValidBinaryString();
        System.out.println(validBinaryString.minimumMoves("00011111", 2));*/

        /*HackerRankBeautifulBinaryString beautifulBinaryString = new HackerRankBeautifulBinaryString();
        System.out.println(beautifulBinaryString.beautifulBinaryString("0100101010"));*/

        /*HackerRankSeparateNumbers separateNumbers = new HackerRankSeparateNumbers();
        separateNumbers.separateNumbers("99100");*/
    }
}
