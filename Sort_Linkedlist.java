package Linkedlist_pr;

import java.util.Scanner;

class Node{
	int data;
	Node next;
}

public class Sort_Linkedlist {
	static Node head = null;
	static int size = 0; 
	static Scanner sc = new Scanner(System.in);
	
	void Add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			head  = newNode;
			size++;
		}
		else {
			Node prev = null;
			Node List = head;
			while((List!=null) && (List.data<newNode.data)) {
					prev = List;
					List = List.next;	
					
			}
			if(List == null) {
				prev.next = newNode;
				size++;
			}
			else if(prev == null) {
				head = newNode;
				newNode.next = List;
				size++;
			}
			else {
				prev.next = newNode;
				newNode.next = List;
				size++;
			}
			
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
	boolean isExist(int data) {
		if(head == null)
			return false;
		else {
			Node List = head;
			while(List!=null) {
				if(List.data == data)
					return true;
				List = List.next;
			}
		}
		return false;
		
	}

	void Delete(int data) {
		Node prev = null;
		Node List = head;
		while(List!=null && data!=List.data) {
				prev= List;
				List = List.next;	
		}
		if(List == null) {
			System.out.println(" Data not found ");
		}
		else {
		if(data == List.data) {
			if(prev == null) {
				head = List.next;
				size--;
			}
			else {
			prev.next = List.next;
			size--;
			}
		}
		}
	}
	void nth_node(int n) {
		Node List = head;
		int count;
		int total_nodes = size;
		int nth = total_nodes - (n-1);
		for(count = 1;count <nth ;count ++) {
			List = List.next;
		}
		System.out.println(List.data);
	}
	void nth_node_new(int n) {
		Node main_pointer = head;
		Node reference_pointer = head;
		int count = 0;
		if(n == 0) {
			System.out.println( n + " node is not present in the list");
			return;
		}
		if(head!=null) {
		while(reference_pointer != null) {
			reference_pointer = reference_pointer.next;
			count++;
			if(count > n) {
				main_pointer = main_pointer.next;
			}	
		}
		if(n>count) {
			System.out.println( n + " nodes are not present in the list");
		}
		
		System.out.println(main_pointer.data);
		}
		else {
			System.out.println("No List");
		}

	}
	public static void main(String[]args) {
		Sort_Linkedlist sl = new Sort_Linkedlist();
		int ch;
		while(true)

		{
			
		System.out.println("Enter choice \n 1.Add \n 2.Delete \n 3.Display \n 4.nth node from last \n 5.nth node from last(new) \n 6.Exit ");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1: System.out.println("Data to be entered");
			int data = sc.nextInt();
			if(sl.isExist(data) == false) {
				sl.Add(data);
			
		}
			break;	
		case 2: System.out.println("Data to be deleted");
				int data_d = sc.nextInt();
			sl.Delete(data_d);
				break;
		case 3: sl.Display();
				break;
		case 4:System.out.println("Data at nth node from end");
				int data_n = sc.nextInt();
				sl.nth_node(data_n);
				break;
		case 5:System.out.println("Data at nth node from end");
				int data_new = sc.nextInt();
				sl.nth_node_new(data_new);
				break;
		case 6:System.exit(0);
				break;
		default: System.out.println("Invalid choice");
				break;
		}
		
	
		
	}

}
}