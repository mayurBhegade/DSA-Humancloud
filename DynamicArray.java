package Demo;



abstract class DynamicArray
{
	int [] arr;
	int capacity;
	int current;
	
	public DynamicArray()
	{
		arr = new int[1];
		capacity = 1;
		current=0;
		
	}
	
	abstract void push(int data);
	
	abstract void pushAtPos(int index,int data);
	
	abstract int size();
	
	abstract int get(int index);
	
	
	abstract void show();
	abstract void delete(int index);
	
}	