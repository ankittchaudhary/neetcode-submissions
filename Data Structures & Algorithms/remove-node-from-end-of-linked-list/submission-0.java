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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n<=0){
            return head;
        }

        ListNode temp = new ListNode(0); //create dummy node
        temp.next = head; // add it before head

        ListNode slow = temp;
        ListNode fast = temp;

        //move fast by n+1, making null come earlier by 1, making slow point one node before target
        for(int i =0; i<=n; i++){
            if(fast==null){
                return head;
            }
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        //
        ListNode target = slow.next; //target
        slow.next = target.next;
        target.next=null;

        return temp.next; //head
    }
}
