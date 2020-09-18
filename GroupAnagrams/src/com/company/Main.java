package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        //System.out.println(groupAnagrams.groupAnagrams(strs));
        List<List<String>> anagrams = groupAnagrams.groupAnagrams(strs);
        for (int i = 0; i < anagrams.size(); i++) {
            for (int j = 0; j < anagrams.get(i).size(); j++)
                System.out.println(anagrams.get(i).get(j));
            System.out.println();
        }
    }
}
