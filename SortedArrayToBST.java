import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }

    private static List<String> levelOrder(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        // LinkedList allows null values (unlike ArrayDeque)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result.add(String.valueOf(node.val));
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.add("null");
            }
        }

        // Trim trailing "null" markers to match standard LeetCode serialization
        int i = result.size() - 1;
        while (i >= 0 && result.get(i).equals("null")) {
            result.remove(i);
            i--;
        }

        return result;
    }

    public static void main(String[] args) {
        SortedArrayToBST solution = new SortedArrayToBST();

        int[] nums1 = {-10, -3, 0, 5, 9};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        TreeNode root1 = solution.sortedArrayToBST(nums1);
        System.out.println("Output:   " + levelOrder(root1));
        System.out.println("Expected: [0, -3, 9, -10, null, 5] (or equivalent balanced BST)\n");

        int[] nums2 = {1, 3};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        TreeNode root2 = solution.sortedArrayToBST(nums2);
        System.out.println("Output:   " + levelOrder(root2));
        System.out.println("Expected: [1, null, 3] or [3, 1]\n");

        int[] nums3 = {42};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        TreeNode root3 = solution.sortedArrayToBST(nums3);
        System.out.println("Output:   " + levelOrder(root3));
        System.out.println("Expected: [42]");
    }
}