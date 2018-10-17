/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length ==0){
            return null;
        }
        int n = lists.length;
        return mergesort(0,n-1, lists);
        
    }
    
    public ListNode mergesort(int left, int right , ListNode[] lists){
        if (left == right){return lists[left];}
        int mid = left + (right - left)/2;
        ListNode l = mergesort(left,mid, lists);
        ListNode r = mergesort(mid+1,right,lists);
        return merge(l,r);
        
    }
    
    public ListNode merge(ListNode l ,ListNode r){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l != null && r != null) {
            if(l.val <= r.val){
                curr.next = l;
                l = l.next;
            }else {
                curr.next = r;
                r=r.next;
            }
            curr = curr.next;
 
        }
        if (l != null){curr.next = l;}
        if (r != null){curr.next = r;}
        curr.next = l == null ? r:l;
        return dummy.next;
        
    }
}