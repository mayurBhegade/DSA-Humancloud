package Demo;


public class Queue
{
		int Queue [] = new int[5];
		int front;
		int rear;
		int size;
		
		void enqueue(int data)
		{
			if(!isFull())
			{
				Queue[rear] = data;
				rear++;
				size++;
			}
			else
			{
				System.out.println("Queue is full...");
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
			if(isEmpty())
			{
				System.out.println("Queue is Empty...");
				
			}else
			{
				front ++;
				size --;
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
	   					

			