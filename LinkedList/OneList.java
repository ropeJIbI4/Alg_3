package LinkedList;

public class OneList {
    
    private OneNode head;

    public OneNode getHead() {
        return head;
    }

    public void setHead(OneNode node){
        this.head = node;
    }

    public void addFirst(OneNode node) {
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void addLast(OneNode node) {
        OneNode lastNode;
        if (head != null) {
            lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(node);
        } else {
            head = node;
        }
    }

    public OneNode getNode(Integer value) {
        OneNode node = head;
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
        }
    }

    public void deleteLast() {
        OneNode node = head;
        if (node!=null){
            if (node.getNext()==null){
                head=null;
            }
            while (node.getNext()!=null){
                if (node.getNext().getNext()==null){
                    node.setNext(null);
                    return;
                }
                node = node.getNext();
            }

        }

    }


}