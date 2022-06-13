import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1)
            return triangle.get(0).get(0);
        else {
            //int min = Integer.MAX_VALUE;
            int sum = triangle.get(0).get(0);
            int index = 0;
            for (int i = 1; i < triangle.size(); i++) {
                //int size = triangle.get(i).size();
                //int minSum = Integer.MAX_VALUE;
                if (triangle.get(i).get(index) < triangle.get(i).get(index + 1))
                    sum += triangle.get(i).get(index);
                else {
                    sum += triangle.get(i).get(index + 1);
                    index++;
                }
            }

            return sum;
        }
    }

    public static int minimumTotal2(List<List<Integer>> triangle) {
        if (triangle.size() == 1)
            return triangle.get(0).get(0);
        else {
            for (int i = triangle.size() - 2; i >= 0; i--) {
                for (int j = 0; j < triangle.get(i).size(); j++) {
                    int sum = Math.min(triangle.get(i + 1).get(j) + triangle.get(i).get(j), triangle.get(i + 1).get(j + 1) + triangle.get(i).get(j));
                    triangle.get(i).set(j, sum);
                }
            }

            return triangle.get(0).get(0);
        }
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(minimumTotal(new ArrayList<List<Integer>>()));
    }
}
