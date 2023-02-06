package Demo;

import java.util.InputMismatchException;

public class Stack 
{
	    int stack [] = new int [5];
	    int top = 0;
		void push(int data)
		{
			
				try
				{
					stack[top] = data;
					top++;
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Warning : Stack is full");
				}
				
		}
		void show()
		{
			for (int i : stack) 
			{
				System.out.println(i +" ");
			}
		}
		int  pop()
		{
			
			int data = 0;

			try {
				top--;
				data = stack[top];
				stack[top]=0;
		     	}
			catch(Exception e)
			{
				System.out.println("Warning : Stack in Empty");
			}
			return data;
			
	}
		
		int  peek()
		{
		
			int data;
			data = stack[top-1];
			return data;
       }
		int size()
		{
			return top;
		}
		boolean isEmpty()
		{
			return top<=0;
		}
	
}	