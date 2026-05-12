package Linkedlist;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(1);
        list.deleteFirst();
        list.display();
    }
}
