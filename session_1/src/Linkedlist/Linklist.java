package Linkedlist;

public class Linklist {

    private Node head;
    private Node tail;
    private int size;

    //when linklist initialised size zero as no elem added till now
    public Linklist(){
        this.size = 0;
    }

    //Node Structure
    private class Node {
        private int data; //private so that cant change without access
        private Node next; //private so that cant change without access

        public Node(int value) {
            this.data = value;
        }

        public Node(int value, Node next){
            this.data = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        //when no elem in list then head and tail both null now tail point to head so that it can increase later
        if (tail == null){
            tail = head;
        }

        size++; //increase list size
    }

    public void insertEnd(int value){
        Node node = new Node(value);

        if (tail==null) insertFirst(value);

        tail.next = node;
        tail = node;

        size++;
    }

    public void deleteFirst(){
        if (head == null) System.out.println("No elem to delete");
        int elem = head.data;

        head = head.next;
        size--;
        System.out.println("Deleted Element : " + elem);
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("End");

    }
}
