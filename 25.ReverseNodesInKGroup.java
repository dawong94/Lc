class Solution {
    public ListNode reverseKGroup1(ListNode head, int k) {
        if(head == null || k <= 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;
        while(curr.next != null) {
            curr = reverNextK1(curr,k);
        }
        
        return dummy.next;      
        
    }
    
    
    private ListNode reverNextK1(ListNode head,int k){
        ListNode next = head; // next is not null
        for (int i = 0; i < k; i++) {
            if (next.next == null) {
                return next;
            }
            next = next.next;
        }
        // reverse
        ListNode n1 = head.next;
        ListNode prev = head, curt = n1;
        for (int i = 0; i < k-1; i++) {
            //ListNode temp = curt.next;
            //curt.next = prev;
            //prev = curt;
            //curt = temp;
            
            ListNode curtNext = curt.next;
            curt.next= curtNext.next;
            curtNext.next = prev.next;
            prev.next = curtNext;
            
        }
        
        //n1.next = curt;
        //head.next = prev;
        return n1;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k<= 1 ){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr != null) {
            curr = reverseKNext(curr,k);
        }
        return dummy.next;
        
    }
    
    public ListNode reverseKNext(ListNode head, int k) {
        ListNode next = head; // next is not null
        for (int i = 0; i < k; i++) {
            
            next = next.next;
            if (next == null) {
                return next;
            }
        }
        
        ListNode n1 = head.next;
        ListNode curt = n1;
        ListNode prev = head;
        
        for(int i = 0; i<k-1; i++) {
            ListNode curtNext = curt.next;
            curt.next = curtNext.next;
            curtNext.next = prev.next;
            prev.next = curtNext;
        }
        return n1;        
        
    }


    
    
    
}