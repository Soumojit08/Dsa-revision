public class LinkedList {

    static class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtIndex(int data, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Insertion not possible at this position");
            return;
        }

        if (pos == 1) {
            insertAtHead(data);
        } else if (pos == size + 1) {
            insertAtTail(data);
        } else {
            Node temp = head;
            Node newNode = new Node(data);
            for (int i = 1; i <= pos - 2; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        if (head == null) {
            return null;
        }
        return head;
    }

    public Node getTail() {
        if (tail == null) {
            return null;
        }
        return tail;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("X");

    }

    public void deleteHead() {
        if (head == null || tail == null) {
            System.out.println("List empty");
            return;
        }
        head = head.next;
        size--;

        if (head == tail) {
            tail = null;
        }
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head == tail) {
            deleteHead();
            return;
        }

        Node temp = head;

        for (int i = 1; i <= size - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAtPosition(int pos) {
        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            deleteHead();
            return;
        }
        if (pos == size) {
            deleteTail();
            return;
        }

        Node temp = head;

        for (int i = 1; i <= pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.printList();
        list.deleteHead();
        list.deleteTail();
        list.printList();
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.printList();
        list.insertAtIndex(100, 2);
        list.printList();
        list.deleteHead();
        list.deleteTail();
        list.printList();
        list.insertAtIndex(30, 3);
        list.insertAtIndex(20, 2);
        list.printList();
        list.deleteAtPosition(2);
        list.printList();
    }
}