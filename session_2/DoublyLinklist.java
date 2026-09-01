public class DoublyLinklist {

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoublyLinklist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
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
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtPos(int data, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("cant insert invalid position");
            return;
        }
        if (pos == 1) {
            insertAtHead(data);
            return;
        }
        if (pos == size + 1) {
            insertAtTail(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i <= pos - 2; i++) {
            temp = temp.next;
        }
        // Needed Nodes
        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);
        // change linkl order matters
        currNode.prev = prevNode;
        prevNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;

        size++;
    }

    public void printForwardList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" X ");
    }

    public static void main(String[] args) {
        DoublyLinklist myList = new DoublyLinklist();

        myList.insertAtHead(10);
        myList.insertAtHead(5);
        myList.insertAtTail(15);
        myList.insertAtTail(20);
        myList.printForwardList();
        myList.insertAtPos(18, 4);
        myList.printForwardList();
    }
}
