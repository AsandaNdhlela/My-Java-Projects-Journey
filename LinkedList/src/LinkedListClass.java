//creating a node class and necessary attributes 
class Node{
	
	int data; //data take as an integer value
	Node next; //next node pointer 
	Node prev; //for double linked list, previous node pointer
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedListClass {
	//creating a node for a starting node and ending node 
	Node start, end;
	
	//creating a method to add data element at the beginning of the list
	public void addFirst(int data) {
		//create a node to store the data accepted
		Node newNode = new Node(data);
		//first check if the list is empty
		if(start == null) {
			//the list is empty then assign the start node and end node as the new node, since there is only one node
			start = newNode;
			end = start;
		}else {
			//in case the list is not empty, create a node to store and to place at first
			Node first = new Node(data);
			//change the first node to point the previous start node 
			first.next = start;
			//then shift the start position to be the first node 
			start = first;
		}
	}
	
	//creating a method to add data element at the end of the list
	public void addEnd(int data) {
		//create a node to store the data value
		Node newNode = new Node(data);
		//first check if the list is empty 
		if(start == null) {
			//list is empty 
			start = newNode;
			end = start;
		}else {
			//else if the list is not empty and we don't know how many element are in the list
			// clue is that the last element pointer in the list is not Null
			
			// create a temporary node to use to travel through the list
			Node temp = start;
			//create a while loop; while the temporary Node pointer is not null move to the next node 
			while(temp.next != null) {
				//changing the temporary node to the temporary pointer which points to the next node while the pointer is not null
				temp = temp.next;
			}
			//then when the condition is no longer true meaning we have reached a node with a null pointer
			//assign that pointer to the newNode 
			temp.next = newNode;
			newNode = end;
		}
	}
	
	//creating a method to add data element before end
	public void add(int data) {
		//create a node to store the data you want to add
		Node newNode = new Node(data);
		//first case check if the list is not empty, if so add the new Node as first
		if(start == null) {
			//when the list is empty
			addFirst(data);
		}else {
			//else if the list not empty, create a node and assign it to start to start traveling from the starting node
			Node current = start;
			//traveling through the list while the current node pointer to the next is not null
			while (current.next != null) {
				//updating the current node to be the next pointed by the current node pointer 
				current = current.next;
			}
			//once the loops end and when the current node pointer to the next node is null
			if(current.next == null) {
				//assign that current node to the new Node 
				current.next = newNode;
			}

		}
	}
	
	//creating a method to print all data element 
	public void print() {
		//first create a node to use to travel through the list
		Node current = start;
		//travel though the list only when the current node is not null
		while(current != null) {
			//if the current node is not null, print it and move to the next node 
			System.out.print(current.data + ", "); //printing the data of the current node 
			//updating the current node to be the next node 
			current = current.next;
		}
	}
	
	
	
	
	
	
	

}
