import java.util.ArrayList;
import java.util.List;

public class HackerRankBinary {
    public int binary(int n) {
        List<Integer> binary = new ArrayList<Integer>();
        while (n > 0) {
            int mod = n % 2;
            binary.add(mod);
            n /= 2;
        }
        System.out.println("size : " + binary.size());
        int max = 0;
        int count = 0;
        for (int i = 0; i < binary.size(); i++) {
            System.out.println("value at : " + i + " " + binary.get(i) + " max : " + max);
            if (binary.get(i) == 1) {
                count++;
            } else {
                if (count > max)
                    max = count;
                count = 0;
            }
        }
        if (count > max)
            max = count;

        //System.out.println(max);
        return max;
    }
}
