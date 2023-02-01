package Demo;


public class Stack 
{
	    int stack [] = new int [5];
	    int top = 0;
		void push(int data)
		{
			if (top==5)
			{
				System.out.println("Stack is full");
			}
			else
			{
				stack[top] = data;
				top++;
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

			if(isEmpty())
			{
				System.out.println("stack is Empty");
			}
			else
			{
			top--;
			data = stack[top];
			stack[top]=0;
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