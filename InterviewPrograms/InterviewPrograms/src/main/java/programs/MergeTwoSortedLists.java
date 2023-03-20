package programs;

import dynamicprogramming.MinimunPathSum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }


    //list A:  1-> 2-> 4
    //list B:  1-> 3-> 4
    // B1 -> A1 -> A2 -> B3 ->A1 -> B4




    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode temp = new ListNode();
            ListNode tail = temp;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                } else {
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }

            tail.next = (list1 != null) ? list1 : list2;
            return temp.next;

        }
    }

    public static void main(String args[]){
        Solution solution = new Solution();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

//        solution.mergeTwoLists()

    }
}
