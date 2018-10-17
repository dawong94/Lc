/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next== null ) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode temp = dummy;
        
        
        for(int i =0; i<= n;i++){
            temp = temp.next;
        }
        while(temp != null) {
            temp = temp.next;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
        
    
        
    }
}