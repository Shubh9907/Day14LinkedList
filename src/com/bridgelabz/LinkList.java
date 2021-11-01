package com.bridgelabz;

public class LinkList {
    Node head;
    Node tail;

    /*
    Method to push data in Linked List
    @param
     */
    public Node push(int data){
        Node newNode = new Node(data);
        if (head==null){
            this.head=newNode;
            this.tail=newNode;
        }else {
            newNode.next = head;
            this.head = newNode;
        }
        return newNode;
    }
    public void show(){
        Node temp = head;
        if (head==null){
            System.out.println("Linked List is Empty");
        }else {
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
