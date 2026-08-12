
class Solution {
    public ListNode reverseList(ListNode head) {
        // head -> 1 -> 2 -> 3-> 4-> 5-> null
        // 5-> 4-> 3-> 2-> 1-> head
        // set a pre ptr to null
        ListNode previous = null;
        // set the current  to head
        ListNode current = head;
        
        
        while(current != null){
            // set the nxt to current's next address
            ListNode nxt = current.next;
            // set current.next to previous
            current.next = previous;
            // set pre to curr
            previous = current;
            // set current to nxt ptr
            current = nxt;
            
        }
        
        return previous;
    }
}