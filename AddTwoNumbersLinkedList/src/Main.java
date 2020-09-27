import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        AddTwoNumbers numbers = new AddTwoNumbers();

        ListNode l1 = new ListNode();
        l1 = new ListNode(9);
        l1.next = new ListNode(8, l1.next);
        //l1.next = new ListNode(3, l1.next);

        ListNode l2 = new ListNode();
        l2 = new ListNode(1);
        //l2.next = new ListNode(6, l2.next);
        //l2.next = new ListNode(4, l2.next);

        ListNode result = numbers.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
