package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

import org.apache.commons.lang3.ArrayUtils;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<List<String>>();

        Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            List<String> tempStrList = new ArrayList<String>();

            if (!anagramsMap.containsKey(key)) {
                System.out.println("adding : " + strs[i]);
                tempStrList.add(strs[i]);
                System.out.println("map put list size for new list : " + tempStrList.size());
                anagramsMap.put(key, tempStrList);
            } else {
                tempStrList = anagramsMap.get(key);
                System.out.println("adding : " + strs[i]);
                tempStrList.add(strs[i]);
                System.out.println("map put list size for existing list : " + tempStrList.size());
                anagramsMap.put(key, tempStrList);
            }
        }

        for (Map.Entry elem : anagramsMap.entrySet()) {
            List<String> tempStrList = (List<String>) elem.getValue();
            System.out.println("list size : " + tempStrList.size());
            anagrams.add(tempStrList);
            System.out.println("anagrams list size : " + anagrams.size());
        }

        return anagrams;
    }
}
