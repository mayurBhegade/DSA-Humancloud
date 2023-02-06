package Demo;



public class DynamicArrayIMPL extends DynamicArray
{
	

	@Override
	void push(int data) {
		if(current==capacity)
		{
			int temp[] = new int [capacity * 2];
			for(int i= 0 ;i<capacity;i++)
			{
				temp[i]=arr[i];
			}
			
			capacity=capacity * 2;
			arr=temp;
		}
		
		
			arr[current]=data;
			current++;
		
	}

	@Override
	void pushAtPos(int index, int data) 
	{
		if(index==capacity)
		{
			push(data);
		}
		else
		{
			arr[index]=data;
		}
		
	}

	@Override
	int size()
	{
		return current;
	}

	@Override
	int get(int index) {
		if(index<current)
		{
			return arr[index];
		}
		
		return -1;
	}

	@Override
	void show()
	{
		for(int i : arr)
		{
			System.out.println(i + " ");
		}
		
	}

	@Override
	void delete(int index) 
	{

		for(int i = index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		index--;
		
	}	
	
}
