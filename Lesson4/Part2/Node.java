package Lesson4.Part2;

/**
 * Created by User on 07.03.2016.
 */
public class Node {
    private Object o;
    private Node node;

    public Node() {
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }
}
