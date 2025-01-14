package programs;

public class MiddleNodeLinkedList {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode findMiddleOfLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }
}
