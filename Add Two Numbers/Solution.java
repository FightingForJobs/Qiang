/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        int tempDigit = 0;
        int carryDigit = 0;
        
        ListNode subRes = new ListNode(0);
        ListNode tempNode = null;
        subRes.val = (l1.val + l2.val)%10;
        carryDigit = (l1.val + l2.val)/10;
        ListNode head = subRes;
        
        
        while(node1.next != null||node2.next != null){
        
            if(node1.next != null)
            {
                node1 = node1.next;
            }else
            {
                node1 = new ListNode(0);
            }
            if(node2.next != null)
            {
                node2 = node2.next;
            }else
            {
                node2 = new ListNode(0);
            }
            
            tempNode = new ListNode(0);
            tempDigit = (node1.val + node2.val + carryDigit)%10;
            carryDigit = (node1.val + node2.val + carryDigit)/10;
            
            tempNode.val = tempDigit;
            tempNode.next = null;
            
            subRes.next = tempNode;
            subRes = tempNode;
    }
    if (carryDigit != 0){
        subRes.next = new ListNode(1);
    }
    
    return head;

}
}