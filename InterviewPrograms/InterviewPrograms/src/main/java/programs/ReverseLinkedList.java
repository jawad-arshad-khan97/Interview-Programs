package programs;



class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;

        while(curr!= null){
            temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }

        return prev;

    }

//    Step-by-Step Visualization
//    Let's take the input linked list:
//            1 -> 2 -> 3 -> 4 -> 5 -> null
//
//    Initial State:
//    prev = null
//    curr = 1 (head)
//    temp = null
//    First Iteration (Processing Node 1):
//    Save the next node: temp = curr.next → temp = 2
//    Reverse the link: curr.next = prev → 1 -> null
//    Move prev: prev = curr → prev = 1
//    Move curr: curr = temp → curr = 2
//    Linked List So Far:
//            1 -> null (Reversed portion)
//            2 -> 3 -> 4 -> 5 -> null (Remaining)
//
//    Second Iteration (Processing Node 2):
//    Save the next node: temp = curr.next → temp = 3
//    Reverse the link: curr.next = prev → 2 -> 1
//    Move prev: prev = curr → prev = 2
//    Move curr: curr = temp → curr = 3
//    Linked List So Far:
//            2 -> 1 -> null (Reversed portion)
//            3 -> 4 -> 5 -> null (Remaining)
//
//    Third Iteration (Processing Node 3):
//    Save the next node: temp = curr.next → temp = 4
//    Reverse the link: curr.next = prev → 3 -> 2
//    Move prev: prev = curr → prev = 3
//    Move curr: curr = temp → curr = 4
//    Linked List So Far:
//            3 -> 2 -> 1 -> null (Reversed portion)
//            4 -> 5 -> null (Remaining)
//
//    Fourth Iteration (Processing Node 4):
//    Save the next node: temp = curr.next → temp = 5
//    Reverse the link: curr.next = prev → 4 -> 3
//    Move prev: prev = curr → prev = 4
//    Move curr: curr = temp → curr = 5
//    Linked List So Far:
//            4 -> 3 -> 2 -> 1 -> null (Reversed portion)
//            5 -> null (Remaining)
//
//    Fifth Iteration (Processing Node 5):
//    Save the next node: temp = curr.next → temp = null
//    Reverse the link: curr.next = prev → 5 -> 4
//    Move prev: prev = curr → prev = 5
//    Move curr: curr = temp → curr = null
//    Linked List So Far:
//            5 -> 4 -> 3 -> 2 -> 1 -> null (Reversed portion)
//            null (Remaining)
//
//    Final State:
//    curr = null → The loop ends.
//            prev = 5 → prev now points to the new head of the reversed list.

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head); // Print the original list

        // Reverse the linked list
        ListNode reversedHead = reverseList(head);

        System.out.println("\nReversed List:");
        printList(reversedHead); // Print the reversed list
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
