class MinStack {
    private Node head;    
    /** initialize your data structure here. */
    public MinStack() {
                
    }
    
    public void push(int x) {
        if(head == null){
            head = new Node(x,x);
        } else{
            Node temp = new Node(x,Math.min(x,this.head.min));
            temp.next = head;
            head =temp;
            
        }
    }
    
    public void pop() {
        head = head.next;
             
                    
    }
    
    public int top() {          
        return head.val;       
        
    }
    
    public int getMin() {
        return head.min;
        
    }
    
    private class Node{
        private Node next;
        private int val;
        private int min;
        
        private Node(int val,int min){
            this.val = val;
            this.min = min;
        }    
        
    }
}

