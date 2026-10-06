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
    public ListNode oddEvenList(ListNode head) {

        

        ArrayList<ListNode> odd = new ArrayList<>();
        ArrayList<ListNode> even = new ArrayList<>();

        ListNode temp = head;
        int index = 1;

        
        while (temp != null) {

            if (index % 2 == 1) {
                odd.add(temp);
            } else {
                even.add(temp);
            }

            temp = temp.next;
            index++;
        }

        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (ListNode node : odd) {
            curr.next = node;
            curr = curr.next;
        }

        for (ListNode node : even) {
            curr.next = node;
            curr = curr.next;
        }

        curr.next = null;

        return dummy.next;
    }
}