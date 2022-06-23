import java.util.PriorityQueue;

public class Main {

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int count = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] <= heights[i - 1])
                count++;
            else {
                int climb = heights[i] - heights[i - 1];
                if (climb >= bricks && ladders > 0) {
                    count++;
                    ladders--;
                } else if (climb <= bricks) {
                    count++;
                    bricks = bricks - climb;
                } else if (ladders == 0 && climb > bricks) break;
            }
        }
        System.out.println("remaining bricks : " + bricks + ", ladders : " + ladders);

        return count;
    }

    public static int furthestBuilding2(int[] heights, int bricks, int ladders) {
        int count = 0;
        PriorityQueue<Integer> ladderClimb = new PriorityQueue<>();
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] <= heights[i - 1])
                count++;
            else {
                ladderClimb.add(heights[i] - heights[i - 1]);
                if (ladderClimb.size() <= ladders)
                    count++;
                else {
                    bricks -= ladderClimb.poll();
                    if (bricks < 0)
                        break;

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(furthestBuilding2(new int[] {4,2,7,6,9,14,12}, 5, 1));
        System.out.println(furthestBuilding2(new int[] {4,12,2,7,3,18,20,3,19}, 10, 2));
        System.out.println(furthestBuilding2(new int[] {14,3,19,3}, 17, 0));
    }
}
