package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<List<String>>();
        List<String> emptyStrList = new ArrayList<String>();
        String currentStr = "";
        int i = 0;

        while (strs.length > 0) {
            if (!strs[i].isEmpty()) {
                List<String> item = new ArrayList<String>();
                item.add(strs[i]);
                System.out.println("item added from index : " + i + " : " + item.get(item.size() - 1));
                currentStr = strs[i];
                strs = ArrayUtils.remove(strs, i);
                //System.out.println("comparing string : " + currentStr);
                char[] currentChar = currentStr.toCharArray();
                Arrays.sort(currentChar);
                for (int j = i + 1; j < strs.length; j++) {
                    char[] c = strs[j].toCharArray();
                    Arrays.sort(c);
                    if (String.valueOf(c).equals(String.valueOf(currentChar))) {
                        item.add(strs[j]);
                        //System.out.println("item added from index : " + j + " : " + item.get(item.size() - 1));
                        //System.out.println("item size : " + item.size());
                        strs = ArrayUtils.remove(strs, j);
                    }
                }

                anagrams.add(item);
                System.out.println("anagrams size : " + anagrams.size() + " last item " + anagrams.get(anagrams.size() - 1));
            } else {
                emptyStrList.add("");
                strs = ArrayUtils.remove(strs, i);
                //System.out.println("emptyStrList size : " + emptyStrList.size());
            }

            i++;
        }

        if (emptyStrList.size() > 0)
            anagrams.add(emptyStrList);

        return anagrams;
    }
}
