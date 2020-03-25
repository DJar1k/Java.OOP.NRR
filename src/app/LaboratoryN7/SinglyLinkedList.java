package app.LaboratoryN7;

// import java.util.Set;

public class SinglyLinkedList<E> { // implements Set<E> {
    private int listSize;
    private Node<E> firstNode;
    private Node<E> lastNode;

    public SinglyLinkedList() {}

    private static class Node<E> {
        private E currentItem;
        private Node<E> nextItem;

        private Node(E element) {
            this.currentItem = element;
            this.nextItem = null;
        }
    }

    public int size() { return this.listSize; }

    public void add(E element) {
        Node<E> currentNode = new Node<E>(element);

        if (this.firstNode == null) {
            this.firstNode = currentNode;
            this.lastNode = this.firstNode;
        } else {
            this.lastNode.nextItem = currentNode;
            this.lastNode = currentNode;
        }
        listSize++;
    } 

    @Override
    public String toString() {
        StringBuilder fullList = new StringBuilder("[");
        // Start with the first element of the SLL
        Node<E> startNode = this.firstNode;

        while (startNode != null) {
            if (startNode.nextItem != null) {
                fullList.append(startNode.currentItem + ", ");
                startNode = startNode.nextItem;
            } else {
                fullList.append(startNode.currentItem);
                break;
            }
        }
        return fullList + "]";
    }

    public E getElement(int index) {
        if ((index < 0) || (index >= this.listSize)) { 
            throw new IndexOutOfBoundsException(String.format("Index out of range: %s; size: %s", index, this.listSize));
        }
        Node<E> startNode = this.firstNode;

        for (int i = 0; i < index; i++) {
            startNode = startNode.nextItem;
        }
        return startNode.currentItem;
    }
}