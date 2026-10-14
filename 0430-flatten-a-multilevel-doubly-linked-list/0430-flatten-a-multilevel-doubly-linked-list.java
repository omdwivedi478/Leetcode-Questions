class Solution {
    public Node flatten(Node head) {
        //  Dwivedi 
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
                Node n = temp.next;
                temp.next = temp.child;
                temp.child.prev = temp;
                Node x = temp.child;
                while(x.next!=null){
                    x = x.next;
                }
                x.next = n;
                if(n!=null) n.prev=x;

            }
            temp.child = null;
            temp = temp.next;
        }
        return head;
    }
}