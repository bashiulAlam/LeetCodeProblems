import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MajorityElement majorityElement = new MajorityElement();

        List<Integer> output1 = majorityElement.majorityElement(new int[]{3, 2, 3});
        majorityElement.printelems(output1);

        List<Integer> output2 = majorityElement.majorityElement(new int[]{1, 2});
        majorityElement.printelems(output2);

        List<Integer> output3 = majorityElement.majorityElement(new int[]{1});
        majorityElement.printelems(output3);

        List<Integer> output4 = majorityElement.majorityElement(new int[]{3, 4, 3, 5, 6, 3, 2});
        majorityElement.printelems(output4);

        List<Integer> output5 = majorityElement.majorityElement(new int[]{3, 4, 2, 5, 6, 3, 2});
        majorityElement.printelems(output5);
    }
}
