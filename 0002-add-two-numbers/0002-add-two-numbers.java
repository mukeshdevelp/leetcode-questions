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
   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a dummy node
        ListNode dummy = new ListNode();
        // point curr to dummy
        ListNode curr = dummy;
        // inialize carry to 0
        int carry = 0;
        // check for either of the list is null or last carry is not 0
        while(l1 != null || l2 != null || carry != 0){
            // inialize sum to current carry
            int sum = carry;
            // is l1 not empty
            if(l1 != null){
                // add the val of l1
                sum += l1.val;
                // increment the l1 ptr
                l1 = l1.next;
            }
            // is l2 not empty
            if(l2 != null){
                 // add the val of l2
                sum += l2.val;
                // increment the l2 ptr
                l2 = l2.next;
            }
            // extract the carry
            carry = sum/10;
            // inialize the next of curr with cur carry
            curr.next = new ListNode(sum % 10);
            // increment curr
            curr = curr.next;            

        }
        // return the dummy Linked list
        return dummy.next;
        
    }

   
}