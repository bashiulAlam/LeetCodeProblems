import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static int[][] sortArray(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {

                if (entry1[1] > entry2[1])
                    return 1;
                else
                    return -1;
            }
        });

        return arr;
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        boxTypes = sortArray(boxTypes);
        int maxUnit = 0;
        /*for (int i = 0; i < boxTypes.length; i++) {
            for (int j = 0; j < boxTypes[i].length; j++)
                System.out.print(boxTypes[i][j] + " ");
            System.out.println();
        }*/

        int covered = 0;
        int row = boxTypes.length - 1;
        while (covered < truckSize && row >= 0) {
            int unitToCover = 0;
            if (boxTypes[row][0] > truckSize - covered)
                unitToCover = truckSize - covered;
            else unitToCover = boxTypes[row][0];

            maxUnit += (unitToCover * boxTypes[row][1]);
            covered += unitToCover;
            row--;
        }

        return maxUnit;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(maximumUnits(new int[][] {{1,3},{2,2},{3,1}}, 4));
        System.out.println(maximumUnits(new int[][] {{5,10},{2,5},{4,7},{3,9}}, 10));
        System.out.println(maximumUnits(new int[][] {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}}, 35));
    }
}
