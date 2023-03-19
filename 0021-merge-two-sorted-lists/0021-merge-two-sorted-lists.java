/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
              // create merged node with value 0 and a tail node innitially points to it
        ListNode merged = new ListNode(0);
        ListNode tail = merged;
             // if list 1 and 2 are not empty and ...
        while (list1 != null && list2 != null) {
            //list1 value is smaller than the value of list2
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }
        
        return merged.next;
    }
}