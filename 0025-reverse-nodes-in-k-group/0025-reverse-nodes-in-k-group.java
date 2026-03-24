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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        i = 0;
        int j = k - 1;
        int curr = j;
        while (i < len && j < len) {
            while (i < j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }

            i = curr + 1;
            j = i + k - 1;
            curr = j;
        }
        head = new ListNode(arr[0]);
        i = 1;
        temp = head;
        while (i < len) {
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp = temp.next;
            i++;
        }
        return head;
    }
}