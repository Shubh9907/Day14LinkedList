package com.bridgelabz;

public class LinkList {
    Node head;
    Node tail;

    /*
    Method to push data in Linked List
    @param data
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
    /*
    Method to append data in a Linked List
    @param data
     */
    public Node append(int data){
        Node newNode = new Node(data);
        if (head==null){
            this.head=newNode;
            this.tail=newNode;
        }else {
            tail.next=newNode;
            this.tail=newNode;
        }
        return newNode;
    }
    // Method to get the size of the Linked List
    public int sizeList(){
        Node temp = head;
        int length=0;
        if (head==null){
            System.out.println("The Linked List is empty");
        }else {
            while (temp!=null){
                length++;
                temp=temp.next;
            }
        }
        return length;
    }
    //Method to Pop from a Linked List
    public Node pop(){
        Node temp = head;
        if (head==null){
            System.out.println("The List is empty");
        }else {
            head=head.next;
        }
        return temp;
    }
    /*
    Method to Print all the data in a Linked List
     */
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
