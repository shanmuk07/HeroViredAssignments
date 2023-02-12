package pkg_09_02_23;

import java.util.Scanner;

class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListNode{
	ListNode head;
	
	
	void createNode(int data) {
		if(head == null) {
			head = new ListNode(data);
			return;
		}
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(data);
	}
	
	LinkedListNode mergeList(LinkedListNode list1, LinkedListNode list2) {
		ListNode temp = list1.head;
		while(temp.next != null) {
			temp = temp.next;
		}
			
		temp.next = list2.head;
		return list1;
	}
	
	void sortLinkedList(LinkedListNode list) {
		ListNode temp = list.head;
		ListNode current = null;
		while(temp != null) {
			current = temp.next;
			while(current != null) {
				if(current.data < temp.data) {
					int tempData = current.data;
					current.data = temp.data;
					temp.data = tempData;
				}
				current = current.next;
			}
			temp = temp.next;
		}
	}
	
	void printList() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null\n");
	}
	
}


public class MergeAndSortLinkedList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of nodes for the first linked list: ");
		int n1 = sc.nextInt();
		LinkedListNode list1 = new LinkedListNode();
		System.out.println("Enter the data to the list1: ");
		for(int i = 0; i < n1; i++) {
			int data = sc.nextInt();
			list1.createNode(data);
		}
		list1.printList();
		
		System.out.println("Enter the number of nodes for the second linked list: ");
		int n2 =sc.nextInt();
		LinkedListNode list2 = new LinkedListNode();
		System.out.println("Enter the data to the list2: ");
		for(int i = 0; i < n2; i++) {
			int data = sc.nextInt();
			list2.createNode(data);
		}
		list2.printList();
		System.out.println("Merging the two lists and sorting the merged list.... ");
		LinkedListNode list3 = new LinkedListNode();
		list3 = list3.mergeList(list1, list2);
		System.out.println("Merged list before sorting: ");
		list3.printList();
		System.out.println("Merged list after sorting: ");
		list3.sortLinkedList(list3);
		list3.printList();
		sc.close();
	}

}
