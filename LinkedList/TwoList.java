package LinkedList;

public class TwoList {
    private TwoNode head;
    private TwoNode tail;

    public TwoNode getHead() {
        return head;
    }

    public TwoNode getTail() {
        return tail;
    }

    public void setHead(TwoNode node) {
        this.head = node;
    }

    public void setTail(TwoNode node) {
        this.tail = node;
    }

    public void addFirst(TwoNode node) {
        if (head != null) {
            node.setNext(head);
            node.setPrevious(null);
            head.setPrevious(node);
        } else {
            tail = node;
        }
        head = node;

    }

    public void addLast(TwoNode node) {
        if (tail != null) {
            node.setPrevious(tail);
            tail.setNext(node);
        } else {
            head = node;
        }
        tail = node;
    }

    public TwoNode getNode(Integer value) {
        TwoNode node = head;
        while (node != null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.getNext();
            head.setPrevious(null);
        }
    }

    public void deleteLast() {
        if (tail != null) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
    }

}