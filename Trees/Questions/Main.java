package Trees.Questions;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
        TreeNode(int val) { 
            this.val = val; 
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
                if(currentNode.val ==  key){
                    break;
                }
        }
        return queue.peek();

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // added the root node in

        // we have to maintain a reverse
        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                if(!reverse){ // normal order
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                } else{ // reverse order
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right != null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                }
                
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    //populating next pointer
    public Node connect(Node root) {
        if(root == null){
            return null;
        }

        Node leftMost = root;
        while(leftMost.left != null){
            Node current = leftMost;
            while (current!= null) {
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

//RIGHT Side view
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();
                if(i == levelsize -1){
                    result.add(currentNode.val);
                }
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        return(
            (level(root, xx,0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
        );
    }
    TreeNode findNode(TreeNode node, int x){
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode n  = findNode(node.left, x);
        if(n != null){
            return n;
        }
        return findNode(node.right, x);
    }

    boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
        if(node == null){
            return false;
        }
        return (
            (node.left == x && node.right == y) || (node.left == y && node.right == x) 
            || isSibling(node.left, x, y) || isSibling(node.right, x, y)
        );
    }

    int level(TreeNode node, TreeNode x, int lev){
        if(node == null){
            return 0;
        }
        if(node == x){
            return lev;
        }
        int l = level(node.left, x, lev+1);
        if(l!=0){
            return l;
        }
        return level(node.right, x, lev+1);

    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null){
                continue; // means skip
            }
            if(left == null || right == null){
                return false; 
            }
            if(left.val != right.val){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    //diameter of BST
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter -1;
    }
    int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rigthHeight = height(node.right);

        int dia = leftHeight = rigthHeight + 1;
        diameter = Math.max(diameter, dia);
        return Math.max(leftHeight, rigthHeight) +1; // height of every node

    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }


    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rigthDepth = maxDepth(root.right);
        return Math.max(leftDepth, rigthDepth) +1;

    }

    public void flatten(TreeNode root) {
        if(root ==  null){
            return;
        }
        TreeNode curent = root;
        while( curent != null){
            if(curent.left != null){
                TreeNode temp = curent.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curent.right;
                curent.right = curent.left;
                curent.left = null;
            }
            curent = curent.right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);

    }
    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }
        if(high != null && node.val >= high){
            return false;
        }
        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);
        return leftTree && rightTree;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null){
            return root;
        }
        return left == null ? right : left;
    }

    int count = 0;
    public int kthsmallest(TreeNode root, int k){
        return helper(root, k).val;
    }

    public TreeNode helper(TreeNode root, int k) {
        if(root == null){
            return null;
        }

        TreeNode left = helper(root.left, k);
        if(left != null){
            return left;

        }
        count++;
        if(count == k){
            return root;
        }
         return helper(root.right, k);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length ==  0){
            return null;
        }
        int r = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == r){
                index = i;
            }
        }
        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
        return node;
    }
}
