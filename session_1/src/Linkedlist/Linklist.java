package Linkedlist;

public class Linklist {

    private Node head;
    private Node tail;
    private int size;

    //when linklist initialised size zero as no elem added till now
    public Linklist() {
        this.size = 0;
    }

    //Node Structure
    private class Node {
        private int data; //private so that cant change without access
        private Node next; //private so that cant change without access

        public Node(int value) {
            this.data = value;
        }

        public Node(int value, Node next) {
            this.data = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        //when no elem in list then head and tail both null now tail point to head so that it can increase later
        if (tail == null) {
            tail = head;
        }

        size++; //increase list size
    }

    public void insertEnd(int value) {
        Node node = new Node(value);

        if (tail == null) insertFirst(value);

        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAtPos(int value, int position) {
        Node node = new Node(value);

        if (position < 0 || position > size) System.out.println("Invalid pos");
        else if (position == 1) {
            insertFirst(value);
        } else if (position == size) {
            insertEnd(value);
        } else {

            Node temp = head;

            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            //till now temp is in prev node of the taget node

            node.next = temp.next;
            //now new node points to the taget pos
            temp.next = node;
            //temp node points to node now
            size++;
        }
    }

    public void deleteFirst() {
        if (head == null) System.out.println("No elem to delete");
        int elem = head.data;

        head = head.next;
        size--;
        System.out.println("Deleted Element : " + elem);
    }

    public void deleteEnd() {
        if (head == null) System.out.println("No elem to delete");

        Node temp = head;
        //go till second last elem
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("deleted element : " + temp.next.data);
        temp.next = null; //make the sec last node null so the last elem deleted
        size--;
    }

    public void deleteAtPos(int position) {
        if (position < 0 || position > size) System.out.println("Invalid Position");
        else if(position == 1) deleteFirst();
        else if (position == size)  deleteEnd();
        else {
         Node temp = head;
         Node prev = null;
         for (int i=1; i<position;i++){
             prev = temp;
             temp = temp.next;
         }
         //delete node at pos
            System.out.println("Deleted Element : " + prev.next.data);
            prev.next = temp.next;
         size--;
        }
    }
    public Node getNode(int pos){
        Node temp = head;

        for (int i=1; i<pos; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void reverseLinkList(){
        int li = 1;
        int ri = size;

        while (li<ri){
            Node left = getNode(li);
            Node right = getNode(ri);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            li++;
            ri--;
        }
        System.out.println("\nLinkedlist data reversed");
        display();
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("End\n");

    }

    public void findLength(){
        Node temp = head;
        int counter = 1;

        while (temp.next != null){
            temp=temp.next;
            counter++;
        }
        System.out.println("Length of LL : " + counter);
    }

    public boolean searchInList(int val){
        Node temp = head;

        while (temp != null){
            if (temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void removeIndx(int idx){
        if (idx < 0 || idx > size) System.out.println("Invalid arguments");
        else if (idx==0) {
            deleteFirst();
        } else if (idx == size-1) {
            deleteEnd();
        } else {
            Node temp = head;

            for (int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
}
