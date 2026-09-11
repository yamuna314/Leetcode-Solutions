class Linkedlist{
    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode temp = head;

        // Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Go to middle
        temp = head;

        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }

        return temp;
    }
}