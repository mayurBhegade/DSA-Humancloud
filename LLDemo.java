
package Demo;

public class LLDemo
{
	Node head;
	
	void Insert(int data)
	{
		Node node = new Node();
		 node.data=data;
	
    if(head==null)
	 {
		 head = node;
	 }
	 else
	 {
		 Node n = head;
		 while(n.next!=null)
		 {
			 n = n.next;
		 }
		 
		n.next = node;
	 }
		 
	}
	
	void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	void InsertAtFirst(int data)
	{
		Node node = new Node();
		 node.data=data;
		 node.next=head;
		 head = node;
	}
	
	void InsertAt(int index,int data)
	{
		Node node = new Node();
		node.data=data;
		
		if(index==0)
		{
			InsertAtFirst(data);
		}
		
		else
		{
		Node n =head;

		for(int i = 0 ; i<index-1; i++)
		{
			n = n.next;
		}
		node.next=n.next;
		n.next=node;
	   }
	}
	
	void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else 
		{
			Node n =head;
			Node n1 = null;

			for(int i = 0 ; i<index-1; i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next=n1.next;
		}
	}
	
	
	 class Node
	 {
	 	int data;
	 	Node next;
	 		
	 }
	
	
	public static void main(String[] args) {
		
		LLDemo LL = new LLDemo();
			LL.Insert(10);
			LL.Insert(20);
			LL.Insert(30);
			LL.Insert(40);
		
			LL.show();

			
	}
}