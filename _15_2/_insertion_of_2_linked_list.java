// https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp = headA;
        ListNode tmp1 = headB;
        while(tmp1!=null){
            tmp = headA;
            while(tmp != null){
                if(tmp == tmp1){
                    return tmp;
                }
                tmp = tmp.next;
            }
            tmp1 = tmp1.next;
        }
        return null;
    }
}