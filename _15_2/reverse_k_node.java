// https://leetcode.com/problems/reverse-nodes-in-k-group/

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
        ListNode res = new ListNode();
        ListNode rev = res;
        ListNode tmp = head;
        int len = 0;
        while(tmp!=null){
            tmp = tmp.next;
            if(tmp==null){
                rev.next = null;
            }
            else{
                rev.next = new ListNode();
            }
            rev = rev.next;
            len++;
        }tmp = head;rev = res;

        for(int i=0;i<len/k;i++){
            int arr[] = new int[k];
            for(int p = 0;p<k;p++){
                arr[p] = tmp.val; 
                tmp = tmp.next;
            }
            for(int p = 0;p<k;p++){
                rev.val = arr[k-1-p]; 
                rev = rev.next;
            }
        }
        while(tmp != null){
            rev.val = tmp.val;
            rev = rev.next;
            tmp = tmp.next;
        }
        return res;

    }
}