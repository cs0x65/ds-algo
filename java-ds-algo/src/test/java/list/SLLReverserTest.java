package list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SLLReverserTest {
    private SLLReverser sllReverser;

    @Before
    public void setUp() throws Exception {
        sllReverser = new SLLReverser();
    }

    private Node buildSinglyLinkedList(int nodeCount){
        Node<Integer> start = new Node(1);
        Node<Integer> node = start;
        for (int i = 2; i <= nodeCount; i++) {
            node.setNext(new Node<Integer>(i));
            node = node.getNext();
        }
        return start;
    }

    private Integer[] traverseSinglyLinkedList(Node<Integer> start){
        Node<Integer> node = start;
        ArrayList<Integer> list = new ArrayList<>();
        while (node != null){
            list.add(node.getValue());
            node = node.getNext();
        }
        return list.toArray(new Integer[list.size()]);
    }

    private void assertSinglyLinkedListIsReversed(Node<Integer> reversedStart, Integer[] elements){
        Node<Integer> node = reversedStart;
        int i = elements.length - 1;
        for (; i >= 0 && node != null; i--, node = node.getNext()){
            assertEquals(elements[i], node.getValue());
        }
        assertEquals(-1, i);
        assertNull(node);
    }

    @Test
    public void reverseIterativelyReturnsNullWhenSLLIsEmpty() {
        Node start = sllReverser.reverseIteratively(null);
        assertNull(start);
    }

    @Test
    public void reverseIterativelyReturnsSameStartNodeWhenSLLHasOnlyASingleNode() {
        Node<Integer> start = new Node(1);
        Node node = sllReverser.reverseIteratively(start);
        assertEquals(start, node);
    }

    @Test
    public void reverseIterativelyReturnsReversedSLLWhenSLLHasMoreThanOneElement() {
        Node<Integer> start = buildSinglyLinkedList(2);
        Integer[] elements = traverseSinglyLinkedList(start);
        Node<Integer> node = sllReverser.reverseIteratively(start);
        Integer[] elementsInReverse = traverseSinglyLinkedList(node);
        System.out.println("Original SLL");
        for (Integer i : elements)
            System.out.println(i);
        System.out.println("Iteratively Reversed SLL");
        for (Integer i : elementsInReverse)
            System.out.println(i);
        assertSinglyLinkedListIsReversed(node, elements);

        start = buildSinglyLinkedList(10);
        elements = traverseSinglyLinkedList(start);
        node = sllReverser.reverseIteratively(start);
        elementsInReverse = traverseSinglyLinkedList(node);
        System.out.println("Original SLL");
        for (Integer i : elements)
            System.out.println(i);
        System.out.println("Iteratively Reversed SLL");
        for (Integer i : elementsInReverse)
            System.out.println(i);
        assertSinglyLinkedListIsReversed(node, elements);
    }

    @Test
    public void reverseRecursivelyReturnsNullWhenSLLIsEmpty() {
        Node start = sllReverser.reverseRecursively(null);
        assertNull(start);
    }

    @Test
    public void reverseRecursivelyReturnsSameStartNodeWhenSLLHasOnlyASingleNode() {
        Node<Integer> start = new Node(1);
        Node node = sllReverser.reverseRecursively(start);
        assertEquals(start, node);
    }

    @Test
    public void reverseRecursivelyReturnsReversedSLLWhenSLLHasMoreThanOneElement() {
        Node<Integer> start = buildSinglyLinkedList(2);
        Integer[] elements = traverseSinglyLinkedList(start);
        Node<Integer> node = sllReverser.reverseRecursively(start);
        Integer[] elementsInReverse = traverseSinglyLinkedList(node);
        System.out.println("Original SLL");
        for (Integer i : elements)
            System.out.println(i);
        System.out.println("Recursively Reversed SLL");
        for (Integer i : elementsInReverse)
            System.out.println(i);
        assertSinglyLinkedListIsReversed(node, elements);

        start = buildSinglyLinkedList(50);
        elements = traverseSinglyLinkedList(start);
        node = sllReverser.reverseRecursively(start);
        elementsInReverse = traverseSinglyLinkedList(node);
        System.out.println("Original SLL");
        for (Integer i : elements)
            System.out.println(i);
        System.out.println("Recursively Reversed SLL");
        for (Integer i : elementsInReverse)
            System.out.println(i);
        assertSinglyLinkedListIsReversed(node, elements);
    }
}