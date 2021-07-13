/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namal
 */
import java.util.*;
class Node{
    int data;
    Node next;
}
public class LinkedList {
Node head = null;
Node tail = null;
Scanner sc = new Scanner(System.in);
void create(){
    System.out.println("enter number of nodes");
    int n = sc.nextInt();
    for(int i = 0;i <=n; i++){
        Node temp = new Node();
        temp.data = sc.nextInt();
        temp.next = null;
        if(head == null){
            head=tail=temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
}
void display(){
    if(head == null){
        System.out.println("List is empty");
    }
    else{
        Node temp;
        temp = head;
        while(temp!=null){
            System.out.println(temp.data + " is the data");
            temp = temp.next;
            
        }
    }
}

}
