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

    public Node get(int index){
        if(index == 0 || index >= length) {
            return null;
        }

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    // method to empty the list
    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    public void print(){
        // we can't override the head or tail references
        // that's why we create a temporary node
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(String data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
             tail.next = newNode;
             tail = newNode;
        }
        length++;
    }

    public void preppend(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node removeFirst(){
        if(length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        // we need to unplug the temp from our list
        temp.next = null;

        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeLast(){
        if(length == 0) {
            return null;
        }
        Node pre = head;
        // we need to store the value of the last node before remove
        Node temp = null;

        while(pre.next != tail) {
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
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
