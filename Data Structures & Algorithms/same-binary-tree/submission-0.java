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
    int flag=0;
    public void dfs(TreeNode root1, TreeNode root2 ){
        if(root1==null && root2==null) return;
        else if((root1==null & root2!=null) || (root1!=null && root2==null)) {
            flag=1;
            return;
        }
        if(root1.val!=root2.val){
            flag=1;
            return;
        }
        if(flag==1) return;
        dfs(root1.left,root2.left);
        dfs(root1.right,root2.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
      dfs(p,q);
      if(flag==1) return false;
      return true;
        
    }
}
