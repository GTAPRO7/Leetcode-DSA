class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        return ptrA;
    }

    private static ListNode[] buildLists(int[] valsA, int[] valsB, int skipA, int skipB) {
        ListNode headA = null, tailA = null;
        ListNode intersectNode = null;

        for (int i = 0; i < valsA.length; i++) {
            ListNode node = new ListNode(valsA[i]);
            if (headA == null) {
                headA = node;
            } else {
                tailA.next = node;
            }
            tailA = node;
            if (i == skipA) {
                intersectNode = node;
            }
        }

        ListNode headB = null, tailB = null;
        for (int i = 0; i < skipB; i++) {
            ListNode node = new ListNode(valsB[i]);
            if (headB == null) {
                headB = node;
            } else {
                tailB.next = node;
            }
            tailB = node;
        }

        if (intersectNode != null) {
            if (tailB == null) {
                headB = intersectNode;
            } else {
                tailB.next = intersectNode;
            }
        } else {
            for (int i = skipB; i < valsB.length; i++) {
                ListNode node = new ListNode(valsB[i]);
                if (headB == null) {
                    headB = node;
                } else {
                    tailB.next = node;
                }
                tailB = node;
            }
        }

        return new ListNode[]{headA, headB};
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();

        ListNode[] test1 = buildLists(
            new int[]{4, 1, 8, 4, 5},
            new int[]{5, 6, 1, 8, 4, 5},
            2, 3
        );
        ListNode res1 = solution.getIntersectionNode(test1[0], test1[1]);
        System.out.println("Test Case 1:");
        System.out.println("Output:   " + (res1 != null ? "Intersected at '" + res1.val + "'" : "No intersection"));
        System.out.println("Expected: Intersected at '8'\n");

        ListNode[] test2 = buildLists(
            new int[]{1, 9, 1, 2, 4},
            new int[]{3, 2, 4},
            3, 1
        );
        ListNode res2 = solution.getIntersectionNode(test2[0], test2[1]);
        System.out.println("Test Case 2:");
        System.out.println("Output:   " + (res2 != null ? "Intersected at '" + res2.val + "'" : "No intersection"));
        System.out.println("Expected: Intersected at '2'\n");

        ListNode[] test3 = buildLists(
            new int[]{2, 6, 4},
            new int[]{1, 5},
            -1, 2
        );
        ListNode res3 = solution.getIntersectionNode(test3[0], test3[1]);
        System.out.println("Test Case 3:");
        System.out.println("Output:   " + (res3 != null ? "Intersected at '" + res3.val + "'" : "No intersection"));
        System.out.println("Expected: No intersection");
    }
}