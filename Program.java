
import LinkedList.*;
public class Program {
    public static void main(String[] args) {
        OneList list = new OneList();
        list.addFirst(new OneNode(1));
        list.addFirst(new OneNode(2));
        list.addFirst(new OneNode(3));
        list.addFirst(new OneNode(4));
        list.addFirst(new OneNode(5));
        list.addFirst(new OneNode(6));
        list.addFirst(new OneNode(7));
        list.addFirst(new OneNode(8));
        list.addFirst(new OneNode(9));
        list.addFirst(new OneNode(10));
        print(list);
        Reverse.OneListReverse(list);
        print(list);

        TwoList list2 = new TwoList();
        list2.addLast(new TwoNode(10));
        list2.addLast(new TwoNode(9));
        list2.addLast(new TwoNode(8));
        list2.addLast(new TwoNode(7));
        list2.addLast(new TwoNode(6));
        list2.addLast(new TwoNode(5));
        list2.addLast(new TwoNode(4));
        list2.addLast(new TwoNode(3));
        list2.addLast(new TwoNode(2));
        list2.addLast(new TwoNode(1));
        print(list2);
        Reverse.TwoListReverse(list2);
        print(list2);
    }

    public static void print(OneList list){
        OneNode node = list.getHead();
        while (node!=null){
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println("-------");
    }

    public static void print(TwoList list){
        TwoNode node = list.getHead();
        while (node!=null){
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println("-------");
    }
}