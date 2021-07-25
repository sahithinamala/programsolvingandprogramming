package Reverse_ll;
import java.util.*;


class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
public class Reverse_Linkedlist {
	static Node head = null;
	static Scanner sc = new Scanner(System.in);
	static int size = 0;
	void Add(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			head = newNode;
			size++;
		}
		else {
			newNode.next = head;
			head = newNode;
			size++;
			}
		}
	void Display() {
		if(head == null)
			System.out.println("Invalid");
		else {
			Node List = head;
			System.out.println("Data : ");
			while(List!=null) {
				System.out.println(""+ List.data +"");
				List = List.next;
			}
		}
	}
	void reverse() {
	Node List = head;
	Node prev = null;
	Node temp = null;
	while(List!=null) {
		temp = List.next;
		List.next = prev;
		prev = List;
		List = temp;
		
	}
	head = prev;
	
	}
	public static void main(String[]args) {
		Reverse_Linkedlist rl = new Reverse_Linkedlist();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Enter data");
			int data = sc.nextInt();
		rl.Add(data);
		rl.Display();
		}
		rl.reverse();
		rl.Display();
	}
}
