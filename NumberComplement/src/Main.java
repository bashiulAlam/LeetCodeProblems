public class Main {

    public static int findComplement(int num) {
        StringBuilder binaryStr = new StringBuilder(Integer.toBinaryString(num));
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1')
                binaryStr.setCharAt(i, '0');
            else binaryStr.setCharAt(i, '1');
        }

        return Integer.parseInt(binaryStr.toString(), 2);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
        System.out.println(findComplement(2147483647));
    }
}
