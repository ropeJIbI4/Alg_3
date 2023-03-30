package LinkedList;

public class OneNode {
    private OneNode next;
    private Integer value;

    public OneNode(){
    }

    public OneNode(Integer value){
        this.value=value;
    }
    public OneNode getNext() {
        return this.next;
    }

    public void setNext(OneNode node) {
        this.next = (OneNode) node;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +"value=" + value +'}';
    }
}