import java.util.*;

public class Main {

    public static String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < messages.length; i++) {
            int messageWordCount = messages[i].length() - messages[i].replaceAll(" ", "").length() + 1;
            if (wordMap.containsKey(senders[i]))
                wordMap.put(senders[i], wordMap.get(senders[i]) + messageWordCount);
            else wordMap.put(senders[i], messageWordCount);
        }

        int maxCount = Integer.MIN_VALUE;
        String sender = "";
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                sender = e.getKey();
            } else if (e.getValue() == maxCount) {
                if (sender.compareTo(e.getKey()) < 0)
                    sender = e.getKey();
            }
        }

        return sender;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(largestWordCount(new String[] {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"}, new String[] {"Alice","userTwo","userThree","Alice"}));
        //System.out.println(largestWordCount(new String[] {"How is leetcode for everyone","Leetcode is useful for practice"}, new String[] {"Bob","Charlie"}));
        //System.out.println(largestWordCount(new String[] {"b I j","OK N x J jt b iO N Y","Q h y CV UE Q A","Qo Qy w Aw c","oh","OA kC G V GlX","AD Z A YH Tyl","MA","sVD","a BB o g o A hf H","qu","P nAx","d e As Gd oD C RWb","kS tI Lt U eq k M A","cS e R h f gl","AX dn b w nx","nX T P B","F","Gk eGO","l y Ue nC D","o UV W P j p e Ov g","aI Xr Fs NVz","H f l","B AY vs S","rZ Ku S S pQ","f N q cP lX o x","W X X Za t","Vp a xR X J G h A Vo"}, new String[] {"kXMEHbzSid","LxSLj","HvI","rIffGg","rIffGg","RHiE","HvI","QWsD","v","QWsD","VUCp","vsp","ArRIVvhn","VUCp","RHiE","rIffGg","FzxQzXec","FzxQzXec","VUCp","VUCp","vsp","v","rDkxpR","rKsKmX","rKsKmX","HvI","LxSLj","grfeiaY"}));
    }
}