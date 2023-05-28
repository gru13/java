// https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next  == null){
            return head;
        }
        int len = 0;
        ListNode tmp = head;
        while(tmp!=null){
            len++;
            tmp = tmp.next;
        } 
        k = k%len;
        k = len - k;
       
        tmp = head;
        if (k==0){
            return head;
        }
        
        for(int i = 0;i<k-1;i++){
            tmp=tmp.next;
        }

        tmp.next.next = head;
        head = tmp.next;
        tmp.next = null;
        
        
        return head;
    }
}   