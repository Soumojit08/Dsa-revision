public class ReverseLinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public ReverseLinkedlist() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;
    }

    public void midNode() {
        Node temp = head;
        int n = 0;

        while (temp != null) {
            temp = temp.next;
            n++;
        }

        int mid = 0;
        if (n % 2 == 0) {
            // even length
            mid = (n + 1) / 2;
        } else {
            // odd length
            mid = n / 2;
        }

        for (int i = 1; i <= mid; i++) {
            temp = temp.next;
        }

        System.out.println("Mid Node : " + temp.data);
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertTail(int data) {
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

    public static void main(String[] args) {
        ReverseLinkedlist list = new ReverseLinkedlist();
        list.insertHead(100);
        list.insertHead(50);
        list.insertHead(10);
        list.insertTail(150);
        list.insertTail(200);
        list.insertTail(250);
        list.printList();
        list.reverse();
        list.printList();
    }
}