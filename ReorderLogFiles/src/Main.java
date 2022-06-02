import java.util.*;

public class Main {

    public static String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];
        ArrayList<String> stringLogs = new ArrayList<>();
        ArrayList<String> stringLogsWithoutIdentifier = new ArrayList<>();
        ArrayList<String> digitLogs = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            char firstCharAfterIdentifier = logs[i].charAt(logs[i].indexOf(' ') + 1);
            if (Character.isDigit(firstCharAfterIdentifier))
                digitLogs.add(logs[i]);
            else {
                stringLogs.add(logs[i]);
                stringLogsWithoutIdentifier.add(logs[i].substring(logs[i].indexOf(" ")));
            }
        }

        Collections.sort(stringLogs);
        Collections.sort(stringLogsWithoutIdentifier);
        for (int i = 0; i < stringLogsWithoutIdentifier.size(); i++) {
            for (int j = 0; j < stringLogs.size(); j++) {
                if (stringLogs.get(j).substring(stringLogs.get(j).indexOf(" ")).equals(stringLogsWithoutIdentifier.get(i))) {
                    stringLogsWithoutIdentifier.set(i, stringLogs.get(j));
                    stringLogs.remove(j);
                    break;
                }
            }
        }

        int i = 0;
        while (i < stringLogsWithoutIdentifier.size()) {
            result[i] = stringLogsWithoutIdentifier.get(i);
            i++;
        }
        int j = 0;
        while (j < digitLogs.size()) {
            result[i] = digitLogs.get(j);
            i++;
            j++;
        }

        return result;
    }

    public static void print(String[] logs) {
        for (int i = 0; i < logs.length; i++)
            System.out.println(logs[i]);
    }

    public static void main(String[] args) {
	// write your code here
        //print(reorderLogFiles(new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"}));
        //print(reorderLogFiles(new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"}));
        //print(reorderLogFiles(new String[] {"1 n u", "r 527", "j 893", "6 14", "6 82"}));
        //print(reorderLogFiles(new String[] {"27 85717 7", "2 y xyr fc", "52 314 99", "d 046099 0", "m azv x f", "7e apw c y", "8 hyyq z p", "6 3272401", "c otdk cl", "8 ksif m u"}));
        print(reorderLogFiles(new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"}));
    }
}
