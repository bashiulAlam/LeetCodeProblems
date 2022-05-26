import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int calPoints(String[] ops) {
        List<Integer> points = new ArrayList<Integer>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].matches("-?\\d+(\\.\\d+)?"))
                points.add(Integer.parseInt(ops[i]));
            else if (ops[i].equals("+"))
                points.add(points.get(points.size() - 1) + points.get(points.size() - 2));
            else if (ops[i].equals("D"))
                points.add(points.get(points.size() - 1) * 2);
            else points.remove(points.get(points.size() - 1));

            //System.out.println("item inserted : " + points.get(points.size() - 1));
        }

        int sum = 0;
        for (int i = 0; i < points.size(); i++)
            sum += points.get(i);

        return sum;
    }

    public static int calPoints2(String[] ops) {
        List<Integer> points = new ArrayList<Integer>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "D":
                    points.add(points.get(points.size() - 1) * 2);
                    break;
                case "C":
                    points.remove(points.get(points.size() - 1));
                    break;
                case "+":
                    points.add(points.get(points.size() - 1) + points.get(points.size() - 2));
                    break;
                default:
                    points.add(Integer.parseInt(ops[i]));
            }

            //System.out.println("item inserted : " + points.get(points.size() - 1));
        }

        int sum = 0;
        for (int i = 0; i < points.size(); i++)
            sum += points.get(i);

        return sum;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(calPoints2(new String[] {"5","2","C","D","+"}));
        System.out.println(calPoints2(new String[] {"5","-2","4","C","D","9","+","+"}));
        System.out.println(calPoints2(new String[] {"1","C"}));
    }
}
