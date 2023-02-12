package pkg_09_02_23;

import java.util.HashMap;
import java.util.Scanner;

class CreateNode{
	int data;
	CreateNode next;
	CreateNode(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListCreation{
	CreateNode head;
	
	void addNode(int data) {
		if(head == null) {
			head = new CreateNode(data);
			return;
		}
		CreateNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new CreateNode(data);
	}
	
	void printList() {
		CreateNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null\n");
	}
}

public class RemoveRepeatedElementsInLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes for the linked list: ");
		int n = sc.nextInt();
		LinkedListCreation list = new LinkedListCreation();
		System.out.println("Enter the data to the list: ");
		for(int i = 0; i < n; i++) {
			int data = sc.nextInt();
			list.addNode(data);
		}
		list.printList();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		LinkedListCreation list1 = new LinkedListCreation();
		CreateNode temp = list.head;
		while(temp != null) {
			if(hm.containsKey(temp.data)) {
				temp = temp.next;
			}else {
				hm.put(temp.data, 1);
				list1.addNode(temp.data);
				temp = temp.next;
			}
		}
		list1.printList();
		sc.close();
	}

}
