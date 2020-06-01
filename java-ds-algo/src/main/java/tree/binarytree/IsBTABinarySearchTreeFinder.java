package tree.binarytree;

public class IsBTABinarySearchTreeFinder {
//    private Integer lastValue;

//    public boolean isBST(Node<Integer> node){
//        if (node == null)
//            return true;
//
//        if (isBST(node.getLeft())){
//            int value = node.getValue();
//            if (lastValue == null)
//                lastValue = value;
//            if (value < lastValue)
//                return false;
//            lastValue = value;
//            return isBST(node.getRight());
//        }
//        return false;
//    }

    public boolean isBST(Node<Integer> node, Integer lastValue){
        if (node == null)
            return true;

        if (isBST(node.getLeft(), lastValue)){
            int value = node.getValue();
            if (lastValue == null)
                lastValue = value;
            if (value < lastValue)
                return false;
            lastValue = value;
            return isBST(node.getRight(), lastValue);
        }
        return false;
    }
}
