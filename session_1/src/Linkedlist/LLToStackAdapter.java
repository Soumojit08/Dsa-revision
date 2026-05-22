package Linkedlist;

import java.util.LinkedList;

public class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter(){
        list = new LinkedList<>();
    }

    int size() {
        return list.size();
    }

    void push(int val){
        list.addFirst(val);
    }

    int pop() {
        if (list.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }else {
            return list.removeFirst();
        }
    }

    int top() {
        if (list.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }else {
            return list.getFirst();
        }
    }

    void display(){
        for (int item : list){
            System.out.println(item);
        }
    }

}

class Sol{
    public static void main(String[] args) {
        LLToStackAdapter obj = new LLToStackAdapter();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println("Linkedlist Size : " + obj.size());
        obj.display();
        System.out.println("Deleted : " + obj.pop());
        System.out.println("Top : " + obj.top());
    }
}
