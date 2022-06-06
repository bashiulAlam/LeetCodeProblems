import java.util.*;

public class Main {

    public static int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        HashMap<Double, ArrayList<Integer>> distanceMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            System.out.println("distance of " + points[i][0] + " " + points[i][1] + " " + (points[i][0] * points[i][0] + points[i][1] * points[i][1]));
            double distance = Math.sqrt((points[i][0] * points[i][0]) + (points[i][1] * points[i][1]));
            if (distanceMap.containsKey(distance)) {
                ArrayList<Integer> tempList = distanceMap.get(distance);
                tempList.add(i);
                distanceMap.put(distance, tempList);
            } else {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(i);
                distanceMap.put(distance, tempList);
            }
        }

        System.out.println("HashMap before sorting by keys in ascending order ");
        for(Map.Entry<Double, ArrayList<Integer>> mapping : distanceMap.entrySet()){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

        TreeMap<Double, ArrayList<Integer>> sorted = new TreeMap<>(distanceMap);
        Set<Map.Entry<Double, ArrayList<Integer>>> mappings = sorted.entrySet();

        System.out.println("HashMap after sorting by keys in ascending order ");
        for(Map.Entry<Double, ArrayList<Integer>> mapping : mappings){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

        int index = 0;
        for (Map.Entry<Double, ArrayList<Integer>> e : mappings) {
            ArrayList<Integer> indexList = e.getValue();
            for (int i : indexList) {
                result[index][0] = points[i][0];
                result[index][1] = points[i][1];
                index++;

                if (index >= k)
                    break;
            }
            if (index >= k)
                break;
        }

        return result;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void print(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // write your code here
        print(kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
//        print(kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2));
        //print(kClosest(new int[][]{{0, 1}, {1, 0}}, 2));
    }
}
