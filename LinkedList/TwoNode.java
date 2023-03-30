package LinkedList;

public class TwoNode {
    private TwoNode previous;
    private TwoNode next;
    private Integer value;

    public TwoNode(){
        this(null);
    }

    public TwoNode(Integer value){
        this.value = value;
    }

    public TwoNode getNext() {
        return this.next;
    }

    public void setNext(TwoNode node) {
        this.next = (TwoNode) node;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public TwoNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(TwoNode node) {
        this.previous = (TwoNode) node;
    }

    @Override
    public String toString() {
        return "TwoNode{" +"value=" + value +'}';
    }
}