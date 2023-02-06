package Demo;


public class Queue
{
	
		int Queue [] = new int[5];
		int front;
		int rear;
		int size;
		
		void enqueue(int data)
		{
			
		    try 
		       {
				Queue[rear] = data;
				rear++;
				size++;
		       }
		     catch (ArrayIndexOutOfBoundsException e)
		    {
		    	 System.out.println("Queue is full");
		    }
			
		}
		void show()
		{
			for (int i = 0; i < size; i++)
			{
				System.out.print(Queue[front+i]+" ");
			}
		}
		
		int dequeue()
		{
			int data = Queue[front];
			try {
				  front ++;
				  size --;
			  }
			catch(Exception e)
			{
				System.out.println("Queue is Empty");
			}
			
			return data;
			
		}
		 int getsize()
		 {
			 return size;
		 }
		 boolean isEmpty()
		 {
			 return size==0;
		 }
		 boolean isFull()
		 {
			 return size==5;
		 }
		 
		 
}
	   					

			