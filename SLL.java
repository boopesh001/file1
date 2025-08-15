public class SLL {
    prinvate Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(){
            this.data=0;
            this.next=null;
        }
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
	int size(){
		int i=0;
		Node current=new Node()
		while(current!=null){
			i++;
			current=current.next;
		}
		return i;
	}
        void insertatfirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
            }
            else{
                newnode.next=head;
		head=newnode;
            }
        }
	void insertatlast(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			Node current=head;
			while(current.next!=null){
				current=current.next;
				}
			current.next=newnode;
			}
		}
	}
	void inseratpos(int data,int pos){
		Node newnode=new Node(data);
		if(pos==1){
			inseratfirst(data);
		}
		elseif(pos>size()+1||pos<1{
		return ;
		else{
			Node current=head();
			Node past=head();
			Node newnode=new Node();
			int i=1;
			while(pos!=i){
				past=current;
				current=current.next;
				i++;
			}
			past.next=newnode;
			newnode.next=current;
			}
		}
	}
	void display(){
		Node current=head();
		while(current!=null){
			system.out.println(current.data);
		}
		system.out.println("Null");
	}
	void deleteatfirst(){
		if(head==null){
			system.out.println("list is empty");
		}
		else{
			head=head.next;
		}
	}
	void deleteatlast(){
		if(head==null){
			system.out.println("list is empty");
		}
		else{
			Node current=head();
			while(current.next.next!=null){
				current=current.next;
			}
			current.next=null;
		}
	}
	void deleteatpos(int pos){
		if(head==null){
			system.out.println("list is empty");
		}
		else if(pos<1||pos>size()){
			system.out.println("Enter valid position");
		}
		else if(pos==1){
			deleteatfirst();
		}
		else{	int i=1;
			Node past =head;
			Node current=head;
			while(i!=pos){
				past=current;
				current=current.next;
				i++;
			}
			past.next=current.next;
		}
}