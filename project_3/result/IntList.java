/*
Applied Mapping: 
*/

/*
Results:
testIntListMultipleElem(): SUCCESSFUL
testIntListOneElem(): SUCCESSFUL
testIntListEmpty(): SUCCESSFUL
IntListTest: SUCCESSFUL
JUnit Jupiter: SUCCESSFUL
*/
package project.assignment;

import project.utils.IntListNode;

public class IntList {
    private IntListNode first;

    public IntList() {
    }

    public void add(int value) {
        /*Insert start*/
        if (first == null) {
            first = new IntListNode(value);
            return;
        }
        /*Insert end*/
        IntListNode temp = first;
        while ((temp.getNext() != null)) {
            temp = temp.getNext();
        }
        temp.setNext(new IntListNode(value));
    }

    public int size() {
        /*Wrapping from solution:*/
        if (first != null) {
            int i = 1;
            IntListNode temp = first;
            while ((temp.getNext() != null)) {
                i++;
                temp = temp.getNext();
            }
            return i;
        } else {
            return 0;
        }
        /*Wrapping end*/
    }

    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        if (first == null) {
            return -1;
        }
        IntListNode temp = first;
        while ((temp.getNext() != null)) {
            if (index == 0) {
                return temp.getValue();
            }
            temp = temp.getNext();
            index--;
        }
        if (index == 0) {
            return temp.getValue();
        }
        return -1;
    }
}
