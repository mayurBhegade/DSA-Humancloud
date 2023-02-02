package Demo;

import java.util.Scanner;

public class BinarySearch 
{

	static Node1 create()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		int data = sc.nextInt();
		if(data==-1)
		{
			return null;
		
		}
		    Node1 root = new Node1(data);
			System.out.println("Enter left child of "+root.data);
			root.left=create();
			System.out.println("Enter right child of "+root.data);
			root.right=create();
			
			
			return root;
	}
	
	
	static void Inorder(Node1 root)
	{
		if(root==null)
			return;
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);	
	}
	
	static void Preorder(Node1 root)
	{	
		if(root==null)
			return;
		System.out.println(root.data);
		Preorder(root.left);
		Preorder(root.right);
	}
	
	static void Postorder(Node1 root)
	{	
		if(root==null)
			return;
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data);

		
	}
	
	public static void main(String[] args)
	{
		Node1 root=create();
		Inorder(root);
		System.out.println();
		Preorder(root);
		System.out.println();
		Postorder(root);
		System.out.println();
       		
	}
	
}


class Node1
{
	Node1 left;
	Node1 right;
	int data;
	
	Node1(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	
}