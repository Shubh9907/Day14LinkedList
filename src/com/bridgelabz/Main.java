package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkList obj = new LinkList();
        obj.push(5);
        obj.push(7);
        obj.push(13);
        obj.push(20);
        obj.show();
        obj.sizeList();
        LinkList obj1 = new LinkList();
        obj1.append(5);
        obj1.append(7);
        obj1.append(13);
        obj1.append(20);
        obj1.show();
    }
}
