/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null){
            ListNode nextStep = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextStep;
        }
        return prev;
            
        
        
    }
}