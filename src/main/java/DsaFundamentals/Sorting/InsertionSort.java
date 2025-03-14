package DsaFundamentals.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 1, 55, 32, 1, 54, 3};
        System.out.println(Arrays.toString(arr));

        // sort
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int sortedSideIdx = i;
            while (sortedSideIdx > 0 && arr[sortedSideIdx - 1] > curr) {
                arr[sortedSideIdx] = arr[sortedSideIdx - 1];
                sortedSideIdx--;
            }
            arr[sortedSideIdx] = curr;
        }

        System.out.println(Arrays.toString(arr));


        System.out.println("SingleLinkedList insertion sort:");
        ListNode listNode = new ListNode(2, new ListNode(1));
        ListNode sortedListNode = insertionSortList(listNode);
        System.out.println(sortedListNode.val + " " + sortedListNode.next.val);
    }

    // InsertionSort on SingleLinkedList


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode insertionSortList(ListNode head) {
        ListNode sorted = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {

            // searching for the new node place
            ListNode sortedIterator = sorted.next;
            ListNode prevSortedIterator = sorted;
            while (sortedIterator != null && sortedIterator.val < curr.val) {
                prevSortedIterator = sortedIterator;
                sortedIterator = sortedIterator.next;
            }

            ListNode currNextSave = curr.next;

            // insertion
            prevSortedIterator.next = curr;
            curr.next = sortedIterator;

            curr = currNextSave;
        }
        return sorted.next;
    }
}
