// https://leetcode.com/problems/remove-linked-list-elements/
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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null&&head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode result = new ListNode();
        ListNode tmp = head;
        ListNode res = result;
        while(tmp != null){
            if(tmp.val == val){
                System.out.println(tmp.val);
                tmp = tmp.next;
                if(tmp == null){
                    res = result;
                    while(res.next.next != null){
                        res = res.next;
                    }
                    res.next = null;
                }
                continue;
            }
            res.next = new ListNode(); 
            if(tmp.next == null){
                res.next = null;
            }
            res.val = tmp.val;
            tmp = tmp.next;
            res = res.next;
        }
        return result;

    }
}