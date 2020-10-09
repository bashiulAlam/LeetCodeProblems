import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combination = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();

        if (candidates.length == 0)
            combination.add(tempList);
        else if (candidates.length == 1) {
            if (target == candidates[0])
                tempList.add(candidates[0]);

            combination.add(tempList);
        }
        else {
            Arrays.sort(candidates);
            
        }

        return combination;
    }
}
