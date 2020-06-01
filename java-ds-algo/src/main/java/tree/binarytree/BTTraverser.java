package tree.binarytree;

public class BTTraverser {
    /**
     * Pre-order traversal:
     * Root
     * Left subtree
     * Right subtree
     */
    public void preOrderRecursive(Node root){
        if (root != null){
            System.out.println(root.getValue());
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
        }
    }

    /**
     * Post-order traversal:
     * Left subtree
     * Right subtree
     * Root
     */
    public void postOrderRecursive(Node root){
        if (root != null){
            postOrderRecursive(root.getLeft());
            postOrderRecursive(root.getRight());
            System.out.println(root.getValue());
        }
    }

    /**
     * In-order traversal:
     * Left subtree
     * Root
     * Right subtree
     */
    public void inOrderRecursive(Node root){
        if (root != null){
            inOrderRecursive(root.getLeft());
            System.out.println(root.getValue());
            inOrderRecursive(root.getRight());
        }
    }

    //TODO: iterative versions
}
