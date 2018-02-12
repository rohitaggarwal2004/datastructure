/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author roaggarw
 */
public class LevelOrderTreeTraversal {

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

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> results = new ArrayList();
        if (A == null) {
            return results;
        }
        Queue<TreeNode> q1 = new LinkedList();
        Queue<TreeNode> q2 = new LinkedList();
        q1.add(A);
        while (!q1.isEmpty() || !q2.isEmpty()) {

            ArrayList<Integer> l1 = new ArrayList();
            while (!q1.isEmpty()) {
                TreeNode n = q1.remove();
                l1.add(n.val);
                if (n.left != null) {
                    q2.add(n.left);
                }
                if (n.right != null) {
                    q2.add(n.right);
                }

            }
            if (l1.size() > 0) {
                results.add(l1);
            }

            ArrayList<Integer> l2 = new ArrayList();
            while (!q2.isEmpty()) {
                TreeNode n = q2.remove();
                l2.add(n.val);
                if (n.right != null) {
                    q1.add(n.left);
                }
                if (n.left != null) {
                    q1.add(n.right);
                }
            }

            if (l2.size() > 0) {
                results.add(l2);
            }
            l1 = null;
            l2 = null;
        }

        return results;
    }
    
}
