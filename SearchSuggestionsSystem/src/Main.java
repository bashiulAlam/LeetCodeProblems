import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list = new ArrayList<>();
        if (products.length > 1)
            Arrays.sort(products);
        for (int i = 0; i < searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i + 1);
            //System.out.println("prefix : " + prefix);
            List<String> tempList = new ArrayList<>();
            for (String product : products) {
                if (product.length() >= prefix.length() && product.substring(0, i + 1).equals(prefix))
                    tempList.add(product);

                if (tempList.size() == 3)
                    break;
            }
            list.add(tempList);
        }

        return list;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(suggestedProducts(new String[] {"mobile","mouse","moneypot","monitor","mousepad"}, "mouse"));
        System.out.println(suggestedProducts(new String[] {"havana"}, "havana"));
        System.out.println(suggestedProducts(new String[] {"bags","baggage","banner","box","cloths"}, "bags"));
    }
}
