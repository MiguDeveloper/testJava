package pe.tuna.eda;

public class Stack {

    public class Node {
        int data;
        Node next;
    }

    ;

    private Node head;

    public Stack() {
        head = null;
    }

    // Agregamos un elemento a la lista tipo pila
    private void push(int item) {
        Node nodeNew = new Node();
        nodeNew.data = item;

        if (head == null) {
            head = nodeNew;
            head.next = null;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
    }

    // Quitamos un elemento de la pila
    private void pop() {

    }

    // Imprimimos los elementos de la pila
    private void print() {
        Node node = new Node();
        node = head;
        while (node!=null) {
            System.out.println(node.data + "|");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push(3);
        pila.push(4);
        pila.print();
    }
}
