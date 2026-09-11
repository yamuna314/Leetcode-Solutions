public class PalindromeLinkedlist {
    public boolean isPalindrome(ListNode head) {
        int[] arr = new int[100000];
        int i = 0;

        while (head != null) {
            arr[i++] = head.val;
            head = head.next;
        }

        for (int j = 0; j < i / 2; j++) {
            if (arr[j] != arr[i - j - 1]) {
                return false;
            }
        }

        return true;
    }
}
