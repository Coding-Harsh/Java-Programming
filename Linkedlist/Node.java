package Linkedlist;

import java.util.Scanner;

public class Node<T> {
    
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
       
    }

    public static Node<Integer> takeInput(){

        Node<Integer> head = null, tail = null;

       Scanner scn = new Scanner(System.in);

       int data = scn.nextInt();

       while(data!=-1){

        Node<Integer>newnode = new Node<>(data);

        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{

            tail.next = newnode;
            tail = newnode;
        }

        data = scn.nextInt();
       }

       return head;
    }

    public static void print(Node<Integer> head){

        while (head != null) {
            System.out.print(head.data + " ");

            head = head.next;
        }
    }

    public static void increment(Node<Integer>head){

        Node<Integer> temp = head;
        while(temp!=null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        
        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2 = new Node<Integer>(20);
        // Node<Integer> node3 = new Node<Integer>(30);

        // System.out.println(node1.data+" "+ node1.next);

    
        // node1.next = node2;
        // node2.next = node3;

        Node<Integer> head = takeInput();
        
        increment(head);
        
        print(head);
        // System.out.println();
        // print(head);
        
    }
}

