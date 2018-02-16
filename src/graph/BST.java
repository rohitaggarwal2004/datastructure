/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author roaggarw
 */
public class BST {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public boolean isLeftBst(int val, TreeNode n) {
        if (n == null) {
            return true;
        }
        if (val > n.val) {
            if (isLeftBst(val, n.left) && isLeftBst(val, n.right)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRightBst(int val, TreeNode n) {
        if (n == null) {
            return true;
        }
        if (val < n.val) {
            if (isLeftBst(val, n.left) && isLeftBst(val, n.right)) {
                return true;
            }
        }
        return false;
    }

    public int isValidBST(TreeNode A) {

        if (A == null) {
            return 1;
        }

        if (isLeftBst(A.val, A.left) && isRightBst(A.val, A.right)) {
            if (isValidBST(A.left) == 1 && isValidBST(A.right) == 1) {
                return 1;
            }
        }
        return 0;
    }

}
