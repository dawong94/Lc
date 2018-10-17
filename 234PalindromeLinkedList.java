class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        //always make sure if is odd =, 1-2-3 , slow is at 2
        //if it's even e.g 1-2-3-4, slow is at 3
        while (fast!= null && fast.next!= null ){
            fast = fast.next.next;
            slow = slow.next;
        }  
      
        ListNode start = head;
        ListNode mid = reverse(slow);
        
        while(mid != null){
            if(mid.val != start.val) {
                return false;
            }
            start = start.next;
            mid = mid.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr= currNext;
        }
        
        return prev;
    }
}