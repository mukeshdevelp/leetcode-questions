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
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return  head;
        ListNode middleNode= middle(head);
        ListNode right=middleNode.next;
        middleNode.next=null;
        ListNode left = head;
        left = sortList(left);
        right= sortList(right);
        return MergeList(left,right);
    }
    public ListNode middle(ListNode head ){
        // if(head==null || head.next == null) return head;
        ListNode slow=head ;
        ListNode fast=head ;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    // Function to merge two sorted singly linked lists
    static ListNode merge(ListNode first, ListNode second) {
      
        // If either list is empty, return the other list
        if (first == null) return second;
        if (second == null) return first;

        // Pick the smaller value between first and second nodes
        if (first.val < second.val) {
          
            // Recursively merge the rest of the lists and
            // link the result to the current node
            first.next = merge(first.next, second);
            return first;
        }
        else {
            // Recursively merge the rest of the lists
            // and link the result to the current node
            second.next = merge(first, second.next);
            return second;
        }
    }

    // Function to perform merge sort on a singly linked list
    
    public ListNode MergeList(ListNode head1, ListNode head2){
    if(head1==null || head2 == null) return null;

        ListNode head = new ListNode (-1);
        ListNode temp = head ;
        while(head1!=null && head2 !=null){
            if(head1.val<head2.val){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        if(head1!=null){
            temp.next=head1;
        }
        if(head2!=null){
            temp.next=head2;
        }
        return head.next;
    }
}