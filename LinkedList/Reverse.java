package LinkedList;

public class Reverse {
    public static void OneListReverse(OneList list){
        OneNode node = list.getHead();
        OneNode next = node.getNext();
        OneNode previous=null;
        while (next!=null){
            if (previous==null){
                node.setNext(null);
            } else {
                node.setNext(previous);
            }
            previous=node;
            node = next;
            next = next.getNext();
        }
        node.setNext(previous);
        list.setHead(node);
    }
    public static void TwoListReverse(TwoList list){
        TwoNode node = list.getHead();
        TwoNode next = node.getNext();
        TwoNode previous=null;
        while (next!=null){
            if (previous==null){
                node.setNext(null);

            } else {
                node.setNext(previous);
            }
            node.setPrevious(next);
            previous=node;
            node = next;
            next = next.getNext();
        }
        node.setPrevious(null);
        node.setNext(previous);
        list.setTail(list.getHead());
        list.setHead(node);
    }
}

 