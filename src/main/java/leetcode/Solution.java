package leetcode;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + temp;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                sum = l2.val + temp;
                l2 = l2.next;
            } else {
                sum = l1.val + temp;
                l1 = l1.next;
            }
            temp = sum / 10;
            list.add(sum % 10);
        }

        ListNode head = new ListNode(-1);
        ListNode ret = head;
        for (int i = 0; i < list.size(); i ++) {
            ListNode node = new ListNode(list.get(i));
            head.next = node;
            head = head.next;
        }

        return ret.next;
    }
}