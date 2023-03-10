/**
 * Enhanced TreeNode class typically used
 * to solve LeetCode binary tree problems.
 */
public class TreeNode {
    
    // **** class members ****
    int         val;
    int         height;

    TreeNode    left;
    TreeNode    right;


    /**
     * Constructor.
     */
    public TreeNode() {
    }

    
    /**
     * Constructor.
     */
    public TreeNode(int val) {
        this.val    = val;
        this.height = 1;
    }


    /**
     * Constructor.
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val    = val;
        this.left   = left;
        this.right  = right;
    }


    /**
     * Return a string representation of this node.
     */
    @Override
    public String toString() {
        return "(val: " + val +  
            (this.left == null ? " l: null" : this.left.val) + 
            (this.right == null ? " r: null" : this.right.val) + 
            ")";
    }
}
