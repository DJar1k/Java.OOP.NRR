package app.LaboratoryN7;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class LaboratoryN7 {
    public static void main(String[] args) {
        // SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
        // myList.add(333);
        // myList.add(666);
        // myList.add(777);
        // myList.add(111);
        // myList.add(222);
        // myList.add(0);
        // System.out.print("Singly Linked List: ");
        // System.out.print(myList.toString());
        // System.out.println();
    }
}


class Testing implements List, Set {

    public Spliterator spliterator() {
        return null;
    }
    public int size() {
        return 0;
    }
    public boolean isEmpty() {
        return false;
    }
    public boolean contains(Object o) {
        return false;
    }
    public Iterator iterator() {
        return null;
    }
    public Object[] toArray() {
        return null;
    }
    public Object[] toArray(Object[] a) {
        return null;
    }
    public boolean add(Object e) {
        return false;
    }
    public boolean remove(Object o) {
        return false;
    }
    public boolean containsAll(Collection c) {
        return false;
    }
    public boolean addAll(Collection c) {
        return false;
    }
    public boolean addAll(int index, Collection c) {
        return false;
    }
    public boolean removeAll(Collection c) {
        return false;
    }
    public void clear() { }

    public Object get(int index) {
        return null;
    }
    public Object set(int index, Object element) {
        return null;
    }
    public void add(int index, Object element) { }

    public Object remove(int index) {
        return null;
    }
    public int indexOf(Object o) {
        return 0;
    }
    public int lastIndexOf(Object o) {
        return 0;
    }
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
    public ListIterator listIterator() {
        return null;
    }
    public ListIterator listIterator(int index) {
        return null;
    }
    public boolean retainAll(Collection c) {
        return false;
    }
}