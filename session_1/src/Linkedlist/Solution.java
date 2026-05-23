package Linkedlist;

public class Solution {
    public static void main(String[] args) {
        Linklist l1 = new Linklist();
        Linklist l2 = new Linklist();

        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);

        l2.insertEnd(7);
        l2.insertEnd(9);
        l2.insertEnd(12);
        l2.insertEnd(37);
        l2.insertEnd(42);

        l1.mergeSortedLL(l1, l2);
    }
}
