import java.util.ArrayList;
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

public class BinaryTree {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, new StringBuilder(), paths);
        }
        return paths;
    }

    private void dfs(TreeNode node, StringBuilder currentPath, List<String> paths) {
        int originalLength = currentPath.length();

        currentPath.append(node.val);

        if (node.left == null && node.right == null) {
            paths.add(currentPath.toString());
        } else {
            currentPath.append("->");
            if (node.left != null) {
                dfs(node.left, currentPath, paths);
            }
            if (node.right != null) {
                dfs(node.right, currentPath, paths);
            }
        }

        currentPath.setLength(originalLength);
    }
    
    private static TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            if (index < values.length && values[index] != null) {
                current.left = new TreeNode(values[index]);
                queue.offer(current.left);
            }
            index++;

            if (index < values.length && values[index] != null) {
                current.right = new TreeNode(values[index]);
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        BinaryTree solution = new BinaryTree();

        Integer[] input1 = {1, 2, 3, null, 5};
        TreeNode root1 = buildTree(input1);
        System.out.println("Test Case 1:");
        System.out.println("Input Tree: [1, 2, 3, null, 5]");
        System.out.println("Output:     " + solution.binaryTreePaths(root1));
        System.out.println("Expected:   [\"1->2->5\", \"1->3\"]\n");

        Integer[] input2 = {1};
        TreeNode root2 = buildTree(input2);
        System.out.println("Test Case 2:");
        System.out.println("Input Tree: [1]");
        System.out.println("Output:     " + solution.binaryTreePaths(root2));
        System.out.println("Expected:   [\"1\"]\n");

        Integer[] input3 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root3 = buildTree(input3);
        System.out.println("Test Case 3:");
        System.out.println("Input Tree: [1, 2, 3, 4, 5, 6, 7]");
        System.out.println("Output:     " + solution.binaryTreePaths(root3));
        System.out.println("Expected:   [\"1->2->4\", \"1->2->5\", \"1->3->6\", \"1->3->7\"]");
    }
}