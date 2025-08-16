public class DLL{
	private Node head;
	private class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	void display(){
		Node current=head;
		if(head!=null){
			system.out.println("list is empty");
		}
		else{
			while(current!=null){
				system.out.println(current.data);
				current=current.next;
			}
			system.out.println("Null");
		}
	}
	int size(){
		int i=0;
		Node current=head;
		while(current!=null){
			current=current.next;
			i++;
		}
		return i;
		}
	void insertatfirst(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			head.prev=newnode;
			newnode.next=head;
			head=head;
		}
	}
	void insertatlast(int data){
		Node newnode=new Node(dadta);
		if(head==null){
			head=newnode;
		}
		else{
			Node current=head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=newnode;
			newnode.prev=current;
		}
	}
	void insertatpos(int data, int pos){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}
		else if(size()<pos||pos<1){
			system.out.println("Invalid size");
		else{
			int i=1;
			Node current=head;
			Node prev=head;
			while(i!=pos){
				prev=current;
				currrent=current.next;
				i++;
			}
		prev.next=newnode;
		newnode.prev=prev;
		current.prev=newnode;
		newnode.next=current;
		}
	}
}
