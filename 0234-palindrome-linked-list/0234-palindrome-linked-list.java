
class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean isPalindrome = false;
        if(isEmpty(head)){
            isPalindrome =  true;
        }

        // create a stack
        Stack<Integer> stack = new Stack<>();
        // create a ptr for the linked list
        ListNode ptr = head;
        // push the values in the stack
        while(ptr != null){
            stack.push(ptr.val);
            ptr = ptr.next;
        }
        // now check for the palindrome
        int size = stack.size();
        for(int i = 0; i <= (size-1)/2; i++){
            if(stack.get(i) != stack.pop()){
                isPalindrome =  false;
                break;
            }else{
                isPalindrome = true;
            }

          
        }

        return isPalindrome;
    }

    public boolean isEmpty(ListNode head){
        if(head == null){
            return true;
        }
        return false;
    }
}