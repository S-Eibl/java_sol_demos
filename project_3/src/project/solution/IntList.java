package project.solution;

import project.utils.IntListNode;

public class IntList {
    private IntListNode head;

    public IntList() {
    }

    public void add(int value) {
        if (head == null) {
            head = new IntListNode(value);
            return;
        }
        IntListNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new IntListNode(value));
    }

    public int size() {
        if (head != null) {
            int i = 1;
            IntListNode temp = head;
            while (temp.getNext() != null) {
                i++;
                temp = temp.getNext();
            }
            return i;
        } else {
            return 0;
        }
    }

    public int get(int index) {
        if (index < 0)
            return -1;
        if (head == null)
            return -1;
        IntListNode temp = head;
        while (temp.getNext() != null) {
            if (index == 0)
                return temp.getValue();
            index--;
            temp = temp.getNext();
        }
        if (index == 0)
            return temp.getValue();
        return -1;
    }
}
