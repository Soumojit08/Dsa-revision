package Linkedlist;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertEnd(40);
        list.insertEnd(50);
        list.insertAtPos(35, 4);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteAtPos(3);
        list.display();
        list.deleteEnd();
        list.display();
        list.reverseLinkList();
    }
}
