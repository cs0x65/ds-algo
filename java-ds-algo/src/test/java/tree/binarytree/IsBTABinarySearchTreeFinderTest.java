package tree.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IsBTABinarySearchTreeFinderTest {
    IsBTABinarySearchTreeFinder instance;
    @Before
    public void setUp(){
        instance = new IsBTABinarySearchTreeFinder();
    }

    @Test
    public void isBSTIsTrue() {
        Node<Integer> left = new Node<>(1, null, null);
        Node<Integer> right = new Node<>(3, null, null);
        Node<Integer> root = new Node<>(2, left, right);
        assertTrue(instance.isBST(root, null));
    }
}