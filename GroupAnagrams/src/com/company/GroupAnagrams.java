package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<List<String>>();
        List<String> item = new ArrayList<String>();
        String currentStr = "";

        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].isEmpty()) {
                item.add(strs[i]);
                System.out.println("item added from index : " + i + " : " + item.get(item.size() - 1));
                currentStr = strs[i];
                strs[i] = "";
                System.out.println("comparing string : " + currentStr);
                char[] currentChar = currentStr.toCharArray();
                Arrays.sort(currentChar);
                for (int j = i + 1; j < strs.length; j++) {
                    char[] c = strs[j].toCharArray();
                    Arrays.sort(c);
                    if (String.valueOf(c).equals(String.valueOf(currentChar))) {
                        item.add(strs[j]);
                        System.out.println("item added from index : " + j + " : " + item.get(item.size() - 1));
                        System.out.println("item size : " + item.size());
                        strs[j] = "";
                    }
                }

                anagrams.add(item);
                System.out.println("anagrams size : " + anagrams.size() + " last item " + anagrams.get(anagrams.size() - 1).get(0));
                item.clear();
            }
        }

        return anagrams;
    }
}
