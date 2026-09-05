public class CircularLinklist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinklist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            // circular connection
            tail.next = head;
        }

        else {
            newNode.next = head;
            head = newNode;

            tail.next = head;
        }
        size++;
    }

    public void insertTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            tail.next = head;
        }

        else {
            tail.next = newNode;
            tail = newNode;

            tail.next = head;
        }

        size++;

    }

    public void insertAtPos(int data, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            insertHead(data);
        }
        if (pos == size + 1) {
            insertTail(data);
        }

        Node temp = head;
        for (int i = 1; i <= pos - 2; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        size++;

    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("Back to head");
    }

    public void deleteHead() {

    }

    public void deletetail() {

    }

    public void deleteAtPos(int pos) {

    }

    public static void main(String[] args) {
        CircularLinklist myList = new CircularLinklist();
        myList.insertHead(10);
        myList.insertHead(5);
        myList.insertTail(20);
        myList.insertAtPos(15, 3);
        System.out.println("Size : " + myList.getSize());
        myList.printList();
        // myList.deleteHead();
        // myList.deletetail();
        // myList.printList();
        // myList.insertTail(200);
        // myList.insertTail(300);
        // myList.insertTail(400);
        // myList.deleteAtPos(5);
    }
}
