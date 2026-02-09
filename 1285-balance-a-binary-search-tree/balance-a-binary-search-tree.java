/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null) return ;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

    }

    public TreeNode constructTree(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;

        }

        int mid = start + (end - start)/2;
        TreeNode newNode = new TreeNode(list.get(mid));

        newNode.left = constructTree(list, start, mid-1);
        newNode.right = constructTree(list, mid+1, end);
        return newNode; 
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        inOrder(root, list);

        return constructTree(list, 0, list.size()-1); // start=0, end = list.size()-1;
    }
}