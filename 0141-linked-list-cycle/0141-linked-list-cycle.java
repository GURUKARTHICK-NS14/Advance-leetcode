/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode sl=head;
        ListNode fas=head;
        if(fas==null){
            return false;
        }
        while(fas.next!=null && fas.next.next!=null){
            fas=fas.next.next;
            sl=sl.next;
            if(fas==sl){
                return true;
            }
        }
        return false;
    }
    
}