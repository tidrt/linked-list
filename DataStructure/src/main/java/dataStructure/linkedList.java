package dataStructure;

public class linkedList {

    private Node head;
    private Node tail;
    private int length;

    public linkedList(String data){
        length = 1;
        //the head and tail will be and node
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if(this.head == null){
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Head: " + this.head);
        }
    }

    public void getTail(){
        if(this.tail == null){
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Tail: " + this.tail);
        }
    }

    public void getLength(){
        System.out.println("Legnth: " + this.length);
    }

    // method to empty the list
    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    class Node{
        String data;
        Node next;

        // constructor where every node needs to have one value
        Node(String data){
            this.data = data;
        }
    }
}
