package Demo;

import java.util.Scanner;

public class BinarySearch 
{

	static Node create()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		int data = sc.nextInt();
		if(data==-1)
		{
			return null;
		
		}
		    Node root = new Node(data);
			System.out.println("Enter left child of "+root.data);
			root.left=create();
			System.out.println("Enter right child of "+root.data);
			root.right=create();
			
			
			return root;
	}
	
	
	static void Inorder(Node root)
	{
		if(root==null)
			return;
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);	
	}
	
	static void Preorder(Node root)
	{	
		if(root==null)
			return;
		System.out.println(root.data);
		Preorder(root.left);
		Preorder(root.right);
	}
	
	static void Postorder(Node root)
	{	
		if(root==null)
			return;
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data);

		
	}
	
	public static void main(String[] args)
	{
		Node root=create();
		Inorder(root);
		System.out.println();
		Preorder(root);
		System.out.println();
		Postorder(root);
		System.out.println();
       		
	}
	
	
}


class Node
{
	Node left;
	Node right;
	int data;
	
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	
}
