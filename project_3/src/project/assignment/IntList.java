package project.assignment;

import project.utils.IntListNode;

public class IntList {
    private IntListNode first;

    public IntList() {
    }

    public void add(int value) {
        // Missing check for first == null (implemented as check with return in solution)
        IntListNode temp = first;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new IntListNode(value));
    }

    public int size() {
        // Missing check for first == null (implemented as wrapping in solution)
        int i = 1;
        IntListNode temp = first;
        while (temp.getNext() != null) {
            i++;
            temp = temp.getNext();
        }
        return i;
    }

    public int get(int index) {
        if (index < 0)
            return -1;
        if (first == null)
            return -1;
        IntListNode temp = first;
        while (temp.getNext() != null) {
            if (index == 0)
                return temp.getValue();
            temp = temp.getNext();
            index--;
        }
        if (index == 0)
            return temp.getValue();
        return -1;
    }
}
