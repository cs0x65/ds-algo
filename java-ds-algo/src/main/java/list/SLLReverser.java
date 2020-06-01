package list;

public class SLLReverser {
    // O(n)
    public Node reverseIteratively(Node start){
        if (start == null)
            return null;

        Node node = start;
        Node prev = null;
        while (node != null){
            Node next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }
        return prev;
    }

    public Node reverseRecursively(Node start) {
        if (start == null)
            return null;
        return reverseNodes(start, null);
    }

    /**
     * One small variation of this could be -
     * Instead of the recursive call - reverseNodes() returning prev node,
     * keep the prev as an instance field on this class:
     * private Node prev;
     *
     * So the return type of the method is changed to void and the calling method
     * will be updated like this:
     *
     * public Node reverseRecursively(Node start) {
     *     if (start == null)
     *         return null;
     *     reverseNodes(start, null);
     *     return prev;
     * }
     *
     * private void reverseNodes(Node current, Node prev){
     *     if (current != null){
     *         Node next = current.getNext();
     *         current.setNext(prev);
     *         prev = current;
     *         current = next;
     *         reverseNodes(current, prev);
     *     }
     *  }
     */
    private Node reverseNodes(Node current, Node prev){
        if (current != null){
            Node next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            return reverseNodes(current, prev);
        }
        return prev;
    }

    // How to reverse contents w/o manipulating pointers?
    // 1 way stack
}
