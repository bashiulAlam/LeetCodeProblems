import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        List<Integer> firstItem = new ArrayList<Integer>();
        firstItem.add(1);
        pascal.add(firstItem);
        if (numRows == 1)
            return pascal;
        else {
            firstItem.add(1);
            pascal.add(firstItem);

            for (int i = 3; i <= numRows; i++) {
                List<Integer> item = new ArrayList<Integer>();
                item.add(1);
                for (int j = 1; j <= i - 2; j++) {
                    item.add(pascal.get(pascal.size() - 1).get(j - 1) + pascal.get(pascal.size() - 1).get(j));
                }
                item.add(1);
                pascal.add(item);
            }

            return pascal;
        }
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> item = new ArrayList<Integer>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    item.add(1);
                else
                    item.add(pascal.get(pascal.size() - 1).get(j - 2) + pascal.get(pascal.size() - 1).get(j - 1));
            }
            pascal.add(item);
            System.out.println("list size after itr " + i + " : " + pascal.size());
        }

        return pascal;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(Arrays.toString(generatePascalTriangle(3).toArray()));
        System.out.println(Arrays.toString(generate(5).toArray()));
    }
}
