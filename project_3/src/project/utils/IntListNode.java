package project.utils;

public class IntListNode {
    private final int value;
    private IntListNode next;

    public IntListNode(int value) {
        this.value = value;
    }

    public IntListNode(int value, IntListNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public IntListNode getNext() {
        return this.next;
    }

    public void setNext(IntListNode next) {
        this.next = next;
    }
}
