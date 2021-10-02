class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pointer = head;
        ListNode pointerK = head;
        while(k-- > 0) {
            pointerK = pointerK.next;
        }

        while (pointerK != null) {
            pointerK = pointerK.next;
            pointer = pointer.next;
        }

        return pointer;
    }
}
