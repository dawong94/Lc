class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = dummy.next;
        
        for(int i =1; i< m; i++){
            curr = curr.next;
            pre = pre.next;
        }
        
        for(int i = 0; i< n-m; i++){
            ListNode currNext = curr.next;
            curr.next = currNext.next;
            currNext.next = pre.next;
            pre.next = currNext;
        }
        
        return dummy.next;
        
    }
            
    
}