import com.sun.xml.internal.ws.util.StringUtils;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      StringBuilder firstListStr = new StringBuilder();
      StringBuilder secondListStr = new StringBuilder();

      while (l1 != null) {
        //System.out.println("l1 val : " + l1.val);
        firstListStr.append(l1.val);
        l1 = l1.next;
      }

      while (l2 != null) {
        //System.out.println("l2 val : " + l2.val);
        secondListStr.append(l2.val);
        l2 = l2.next;
      }

      //firstListStr = firstListStr.reverse();
      //secondListStr = secondListStr.reverse();
      System.out.println("first list reversed : " + firstListStr);
      System.out.println("second list reversed : " + secondListStr);

      int firstLength = firstListStr.length();
      int secondLength = secondListStr.length();

      if (firstLength != secondLength) {
        String zeroPadStr = "";
        for (int i = 0; i < Math.abs(firstLength - secondLength); i++)
          zeroPadStr += "0";

        if (firstLength > secondLength) {
          String tempStr = secondListStr.toString();
          secondListStr.setLength(0);
          secondListStr.append(tempStr).append(zeroPadStr);
        } else {
          String tempStr = firstListStr.toString();
          firstListStr.setLength(0);
          firstListStr.append(tempStr).append(zeroPadStr);
        }
      }

      ListNode result = new ListNode();
      ListNode temp = result;
      int sum = 0, carry = 0;
      for (int i = 0; i < firstListStr.length(); i++) {
        System.out.println("prev carry : " + carry);
        System.out.println("adding : " + firstListStr.charAt(i) + " and " + secondListStr.charAt(i));
        sum = Character.getNumericValue(firstListStr.charAt(i)) + Character.getNumericValue(secondListStr.charAt(i)) + carry;
        carry = sum / 10;
        temp.next = new ListNode(sum % 10);
        temp = temp.next;
        //System.out.println("sum : " + sum + " next carry : " + carry);
      }

      if (carry != 0)
        temp.next = new ListNode(carry);

      return result.next;
    }
}
